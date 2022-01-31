package com.company;

import java.util.Arrays;
import java.util.Locale;

public class EmployeeRoster {
    //FIELDS
    private int employeeNumber;
    private final int maxNumber = 10;
    private final Employee[] employeeRoster;

    // CONSTRUCTOR
    public EmployeeRoster() {
        this.employeeRoster = new Employee[maxNumber];
    }

    // EDIT and SEARCH methods
    public void addEmployee(
            String firstName,
            String patronymic,
            String lastName,
            int department,
            float salary
    ) {
        if (employeeNumber < 10 ) {
            Employee newEmployee = new Employee(employeeNumber, firstName, patronymic, lastName, department, salary);
            employeeRoster[employeeNumber++] = newEmployee;
        } else
            throw new IllegalArgumentException("Maximum number of employee exceeded.");
    }
    public void findEmployeeByName(
            String firstName,
            String patronymic,
            String lastName
    ) {
        for (int i = 0; i < employeeNumber; i++) {
            Employee employee = employeeRoster[i];
            if (
                    (employee.getFirstName().toUpperCase().equals(firstName.toUpperCase())) &&
                  (employee.getPatronymic().toUpperCase().equals(patronymic.toUpperCase())) &&
                  (employee.getLastName().toUpperCase().equals(lastName.toUpperCase()))
            )

                    {
                System.out.println(employee.toString());
                return;
            }
        }
        System.out.println("Employee is not found.");
    }

    // PAYROLL statistics
    public double payroll() {
        double sum = 0;
        for (int i = 0; i < employeeNumber; i++)
            sum += employeeRoster[i].getSalary();
        return sum;
    }
    public String minWage() {
        float min = employeeRoster[0].getSalary();
        int employeeID = 0;
        for (int i = 1; i < employeeNumber; i++)
            if ( employeeRoster[i].getSalary() < min ) {
                min = employeeRoster[i].getSalary();
                employeeID = i;
            }
        return employeeRoster[employeeID].toString();
    }
    public String maxWage() {
        float max = employeeRoster[0].getSalary();
        int employeeID = 0;
        for (int i = 1; i < employeeNumber; i++)
            if ( employeeRoster[i].getSalary() > max ) {
                max = employeeRoster[i].getSalary();
                employeeID = i;
            }
        return employeeRoster[employeeID].toString();
    }
    public double avgWage() {
        return payroll()/(employeeNumber+1);
    }

    // Getters
    public int getMaxNumber() {
        return maxNumber;
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    // PRINT methods
    public String printEmployeeList () {
        System.out.println("\nEMPLOYEE LIST");
        System.out.println(String.format(
                "%-12s%-15s%-15s",
                "First Name","Patronymic","Last Name"));
        String message = "";
        for (int i = 0; i < employeeNumber; i++) {
            Employee employee = employeeRoster[i];
            message += employee.getFullName() + "\n";
        }
        return message;
    }
    @Override
    public String toString() {
        System.out.println("\nROSTER LIST");
        System.out.println(String.format(
            "%-5s%-12s%-15s%-15s%-15s%-10s",
            "id","First Name","Patronymic", "Last Name", "Department", "Salary"
        ));
        String message = "";
        for (int i = 0; i < employeeNumber; i++) {
            Employee employee = employeeRoster[i];
            message += employee.toString() + "\n";
        }
        return message;
    }
}
