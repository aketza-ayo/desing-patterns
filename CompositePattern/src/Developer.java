public class Developer implements Employee {

    private String status;
    private String name;
    private double salary;

    public Developer(String status, String name, double salary){
        this.status = status;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
        // Employee class is a leaf therefore this method is not applicable
    }

    @Override
    public void remove(Employee employee) {
        // Employee class is a leaf therefore this method is not applicable
    }

    @Override
    public Employee getChild(int i) {
        // Employee class is a leaf therefore this method is not applicable
        return null;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("----------------------------");
        System.out.println("\t" + getStatus());
        System.out.println("----------------------------");
        System.out.println("Name = " + getName());
        System.out.println("Salary = " + getSalary());
        System.out.println("-----------------------------\n");
        System.out.println();
    }
}
