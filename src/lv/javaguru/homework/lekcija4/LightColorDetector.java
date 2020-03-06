package lv.javaguru.homework.lekcija4;

//ok
public class LightColorDetector {

    public String detect(int wavelength) {
        if (wavelength <= 380) {
            return "Violet";
        }
        if (wavelength <= 450) {
            return "Blue";
        }
        if (wavelength <= 495) {
            return "Green";
        }
        if (wavelength <= 570) {
            return "Yellow";
        }
        if (wavelength <= 590) {
            return "Orange";
        }
        if (wavelength <= 620) {
            return "Red";
        }
        return "White";

    }
}

