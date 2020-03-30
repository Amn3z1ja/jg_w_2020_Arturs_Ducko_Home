package lv.javaguru.homework.lesson4;

//šeit ir jāpārbauda katrs viļņa garums, ne tikai viens variants
public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();

        test.shouldDetectColorViolet();
        test.shouldDetectColorBlue();
        test.shouldDetectColorGreen();
        test.shouldDetectColorYellow();
        test.shouldDetectColorOrange();
        test.shouldDetectColorRed();
    }

    public void shouldDetectColorViolet() {
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(400);
        compareResult(result.equals("Violet"), "shouldDetectColorViolet");

    }
    public void shouldDetectColorBlue() {
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(460);
        compareResult(result.equals("Blue"), "shouldDetectColorBlue");

    }
    public void shouldDetectColorGreen() {
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(500);
        compareResult(result.equals("Green"), "shouldDetectColorGreen");

    }
    public void shouldDetectColorYellow() {
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(580);
        compareResult(result.equals("Yellow"), "shouldDetectColorYellow");

    }
    public void shouldDetectColorOrange() {
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(600);
        compareResult(result.equals("Orange"), "shouldDetectColorOrange");

    }
    public void shouldDetectColorRed() {
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(700);
        compareResult(result.equals("Red"), "shouldDetectColorRed");

    }

    void compareResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");

        }
    }
}