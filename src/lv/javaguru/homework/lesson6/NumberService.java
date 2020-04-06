package lv.javaguru.homework.lesson6;

public class NumberService {

    public static boolean sumInRange() {

        int num = 5;
        int sum = 0;

        for (int i = 1; i < num; ++i) {
            sum += i;

        }
        System.out.println("Sum = " + sum);
        return false;
    }

    public static int getEvenNumberCount() {

        for (int i = 0; i < 10; i = i + 2) {
            System.out.println("Numbers " + i);
        }
        return 0;
    }
}
