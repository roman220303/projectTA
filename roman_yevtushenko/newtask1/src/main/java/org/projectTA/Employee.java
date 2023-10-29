package org.projectTA;

public class Employee {

    private String name;
    private double rate;
    private double hours;

    private static double totalSum = 0;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return 0.1 * getSalary();
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nRate: " + rate + "\nHours: " + hours + "\nSalary: " + getSalary() + "\nBonuses: " + getBonuses();
    }

    public static double getTotalSum() {
        return totalSum;
    }



}
