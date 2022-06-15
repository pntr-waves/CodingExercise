/*
 * 834. Write the program with requirements: 
 * a. Declare a object represent Employee with informations:
 * - Employee code: sequence character type
 * - Full name: sequence character type
 * - Salary: real number type
 * b. Show list of employee whom have the highest salary
 * c. Sort list by employee's salary with ascending order
 */
package truong.e1000.employeemanagement;

import truong.e1000.employeemanagement.service.EmployeeManagementDisplayService;
import truong.e1000.employeemanagement.service.EmployeeManagementService;

public class EmployeeManagementApp {
    public static void main(String[] args) {
        EmployeeManagementService service = new EmployeeManagementService();
        EmployeeManagementDisplayService display = new EmployeeManagementDisplayService();
        System.out.println("1. List of Greatest salary employee");
        System.out.println("==============================================================");
        display.printEmployeeList(service.getGreatestSalaryEmployeeList());
        System.out.println("\n2. Number of Employee: " + service.countEmployee());
        System.out.println("==============================================================");
        System.out.println("\n3. Sort Employee List by salary asceding");
        System.out.println("==============================================================");
        display.printEmployeeList(service.sortBySalary());
    }
}
