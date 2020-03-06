package lv.javaguru.homework.lekcija4;

public class Stock {
    private String company;
    private double currentValue;
    private double max;
    private double min;

    public Stock(String company, int currentValue) {
        this.company = company;
        this.currentValue = currentValue;
        this.max = currentValue;
        this.min = currentValue;
    }

    public String getCompany() {
        return company;
    }

    public void updatePrice(int newValue) {
        this.currentValue = newValue;

        if (newValue > max) {
            max = newValue;
        }

        if (newValue < min) {
            min = newValue;
        }

    }
}
