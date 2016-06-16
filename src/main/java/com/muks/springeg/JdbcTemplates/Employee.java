package com.muks.springeg.JdbcTemplates;

/**
 * Created by 15692 on 16/06/16.
 */
public class Employee {
    private int id;
    private String name;
    private float salary;

    Employee() {}

    Employee(int id, String name, float sal) {
        this.id = id;
        this.name = name;
        this.salary = sal;
    }

    public void setId(int id) { this.id = id; }
    public int getId() { return this.id; }

    public void setName(String inName) { this.name = inName; }
    public String getName() { return this.name; }

    public void setSalary(float sal) { this.salary = sal; }
    public float getSalary() { return this.salary; }
}
