package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    double salary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    public void pay() {

        System.out.println(getName() + " is paid salary " +salary);
    }

    public void payTaxes() {
         System.out.println(getName() + " taxes= salary * applicable tax rate " + TaxPayer.SALARIED_TAX_RATE);
    }


    @Override
    public String toString() {

        return super.toString() + "SalariedEmployee{" +
                "salary = " + salary+
                '}';
    }
}
