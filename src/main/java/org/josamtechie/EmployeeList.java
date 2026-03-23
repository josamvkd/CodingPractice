package org.josamtechie;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {
		
		List<Employee> employeeList =new ArrayList<>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
        employeeList.add(new Employee(288, "Jomon Samuel", 35, "Male", "Information Technology", 2026, 40000.0));
        employeeList.add(new Employee(288, "Eiden Joe Samuel", 21, "Male", "Product Development", 2026, 50000.0));

		System.out.println("1. How many male and female employees are there in the organization?");
        Map<String, Long> maleAndFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        maleAndFemaleEmployees.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
        System.out.println("2. Print the name of all departments in the organization?");
        System.out.println("--------------------------------------------------------------------------------------");
        List<String> nameOfAllDepartments = employeeList.stream().map(Employee::getDepartment).distinct().toList();
        nameOfAllDepartments.forEach(System.out::println);
        System.out.println("3. What is the average age of male and female employees?");
        System.out.println("--------------------------------------------------------------------------------------");
        Map<String, Double> averageAgeOfMaleAndFemale = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
        averageAgeOfMaleAndFemale.forEach((k,v) -> System.out.println(k+" : "+v));
		System.out.println("4. Get the details of highest paid employee in the organization?");
        System.out.println("--------------------------------------------------------------------------------------");
        Optional<Employee> highestPaidEmployee = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(highestPaidEmployee);
        System.out.println("5. Get the names of all employees who have joined after 2015?");
        System.out.println("--------------------------------------------------------------------------------------");
        List<String> namesOfAllEmployees = employeeList.stream().filter(e->e.getYearOfJoining()>2015).map(Employee::getName).toList();
        namesOfAllEmployees.forEach(System.out::println);
		System.out.println("6. Count the number of employees in each department?");
        System.out.println("--------------------------------------------------------------------------------------");
        Map<String, Long> numberOfEmployeesInEachDepartment =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        numberOfEmployeesInEachDepartment.forEach((k,v) -> System.out.println(k+" : "+v));
		System.out.println("7. What is the average salary of each department?");
        System.out.println("--------------------------------------------------------------------------------------");
        Map<String, Double> averageSalaryOfEachDepartment =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        averageSalaryOfEachDepartment.forEach((k,v)-> System.out.println(k+" : "+v));
		System.out.println("8. Get the details of youngest male employee in the product development department?");
        System.out.println("--------------------------------------------------------------------------------------");
        Optional<Employee> youngestMaleEmployee =
                employeeList.stream()
                        .filter(employee -> Objects.equals(employee.getGender(),"Male") && Objects.equals( employee.getDepartment(),"Product Development"))
                        .min(Comparator.comparingInt(Employee::getAge));
        System.out.println(youngestMaleEmployee);
		System.out.println("9. Who has the most working experience in the organization?");
        System.out.println("--------------------------------------------------------------------------------------");
        Optional<Employee> mostWorkingExperience =employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining));
        System.out.println(mostWorkingExperience);
		System.out.println("10. How many male and female employees are there in the sales and marketing team?");
        System.out.println("--------------------------------------------------------------------------------------");
        Map<String,Long> maleAndFemaleEmployeesSm = employeeList.stream()
                //.filter(employee -> employee.getDepartment()=="Sales And Marketing")
                .filter(employee -> Objects.equals(employee.getDepartment(), "Sales And Marketing"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        maleAndFemaleEmployeesSm.forEach((k,v) -> System.out.println(k+" : "+v));
		System.out.println("11. What is the average salary of male and female employees?");
        System.out.println("--------------------------------------------------------------------------------------");
        Map<String, Double> averageSalaryOfMaleAndFemaleEmployees =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        averageSalaryOfMaleAndFemaleEmployees.forEach((k,v) -> System.out.println(k+" : "+v));
		System.out.println("12. List down the names of all employees in each department?");
        System.out.println("--------------------------------------------------------------------------------------");
        Map<String, List<String>> namesOfAllEmployeesInEachDepartment =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));
        namesOfAllEmployeesInEachDepartment.forEach((k,v) ->{
            System.out.println(k);
            System.out.println("----------------");
            v.forEach(System.out::println);
            System.out.println("----------------");
        });
		System.out.println("13. What is the average salary and total salary of the whole organization?");
        System.out.println("--------------------------------------------------------------------------------------");
        DoubleSummaryStatistics averageSalaryAndTotalSalary = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Salary: "+averageSalaryAndTotalSalary.getAverage());
        System.out.println("Total Salary: "+averageSalaryAndTotalSalary.getSum());
        System.out.println("14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");
        System.out.println("--------------------------------------------------------------------------------------");
        Map<Boolean, List<Employee>> employeesWhoAreYoungerOrEqualTo_25Years =
                employeeList.stream()
                        .collect(Collectors.partitioningBy(employee -> employee.getAge() > 25));
        employeesWhoAreYoungerOrEqualTo_25Years.forEach((key,value) ->{
            if(key){
                System.out.println("Age grater than 25");
                System.out.println("#############################################");
                value.stream().map(Employee::getName).forEach(System.out::println);
            }else {
                System.out.println("Age less than than 25");
                System.out.println("#############################################");
                value.stream().map(Employee::getName).forEach(System.out::println);
            }
        });
        System.out.println("15. Who is the oldest employee in the organization? What is his age and which department he belongs to?");
        System.out.println("--------------------------------------------------------------------------------------");
        //Optional<Employee> first = employeeList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).findFirst();
        Optional<Employee> oldestEmployeeInTheOrganization = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee employee = oldestEmployeeInTheOrganization.get();
        System.out.println("Name: "+employee.getName());
        System.out.println("Age: "+employee.getAge());
        System.out.println("Department: "+employee.getDepartment());
    }

}
