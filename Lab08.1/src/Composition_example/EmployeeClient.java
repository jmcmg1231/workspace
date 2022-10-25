package Composition_example;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee obj = new Employee("Juan", 10000.00, new Address("Orlando", "US"));
        System.out.println(obj.getEmployeeInfo());
    }
}
