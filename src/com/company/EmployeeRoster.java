package com.company;

public class EmployeeRoster {

    private final Employee[] employeeRoster;
    private int rosterLength = 0;

    public EmployeeRoster() {
        this.employeeRoster = new Employee[10];
    }

    public void addEmployee(
            String fullName,
            int department,
            float salary
    ) {
        Employee newEmployee = new Employee(fullName, department, salary);
        rosterLength = newEmployee.getEmployeeID();
        employeeRoster[rosterLength] = newEmployee;
    }
    public void findEmployeeByName(
            String fullName
    ) {
        for (int i = 0; i <= rosterLength; i++) {
            Employee employee = employeeRoster[i];
            if (employee.getFullName().toUpperCase().equals(fullName.toUpperCase())) {
                System.out.println(employee.toString());
                return;
            }
        }
        System.out.println("Employee is not found.");
    }

    public double payroll() {
        double sum = 0;
        for (int i = 0; i <= rosterLength; i++)
            sum += employeeRoster[i].getSalary();
        return sum;
    }
    public String minWage() {
        float min = employeeRoster[0].getSalary();
        int employeeID = 0;
        for (int i = 1; i <= rosterLength; i++)
            if ( employeeRoster[i].getSalary() < min ) {
                min = employeeRoster[i].getSalary();
                employeeID = i;
            }
        return employeeRoster[employeeID].toString();
    }
    public String maxWage() {
        float max = employeeRoster[0].getSalary();
        int employeeID = 0;
        for (int i = 1; i <= rosterLength; i++)
            if ( employeeRoster[i].getSalary() > max ) {
                max = employeeRoster[i].getSalary();
                employeeID = i;
            }
        return employeeRoster[employeeID].toString();
    }
    public double avgWage() {
        return payroll()/(rosterLength+1);
    }

    public String printEmployeeList () {
        System.out.println("\nEMPLOYEE LIST");
        String message = "";
        for (int i = 0; i <= rosterLength; i++) {
            Employee employee = employeeRoster[i];
            message += employee.getFullName() + "\n";
        }
        return message;
    }
    @Override
    public String toString() {
        System.out.println("\nROSTER LIST");
        System.out.println(String.format(
            "%-5s%-35s%-15s%-10s",
            "id","Name", "Department", "Salary"
        ));
        String message = "";
        for (int i = 0; i <= rosterLength; i++) {
            Employee employee = employeeRoster[i];
            message += employee.toString() + "\n";
        }
        return message;
    }
}
