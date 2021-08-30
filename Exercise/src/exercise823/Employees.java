package exercise823;

public class Employees {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private Date birthDay;
	private double salary;
	private double gender;

	public Employees(String firstName, String lastName, int gender, String socialSecurityNumber, Date birthDay,
			double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthDay = birthDay;
		this.salary = salary;
		this.gender = gender;
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

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getGender() {
		return gender;
	}

	public void setGender(double gender) {
		this.gender = gender;
	}
}
