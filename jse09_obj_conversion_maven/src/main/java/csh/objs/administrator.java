package csh.objs;

/**
 * @author: cshdev110
 * @version: 0.0.1
 */

public class administrator extends Employee{
    
    private String department;

    public administrator(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Department: " + this.department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
