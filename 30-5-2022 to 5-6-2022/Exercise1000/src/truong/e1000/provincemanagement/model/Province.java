package truong.e1000.provincemanagement.model;

public class Province {
    private String provinceName;
    private double area;
    private long population;

    public Province(String provinceName, double area, long population) {
        this.provinceName = provinceName;
        this.area = area;
        this.population = population;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
