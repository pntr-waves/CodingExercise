/* 839. Write a program to the following:
 * a. Create Province object with: 
 * - Province Name: String type
 * - Area:  real number type
 * - Population: integer type
 * b. Calculation total area of provinces in list.
 * c. Find a province has the greatest area.
 * d. Sort a list with ascending order by area.
 * */

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
