package truong.e1000.candidatemanagement.model;

public class Candidate {
    private String code;
    private String fullName;
    private double mathMark;
    private double physicMark;
    private double chemistryMark;
    private double totalMark;
    
    public Candidate (String code, String fullName, double mathMark, double physicMark, double chemistryMark) {
        this.code = code;
        this.fullName = fullName;
        this.mathMark = mathMark;
        this.physicMark = physicMark;
        this.chemistryMark = chemistryMark;
        this.totalMark = (this.mathMark + this.physicMark + this.chemistryMark);
    }
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getMathMark() {
        return mathMark;
    }
    public void setMathMark(double mathMark) {
        this.mathMark = mathMark;
    }
    public double getPhysicMark() {
        return physicMark;
    }
    public void setPhysicMark(double physicMark) {
        this.physicMark = physicMark;
    }
    public double getChemistryMark() {
        return chemistryMark;
    }
    public void setChemistryMark(double chemistryMark) {
        this.chemistryMark = chemistryMark;
    }
    public double getTotalMark() {
        return totalMark;
    }
    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }
    
    
}
