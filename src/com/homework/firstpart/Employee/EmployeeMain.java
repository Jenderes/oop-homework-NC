package com.homework.firstpart.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("======== Class Employee ========");
        Employee employee = new Employee(1, "Albert", "Einstein", 2500);
        employee.setSalary(3000);
        employee.raiseSalary(30);
        System.out.println("id = " + employee.getId()+" ,Full name = " +employee.getName() +", salary = "+ employee.getSalary());
    }
}
