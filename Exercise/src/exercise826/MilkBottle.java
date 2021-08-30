package exercise826;

public class MilkBottle {
	private String brand;
	private double weight;
	private Date expirationTime;

	public MilkBottle(String brand, double weight, Date expirationTime) {
		this.brand = brand;
		this.weight = weight;
		this.expirationTime = expirationTime;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Date getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}
}
