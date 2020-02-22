package lv.javaguru.homework.lekcija3;

public class CircleTest {
    public static void main(String[] args) {
        Circle mycircle = new Circle();
        mycircle.radius = 10;

//        double circleResult = mycircle.getRadius();
        double circleResult = mycircle.calculateArea();
        System.out.println("Circle radius"+circleResult);

    }
}
