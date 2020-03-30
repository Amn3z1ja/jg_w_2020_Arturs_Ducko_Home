package lv.javaguru.homework.lesson2;//ieliec majas darbus atsevišķā "package" - lv.javaguru.homework.lesson2
import java.util.Random;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {

        //atstarpe vajadzīgā vietā kodu sadala "loģiskos blokos"
        Random randomGenerator = new Random();

        int firstRandomNumber = randomGenerator.nextInt(10);
//        int secondRandomNumber = randomGenerator.nextInt(10);
//        int thirdRandomNumber = randomGenerator.nextInt(10);
//
//        int mySUM = firstRandomNumber+secondRandomNumber+thirdRandomNumber;

        System.out.print(firstRandomNumber);
//        System.out.print(secondRandomNumber+"+");
//        System.out.print(thirdRandomNumber+"+");
//        System.out.println("= Summa:"+mySUM);
    }
}
