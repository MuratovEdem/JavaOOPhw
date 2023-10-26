package HomeWork3;

public class Employee implements Comparable<Employee> {
    String name;
    int age;
    int salary;
    String department;

    public Employee(String name, int age, int salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("\n%s %s %d %d", name, department, age, salary);
    }

    @Override
    public int compareTo(Employee employee) {
        return this.department.compareToIgnoreCase(employee.department);
    }
}
