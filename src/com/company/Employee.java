package com.company;

import java.util.Locale;

public class Employee {
    //FIELDS
    private final int employeeId;
    private final String firstName;
    private final String patronymic;
    private final String lastName;
    int department;
    float salary;

    // CONSTRUCTOR
    public Employee(
            int id,
            String firstName,
            String patronymic,
            String lastName,
            int department,
            float salary ) {

        if ((department < 1) || (department > 5))
            throw new IllegalArgumentException("Неверно указан номер отдела");

        this.employeeId = id;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    //GETTERS
    public String getFirstName() { return this.firstName; }
    public String getPatronymic() { return this.patronymic; }
    public String getLastName() { return this.lastName; }
    public int getDepartment() { return this.department; }
    public float getSalary() {
        return this.salary;
    }
    public int getId() {
        return this.employeeId;
    }

    // SETTERS
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    // PRINT methods
    public String getFullName() {
         return String.format(
                 "%-12s%-15s%-15s",
                 this.firstName, this.patronymic, this.lastName
         );

    }
    @Override
    public String toString() {
/*        return "Employee{" +
                "id='" + this.employeeId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
*/        return String.format(
                "%-5d%-12s%-15s%-15s%-15d$%,-8.2f",
                this.employeeId, this.firstName, this.patronymic, this.lastName, this.department, this.salary
                );
    }
}
