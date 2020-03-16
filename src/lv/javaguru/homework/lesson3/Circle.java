package lv.javaguru.homework.lesson3;

//izmanto ctrl + alt + l
public class Circle {

    //stāvoklim jābūt private
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //pi ir 3.14 :)
    double calculateArea() {
        return 3.13 *radius*radius;
    }
}
