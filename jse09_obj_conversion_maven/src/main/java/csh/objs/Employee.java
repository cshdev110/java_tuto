package csh.objs;

/**
 * author: cshdev110
 * version: 0.0.1
 */

public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getDetails() {
        return "Name: " + this.name + ", Salary: " + this.salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
}
