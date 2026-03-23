package org.josamtechie.java8features.stream.MapVsFlatMap;

import java.util.List;

public class MapVsFlatMap
{
    public static void main(String[] args)
    {
        List<Customer> customerList = DataBase.getAllCustomers();

        // Data Transformation
        List<String> emailList = customerList.stream().map(Customer::getEmail).toList();
        System.out.println(emailList);

        List<List<String>> phoneNumbers = customerList.stream().map(Customer::getPhoneNumber).toList();
        System.out.println(phoneNumbers);

        // Data Flattering
        List<String> phone = customerList.stream().flatMap(customer -> customer.getPhoneNumber().stream()).toList();
        System.out.println(phone);
    }
}
