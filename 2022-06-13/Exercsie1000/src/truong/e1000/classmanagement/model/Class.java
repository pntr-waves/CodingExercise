package truong.e1000.classmanagement.model;

import java.util.List;

public class Class {
    private String className;
    private int studentNumber;
    private List<Student> studentList;
    
    public Class (String className, List<Student> studentList) {
        this.className = className;
        this.studentList = studentList;
        this.studentNumber = studentList.size();
    }
    
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public int getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    public List<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    
}
