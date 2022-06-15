package truong.e1000.employeemanagement.model;

public class Employee {
    private String employeeCode;
    private String employeeName;
    private double salary;
    
    public Employee (String employeeCode, String employeeName, double salary) {
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    
    public String getEmployeeCode() {
        return employeeCode;
    }
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
