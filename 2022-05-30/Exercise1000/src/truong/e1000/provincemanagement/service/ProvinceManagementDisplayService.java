package truong.e1000.provincemanagement.service;

import java.util.List;

import truong.e1000.provincemanagement.model.Province;

public class ProvinceManagementDisplayService {
    public void printProvinceList(List<Province> provinceList) {
        System.out.println("\nList of Province");
        for (Province province : provinceList) {
            System.out.println("--------------------------------");
            System.out.println("Province name: " + province.getProvinceName());
            System.out.println("Area: " + province.getArea());
            System.out.println("Population: " + province.getPopulation());
        }
    }
}
