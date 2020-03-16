package lv.javaguru.homework.lesson3;

public class ProductTest {
    public static void main(String[] args) {
        Product productPrice = new Product();
        productPrice.setName("Milk");
        productPrice.setRegularPrice(0.80);
        productPrice.setDiscount(0.20);

        String productName = productPrice.getName();
        double actualPrice = productPrice.getRegularPrice();
        double finalDiscount = productPrice.getDiscount();

        double discountResult = productPrice.calculateActualPrice(0.8,0.2);

        System.out.println("Name:"+productName);
        System.out.println("Regular price:"+actualPrice);
        System.out.println("Discount:"+finalDiscount);
        System.out.println("Price with discount:"+discountResult);

    }
}
