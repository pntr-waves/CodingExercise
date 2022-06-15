package truong.e1000.employeemanagement.service;

import java.util.List;

import truong.e1000.employeemanagement.model.Employee;

public class EmployeeManagementDisplayService {
    public void printEmployeeList (List<Employee> employeeList) {
        System.out.println("List of Employee");
        for (Employee employee : employeeList) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Employee Code: " + employee.getEmployeeCode());
            System.out.println("Employee Name: " + employee.getEmployeeName());
            System.out.println("Salary: " + employee.getSalary());
        }
    }
}
