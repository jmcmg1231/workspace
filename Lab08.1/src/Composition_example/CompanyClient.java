package Composition_example;

public class CompanyClient {
    public static void main(String[] args) {
        Company obj = new Company("verizon");
        System.out.println(obj.getCompanyName());
        Employee obj2 = new Employee("Juan", 10000.00, new Address("Orlando", "US"));
        Employee obj3 = new Employee("Rob", 12000, new Address("Seattle", "Us"));
        obj.addEmployee(obj2);
        obj.addEmployee(obj3);
        System.out.println(obj.computeTotalSalaryOfAllEmployees());

    }
}
