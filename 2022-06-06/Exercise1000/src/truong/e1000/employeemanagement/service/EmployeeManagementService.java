package truong.e1000.employeemanagement.service;

import java.util.ArrayList;
import java.util.List;

import truong.e1000.employeemanagement.data.EmployeeDataTestingBuilder;
import truong.e1000.employeemanagement.model.Employee;

public class EmployeeManagementService {
    
    public List<Employee> getGreatestSalaryEmployeeList () {
        List<Employee> employeeList = EmployeeDataTestingBuilder.getEmployeeList();
        double greatestSalary = getGreatestSalary(employeeList);
        List<Employee> result = new ArrayList<>();
        
        for (Employee employee : employeeList) {
            if (employee.getSalary() == greatestSalary) {
                result.add(employee);
            }
        }
        
        return result;
    }
    
    double getGreatestSalary (List<Employee> employeeList) {
        return sortBySalary(employeeList).get(employeeList.size() - 1).getSalary();
    }
    
    public int countEmployee () {
        List<Employee> employeeList = EmployeeDataTestingBuilder.getEmployeeList();
        return employeeList.size();
    }
    
    public List<Employee> sortBySalary () {
        List<Employee> employeeList = EmployeeDataTestingBuilder.getEmployeeList();
        return sortBySalary(employeeList);
        
    }
    
    List<Employee> sortBySalary (List<Employee> employeeList) {
        int length = employeeList.size();
        
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapifyBySalary(employeeList, length, i);
        }
        
        for (int i = length - 1; i > 0; i--) {
            Employee temp = employeeList.get(0);
            employeeList.set(0, employeeList.get(i));
            employeeList.set(i, temp);
            heapifyBySalary(employeeList, i, 0);
        }
        
        return employeeList;
    }
    
    void heapifyBySalary (List<Employee> employeeList, int length, int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        
        if (left < length && employeeList.get(largest).getSalary() < employeeList.get(left).getSalary()) {
            largest = left;
        }
        
        if (right < length && employeeList.get(largest).getSalary() < employeeList.get(right).getSalary()) {
            largest = right;
        }
        
        if (largest != index) {
            Employee temp = employeeList.get(largest);
            employeeList.set(largest, employeeList.get(index));
            employeeList.set(index, temp);
            
            heapifyBySalary(employeeList, length, largest);
        }
    }
}
