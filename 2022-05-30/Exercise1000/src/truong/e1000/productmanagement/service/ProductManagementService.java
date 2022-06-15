package truong.e1000.productmanagement.service;

import java.util.ArrayList;
import java.util.List;

import truong.e1000.productmanagement.data.ProductDataTestingBuilder;
import truong.e1000.productmanagement.model.Product;

public class ProductManagementService {

    public int countProductsHasQuantityGreaterthan1000() {
        List<Product> productList = ProductDataTestingBuilder.getProductList();
        int counter = 0;

        for (Product product : productList) {
            if (product.getQuantity() >= 1000) {
                counter++;
            }
        }

        return counter;
    }

    public List<Product> getBiggestQuantityProductList() {
        List<Product> productList = ProductDataTestingBuilder.getProductList();
        sortByQuantity(productList, 0, productList.size() - 1);
        int mostQuantity = productList.get(productList.size() - 1).getQuantity();

        List<Product> rs = new ArrayList<>();
        for (Product product : productList) {
            if (product.getQuantity() == mostQuantity) {
                rs.add(product);
            }
        }

        return rs;
    }

    void sortByQuantity(List<Product> productList, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            sortByQuantity(productList, left, mid);
            sortByQuantity(productList, mid + 1, right);

            mergeByQuantity(productList, left, mid, right);
        }
    }

    private void mergeByQuantity(List<Product> productList, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        List<Product> leftArr = new ArrayList<>();
        List<Product> rightArr = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            leftArr.add(productList.get(i + left));
        }

        for (int i = 0; i < n2; i++) {
            rightArr.add(productList.get(i + mid + 1));
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr.get(i).getQuantity() < rightArr.get(j).getQuantity()) {
                productList.set(k, leftArr.get(i));
                i++;
            } else {
                productList.set(k, rightArr.get(j));
                j++;
            }

            k++;
        }

        while (i < n1) {
            productList.set(k, leftArr.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            productList.set(k, rightArr.get(j));
            j++;
            k++;
        }
    }
}
