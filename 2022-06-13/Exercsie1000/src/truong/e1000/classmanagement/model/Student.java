package truong.e1000.classmanagement.model;

public class Student {
    private String name;
    private int average;
    
    public Student (String name, int average) {
        this.name = name;
        this.average = average;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAverage() {
        return average;
    }
    public void setAverage(int age) {
        this.average = age;
    }
}
