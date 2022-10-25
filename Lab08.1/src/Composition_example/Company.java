package Composition_example;

public class Company {
    private String companyName;
    private Employee[] employees = new Employee[100];
    private int employee_counter = 0;


    public Company(String companyName) {
        this.companyName = companyName;

    }

    public void addEmployee(Employee employee) {
       this.employees[employee_counter++] = employee;

    }


    public double computeTotalSalaryOfAllEmployees() {
        double totalSalary = 0;
        for(Employee emp : this.employees) {
            if(emp != null) {
               totalSalary += emp.getSalary();
            }
        }
        return totalSalary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
