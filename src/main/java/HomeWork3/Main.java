package HomeWork3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            employeeList.add(new Employee("name " + i, rand.nextInt(18, 50), rand.nextInt(5000, 20000), "department " + i));
        }

        System.out.println(employeeList);

        Collections.sort(employeeList); // в лексикографическом порядке
        System.out.println(employeeList);

        employeeList.sort(new SalaryComparator()); // по убыванию зарплаты
        System.out.println(employeeList);

        employeeList.sort(new AgeComparator()); // по возрастанию возраста
        System.out.println(employeeList);


    }
}
