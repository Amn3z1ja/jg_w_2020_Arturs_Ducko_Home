package lv.javaguru.homework.lesson3;

public class CarTest {
    public static void main(String[] args) {
        Car mycar = new Car(); //camelCase - myCar
        mycar.setColor("blue");
        mycar.setManufacturer("BMW");
        mycar.setYear(2000);

        String colorOfMyCar = mycar.getColor();
        String manufacturerOfMyCar = mycar.getManufacturer();

        int carYear = mycar.getYear();


        System.out.println("I have  "+ manufacturerOfMyCar+", it's in "+colorOfMyCar+ " color and year of manufacture is "+carYear+"!");
    }
}
