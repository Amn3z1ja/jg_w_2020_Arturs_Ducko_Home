package lv.javaguru.homework.lekcija4;

//šeit ir jāpārbauda katrs viļņa garums, ne tikai viens variants
public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector colorDetector = new LightColorDetector();
            String result = colorDetector.detect( 600);
            System.out.println("Color: "+ result);
        }

    }

