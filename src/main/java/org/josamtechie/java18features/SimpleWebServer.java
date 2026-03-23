package org.josamtechie.java18features;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleWebServer
{
    public static void main(String[] args) throws IOException
    {
        // 🚀 1. Simple Web Server (New Feature)
        // 👉 Package: com.sun.net.httpserver
        //  Java 18 introduced a minimal HTTP static file server via command line.
        // ✅ Run from terminal:
        // </> Bash
        // > jwebserver
        // Starts a server at: http://localhost:8000
        // Serves current directory files
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/", exchange -> {
            String response = "Hello from Java 18!";
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        });

        server.start();
        System.out.println("Server started at http://localhost:8000");
    }
}
