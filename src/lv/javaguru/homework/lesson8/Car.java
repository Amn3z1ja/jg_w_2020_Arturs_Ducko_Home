package lv.javaguru.homework.lesson8;

import java.util.Objects;

public class Car {
        int yearOfManufacturer;
        String manufacturer;

    public Car(int yearOfManufacturer, String manufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfManufacturer=" + yearOfManufacturer +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacturer == car.yearOfManufacturer &&
                Objects.equals(manufacturer, car.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfManufacturer, manufacturer);
    }
}
