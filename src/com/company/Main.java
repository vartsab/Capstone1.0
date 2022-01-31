package com.company;

public class Main {

    public static void main(String[] args) {

        EmployeeRoster employeeRoster = new EmployeeRoster();

        employeeRoster.addEmployee("Ivan", "Ivanovich", "Ivanov", 5, 1214);
        employeeRoster.addEmployee("Petr", "Petrovich", "Petrov", 3, 3010);
        employeeRoster.addEmployee("Sidor", "Sidorovich", "Sidorov", 4, 2999);
        employeeRoster.addEmployee("Bogdan", "Bogdanovich", "Bogdanov", 1, 3000);
        employeeRoster.addEmployee("Vasily", "Vasilievich", "Vasiliev", 2, 3939);
        employeeRoster.addEmployee("Zinoviy", "Zinovievich", "Zinoviev", 1, 3999);
        employeeRoster.addEmployee("Olga", "Olgovna", "Olgova", 2, 2999);
        employeeRoster.addEmployee("Natasha", "Natashevna", "Natasheva", 3, 4001);
        employeeRoster.addEmployee("Marina", "Marinovna", "Marinina", 4, 3001);
        employeeRoster.addEmployee("Anna", "Annovna", "Aneva", 5, 12121);

        //1
        System.out.println(employeeRoster);
        //2
        System.out.println("\nMonthly payroll is " + String.format("$%,.2f", employeeRoster.payroll()) + ".");
        //3
        System.out.println("\nThe employee with the minimal wage is:");
        System.out.println(String.format(
                "%-5s%-12s%-15s%-15s%-15s%-10s",
                "id","First Name","Patronymic", "Last Name", "Department", "Salary"
        ));
        System.out.println(employeeRoster.minWage());
        //4
        System.out.println("\nThe employee with the maximal wage is:");
        System.out.println(String.format(
                "%-5s%-12s%-15s%-15s%-15s%-10s",
                "id","First Name","Patronymic", "Last Name", "Department", "Salary"
        ));
        System.out.println(employeeRoster.maxWage() + ".");
        //5
        System.out.println("\nAverage wage is " + String.format("$%,.2f", employeeRoster.avgWage()) + ".");
        //6
        System.out.println(employeeRoster.printEmployeeList());
        //
        String search = "Bogdan Bogdanovich Bogdanov";
        String[] searchSplit = new String[3];
        searchSplit = search.split(" ");
        System.out.println("\nSearch result for " + search + " (First_Name Patronymic Last_Name) is:");
        System.out.println(String.format(
                "%-5s%-12s%-15s%-15s%-15s%-10s",
                "id","First Name","Patronymic", "Last Name", "Department", "Salary"
        ));

        employeeRoster.findEmployeeByName(searchSplit[0], searchSplit[1], searchSplit[2]);

    }
}
