import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private String status;
    private String name;
    private double salary;
    private List<Employee> employees = new ArrayList<>();

    public Manager(String status, String name, double salary){
        this.status = status;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }

    @Override
    public String getStatus(){
        return this.status;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void print() {
        System.out.println("-----------------------------");
        System.out.println("\t" + getStatus());
        System.out.println("-----------------------------");
        System.out.println("Name = " + getName());
        System.out.println("Salary = " + getSalary());
        System.out.println("----------------------------\n");
        System.out.println();

        for(Employee employee : employees){
            employee.print();
        }
    }
}
