package csh.polymorphism;

/**
 * @author csh.dev
 * @version 0.0.1
 */

public class Administrator extends Employee{
    private String department;

    public Administrator(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\nDepartment: " + department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department != null && !department.isEmpty()) {
            this.department = department;
        }
    }
}
