package org.projectTA;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String name;
    private LocalDate birthYear;

    public Person() {
    }

    public Person(String name, LocalDate birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int age() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - birthYear.getYear();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter birth year (yyyy-mm-dd): ");
        String birthYearString = scanner.nextLine();
        this.birthYear = LocalDate.parse(birthYearString);
    }

    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + age() + " years");
    }

    public void changeName(String newName) {
        this.name = newName;
    }

}
