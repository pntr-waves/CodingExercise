package truong.e1000.essaymanagement.model;

public class Essay {
    private String code;
    private String essayName;
    private String studentName;
    private String teacherName;
    private long year;
    
    public Essay (String code, String essayName, String studentName, String teacherName, long year) {
        this.code = code;
        this.essayName = essayName;
        this.studentName = studentName;
        this.teacherName = teacherName;
        this.year = year;
    }
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getEssayName() {
        return essayName;
    }
    public void setEssayName(String essayName) {
        this.essayName = essayName;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public long getYear() {
        return year;
    }
    public void setYear(long year) {
        this.year = year;
    }
}
