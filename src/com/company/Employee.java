package com.company;

public class Employee {

    private static int employeeCounter = 0;

    private final int employeeID;
    private final String fullName;
    int department;
    float salary;

    public Employee(
            String fullName,
            int department,
            float salary ) {

        if ( employeeCounter > 10 )
            throw new IllegalArgumentException("Maximum number of employee exceeded.");
        if ((department < 1) || (department > 5))
            throw new IllegalArgumentException("Wrong department number (1-5).");

        this.employeeID = employeeCounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() { return this.fullName; }
    public int getDepartment() { return this.department; }
    public float getSalary() { return this.salary; }
    public int getEmployeeID() { return this.employeeID; }

    public void setDepartment(int department) { this.department = department; }
    public void setSalary(float salary) { this.salary = salary; }

    @Override
    public String toString() {
        return String.format(
                "%-5d%-35s%-15d$%,-8.2f",
                this.employeeID, this.fullName, this.department, this.salary
                );
    }
}
