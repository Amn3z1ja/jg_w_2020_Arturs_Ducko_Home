package lv.javaguru.homework.lekcija4;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector colorDetector = new LightColorDetector();
            String result = colorDetector.detect( 600);
            System.out.println("Color: "+ result);
        }

    }

