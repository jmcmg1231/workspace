package Composition_example;

public class Employee {
    private String name;
    private double salary;
    private Address address;

    public Employee(String name, double salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    //returns all employee info including address
    public String getEmployeeInfo() {
        String info = "Employee inf Name:" + getName() + " Salary: "+getSalary()+" "+address.getAddressInfo();
        return info;
    }
}
