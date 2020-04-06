package lv.javaguru.homework.lesson8;

import java.util.Objects;

public class HeavyCar extends Car {
    double cargoWeight;

    public HeavyCar(int yearOfManufacturer, String manufacturer, double cargoWeight) {
        super(yearOfManufacturer, manufacturer);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public String toString() {
        return "HeavyCar{" +
                "cargoWeight=" + cargoWeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HeavyCar heavyCar = (HeavyCar) o;
        return Double.compare(heavyCar.cargoWeight, cargoWeight) == 0;
    }


}
