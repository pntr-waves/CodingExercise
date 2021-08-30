package exercise824;

public class Student {
	private String firstName;
	private String lastName;
	private double mathMark;
	private double literatureMark;
	private double averageMark;

	public Student(String firstName, String lastName, double mathMark, double literatureMark) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mathMark = mathMark;
		this.literatureMark = literatureMark;
		this.literatureMark = (mathMark + literatureMark) / 2;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMathMark() {
		return mathMark;
	}

	public void setMathMark(double mathMark) {
		this.mathMark = mathMark;
	}

	public double getLiteratureMark() {
		return literatureMark;
	}

	public void setLiteratureMark(double literatureMark) {
		this.literatureMark = literatureMark;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}

}
