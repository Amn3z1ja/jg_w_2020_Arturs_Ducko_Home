package lv.javaguru.homework.lekcija3;

public class ProductTest {
    public static void main(String[] args) {
        Product microdot = new Product();
        microdot.setName("Milk");
        microdot.setRegularPrice(0.80);
        microdot.setDiscount(0.20);

        String productName = microdot.getName();
        double actualPrice = microdot.getRegularPrice();
        double finalDiscount = microdot.getDiscount();

        double discountResult = microdot.calculateActualPrice(0.8,0.2);

        System.out.println("Name:"+productName);
        System.out.println("Regular price:"+actualPrice);
        System.out.println("Discount:"+finalDiscount);
        System.out.println("Price:"+discountResult);

    }
}
