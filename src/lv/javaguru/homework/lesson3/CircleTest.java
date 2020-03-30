package lv.javaguru.homework.lesson3;

public class CircleTest {
    public static void main(String[] args) {
        Circle myCircle = new Circle(); //camelCase - myCircle
        myCircle.radius = 10;

        //aizkomentēto kodu izdzēs, neatstāj

        double circleResult = myCircle.calculateArea();
        System.out.println("Circle radius "+circleResult);

    }
}
