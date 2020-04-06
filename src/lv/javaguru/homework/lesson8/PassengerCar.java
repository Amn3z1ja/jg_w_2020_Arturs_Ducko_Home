package lv.javaguru.homework.lesson8;

import java.util.Objects;

public class PassengerCar extends Car {

    int maxSeats; //stāvoklim ir jābūt private

    public PassengerCar(int yearOfManufacturer, String manufacturer, int maxSeats) {
        super(yearOfManufacturer, manufacturer);
        this.maxSeats = maxSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerCar that = (PassengerCar) o;
        return maxSeats == that.maxSeats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSeats);
    }
}
