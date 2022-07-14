package truong.e1000.provincebinarytree.model;

public class Province {
    private String provinceCode;
    private String provinceName;
    private int population;
    private double area;
    
    public Province (String provinceCode, String provinceName, int population, double area) {
        this.setProvinceCode(provinceCode);
        this.setProvinceName(provinceName);
        this.setPopulation(population);
        this.setArea(area);
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
