package seminars.first.Shop;

import java.util.Arrays;
import java.util.List;

public class ShopTest {
    public static void main(String[] args) {
        testShopStoresCorrectListOfProducts();
        testGetMostExpensiveProduct();
        testSortProductsByPrice();
    }


    //   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
    public static void testShopStoresCorrectListOfProducts() {
        Product product1 = new Product();
        product1.setCost(10);
        product1.setTitle("Product 1");

        Product product2 = new Product();
        product2.setCost(20);
        product2.setTitle("Product 2");

        List<Product> productList = Arrays.asList(product1, product2);
        Shop shop = new Shop();
        shop.setProducts(productList);

        List<Product> storedProducts = shop.getProducts();

        assert storedProducts.size() == productList.size() : "Test Failed: Shop does not store correct list of products";
        System.out.println("Test Passed: Shop stores correct list of products");
    }

    //   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
    public static void testGetMostExpensiveProduct() {
        Product product1 = new Product();
        product1.setCost(10);
        product1.setTitle("Product 1");

        Product product2 = new Product();
        product2.setCost(20);
        product2.setTitle("Product 2");

        Product product3 = new Product();
        product3.setCost(15);
        product3.setTitle("Product 3");

        List<Product> productList = Arrays.asList(product1, product2, product3);
        Shop shop = new Shop();
        shop.setProducts(productList);

        Product mostExpensiveProduct = shop.getMostExpensiveProduct();

        assert mostExpensiveProduct.equals(product2) : "Test Failed: Incorrect most expensive product returned";
        System.out.println("Test Passed: Correct most expensive product returned");
    }
    //   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
    public static void testSortProductsByPrice() {
        Product product1 = new Product();
        product1.setCost(10);
        product1.setTitle("Product 1");

        Product product2 = new Product();
        product2.setCost(20);
        product2.setTitle("Product 2");

        Product product3 = new Product();
        product3.setCost(15);
        product3.setTitle("Product 3");

        List<Product> productList = Arrays.asList(product1, product2, product3);
        Shop shop = new Shop();
        shop.setProducts(productList);

        List<Product> sortedProducts = shop.sortProductsByPrice();

        assert sortedProducts.equals(Arrays.asList(product1, product3, product2)) : "Test Failed: Products not sorted correctly by price";
        System.out.println("Test Passed: Products sorted correctly by price");
    }

}