package src.Lesson9_BinarySearch;

import java.util.*;

public class BinarySearchExample {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(-3);
//        arrayList.add(8);
//        arrayList.add(12);
//        arrayList.add(-8);
//        arrayList.add(0);
//        arrayList.add(5);
//        arrayList.add(10);
//        arrayList.add(1);
//        arrayList.add(150);
//        arrayList.add(-30);
//        arrayList.add(19);
//        Collections.sort(arrayList);
//        int index1 = Collections.binarySearch(arrayList, 12);
//        System.out.println(index1);

        Employee Emp1 = new Employee(100, "Kamal", 123456);
        Employee Emp2 = new Employee(15, "Ferid", 6542);
        Employee Emp3 = new Employee(123, "Ayxan", 8542);
        Employee Emp4 = new Employee(15, "Qasan", 5678);
        Employee Emp5 = new Employee(182, "Narmin", 125);
        Employee Emp6 = new Employee(15, "Yusif", 9874);
        Employee Emp7 = new Employee(250, "Shalala", 1579);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(Emp1);
        employeeList.add(Emp2);
        employeeList.add(Emp3);
        employeeList.add(Emp4);
        employeeList.add(Emp5);
        employeeList.add(Emp6);
        employeeList.add(Emp7);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);

        Collections.reverse(employeeList);
        System.out.println(employeeList);
        Collections.shuffle(employeeList);
        System.out.println(employeeList);

        int index = Collections.binarySearch(employeeList, new Employee(182, "Narmin", 125));
        System.out.println(index);

        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array, 150);
        System.out.println("Index of element == 150 : " + index3);

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}