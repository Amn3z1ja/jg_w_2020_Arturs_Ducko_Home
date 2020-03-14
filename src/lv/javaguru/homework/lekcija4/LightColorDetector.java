package lv.javaguru.homework.lekcija4;

//ok
public class LightColorDetector {

    public String detect(int wavelength) {

        if (wavelength > 380 && wavelength <= 449) {
            return "Violet";
        }
        if (wavelength > 450 && wavelength <= 495) {
            return "blue";
        }
        if (wavelength > 495 && wavelength <= 570) {
            return "green";
        }
        if (wavelength > 570 && wavelength <= 590) {
            return "yellow";
        }
        if (wavelength > 590 && wavelength <= 620) {
            return "orange";
        }
        if (wavelength > 620 && wavelength <= 750) {
            return "red";
        }
        return "random";

    }
}

