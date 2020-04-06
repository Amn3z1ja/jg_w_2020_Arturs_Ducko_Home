package lv.javaguru.homework.lesson8;

import java.util.Objects;  //neizmantots imports - dzēst

public class Buss extends Car {
    int totalWeight; //jābūt private - inkapsulācija

    public Buss(int yearOfManufacturer, String manufacturer, int totalWeight) {
        super(yearOfManufacturer, manufacturer);
        this.totalWeight = totalWeight;
    }

    @Override
    public String toString() {
        return "Buss{" +
                "totalWeight=" + totalWeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Buss buss = (Buss) o;
        return totalWeight == buss.totalWeight;
    }

}
