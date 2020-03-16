package lv.javaguru.homework.lesson3;

public class Product {
    //stāvokļiem jābūt "private"
    String name;
    double regularPrice;
    double discount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    //atkaidei bija jābūt šādā izskatā "20%"
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double calculateActualPrice(double regularPrice, double discount) {
        double discountResult = regularPrice - (regularPrice * discount); //nav nepieciešams atsevišķš mainīgais - uzreiz atgriez izteiksmi
        return discountResult;
    }
}
