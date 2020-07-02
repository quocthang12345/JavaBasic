package model;

import java.util.Objects;

public class Employee extends Person {
    private String IDemployee;
    private String salary;
    public Employee()
    {

    }
    public Employee(String IDemployee, String salary) {
        this.IDemployee = IDemployee;
        this.salary = salary;
    }

    public Employee(String name, int age, String address, String IDemployee, String salary) {
        super(name, age, address);
        this.IDemployee = IDemployee;
        this.salary = salary;
    }


    public Employee(int age, String IDemployee, String salary) {
        super(age);
        this.IDemployee = IDemployee;
        this.salary = salary;
    }

    public String getIDemployee() {
        return IDemployee;
    }

    public void setIDemployee(String IDemployee) {
        this.IDemployee = IDemployee;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public void Out() {
        super.Out();
        System.out.println("ID employee: " + IDemployee );
        System.out.println("Salary: " + salary);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return getIDemployee().equals(employee.getIDemployee()) &&
                getSalary().equals(employee.getSalary());
    }

    @Override
    public String toString() {
        return super.toString()+"Employee{" +
                "IDemployee='" + IDemployee + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
