package lv.javaguru.homework.lekcija3;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }
    public void setRegularPrice(double regularPrice){
    this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calculateActualPrice(double regularPrice, double discount ){
        double discountResult = regularPrice * discount;
        return discountResult;
    }
}
