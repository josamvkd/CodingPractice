package org.josamtechie.java8features.stream.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo
{

    public static void main(String[] args)
    {

        Customer customer = new Customer(101, "Eiden Joe Samuel", null, Arrays.asList("971565634575", "971561134576"));
        // 3(Three) ways to create optional object
        // 1. empty() - Returns an empty Optional instance.
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
        // 2. of(T value) - Returns an Optional describing the given non-null value.
        // if we know the object we are passing is non-null then use this method
        Optional<String> nameOptional = Optional.of(customer.getName());
        System.out.println(nameOptional);
        // 3. ofNullable(T value) - Returns an Optional describing the given value, if non-null, otherwise returns an empty Optional.
        // if we don't know the object we are passing is non-null then use this method
        Optional<String> emailOptional = Optional.ofNullable(customer.getEmail());
        System.out.println(emailOptional);
        //-------------------------------------------
        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
        /*
            if(emailOptional2.isPresent()){
            System.out.println(emailOptional2.get());
            }
        */
        emailOptional2.ifPresent(System.out::println);

        Optional<String> emailOptional3 = Optional.ofNullable(customer.getEmail());
        System.out.println(emailOptional2.orElse("default.email@gmail.com"));
        //System.out.println(emailOptional2.orElseThrow(() -> new IllegalArgumentException("email not present")));
        Optional<String> nameOptional2 = Optional.ofNullable(customer.getName());
        System.out.println(nameOptional2.orElse("default.name@gmail.com"));
        System.out.println(nameOptional2.map(String::toUpperCase).orElseGet(() -> "default email"));

        // Optional with Stream
        List<String> names = Arrays.asList("John", "David", "Jomon");
        Optional<String> result =
                names.stream()
                        .filter(n -> n.startsWith("J"))
                        .findFirst();
        result.ifPresent(System.out::println);
        // findFirst Return Optional
        Optional<Integer> number =
                Stream.of(1, 2, 3, 4, 5)
                        .filter(n -> n > 3)
                        .findFirst();
        System.out.println(number.orElse(0));
        // Optional + map() - Transforms value if present
        Optional<String> name = Optional.of("jomon");
        Optional<String> upper = name.map(String::toUpperCase);
        System.out.println(upper.get());

        // Stream + Optional
        // Find maximum salary
        List<Integer> salaries = Arrays.asList(20000,50000,70000);
        Optional<Integer> maxSalary =
                salaries.stream()
                        .max(Integer::compareTo);
        System.out.println(maxSalary.orElse(0));

       // Stream
        getCustomerByEmailId("josamvkd@test.com");
    }

    public static void getCustomerByEmailId(String emailId){
        List<Customer> customerList = DataBase.getAllCustomers();
        customerList.stream()
                .filter(email -> email.getEmail().equals(emailId))
                .findAny()
                .orElseThrow(() -> new RuntimeException(STR."customer not present with emailId : \{emailId}"));
    }
}
