import java.util.Random;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int firstRandomNumber = randomGenerator.nextInt(10);

        int secondRandomNumber = randomGenerator.nextInt(10);
        int thirdRandomNumber = randomGenerator.nextInt(10);
        int mySUM = firstRandomNumber+secondRandomNumber+thirdRandomNumber;
        System.out.print(firstRandomNumber+"+");
        System.out.print(secondRandomNumber+"+");
        System.out.print(thirdRandomNumber+"+");
        System.out.println("Summa:"+mySUM);
    }
}
