package lv.javaguru.homework.lesson3;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car(); //camelCase - myCar
        myCar.setColor("blue");
        myCar.setManufacturer("BMW");
        myCar.setYear(2000);

        String colorOfMyCar = myCar.getColor();
        String manufacturerOfMyCar = myCar.getManufacturer();

        int carYear = myCar.getYear();


        System.out.println("I have  "+ manufacturerOfMyCar+", it's in "+colorOfMyCar+ " color and year of manufacture is "+carYear+"!");
    }
}
