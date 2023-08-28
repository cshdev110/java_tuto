package csh.employeeObj;

/**
 * @author cshdev110
 * @version 1.0
 */

public class Employee {
    private String name;
    private String surname;
    private String department;
    private double salary;

    public Employee(String name, String surname, double salary, String department) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return String.format("%s %s", this.name, this.surname);
    }

    public void setName(String name) {
        if (name.length() > 2) {
            this.name = name;
        } else {
            System.out.println("Name must be longer than 2 characters");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.length() > 2) {
            this.surname = surname;
        } else {
            System.out.println("Surname must be longer than 2 characters");
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s, %.1f", this.name, this.surname, this.department, this.salary);
    }
}
