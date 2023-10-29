package org.projectTA;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Practical task
        Employee[] employees = new Employee[3];

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter information for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Hours: ");
            double hours = scanner.nextDouble();
            employees[i] = new Employee(name, rate, hours);
        }

        System.out.println("\nInformation about employees:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":\n" + employees[i]);
        }

        System.out.println("\nTotal salary of all workers: " + Employee.getTotalSum());


        //Homework
        /*Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            people[i] = new Person();
            System.out.println("Enter information for person " + (i + 1) + ":");
            people[i].input();
        }

        System.out.println("\nInformation about people:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            people[i].output();
        }

        Person person1 = new Person("roro", LocalDate.of(2002,5,5));
        person1.output();*/
    }
}