package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    double rate;
    double hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        this.rate = rate;
        this.hours = hours;
    }

    public void pay() {
        System.out.println(getName() + " is paid hourly " + (rate * hours));
    }

    public void payTaxes() {
        System.out.println(getName() + " taxes= salary * applicable tax rate " + TaxPayer.HOURLY_TAX_RATE);
    }

    @Override
    public String toString() {

        return super.toString() + "HourlyEmployee{" +
                "rate = " + rate + " " +
                ", hours = " + hours +
                '}';
    }
}
