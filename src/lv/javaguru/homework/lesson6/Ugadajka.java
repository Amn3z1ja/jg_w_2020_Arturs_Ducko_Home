package lv.javaguru.homework.lesson6;

import java.util.Random;
import java.util.Scanner;

public class Ugadajka {

    public static void main(String[] args) {

        int min, max;
        min = 0;
        max = 100;

        Random randomGenerator = new Random();
        int firstRandomNumber = randomGenerator.nextInt(100);
        System.out.print("Random number= " + firstRandomNumber);

        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("");
        System.out.println(" Choose: M(More), L(Less), Y(Yes)");
        number = in.nextInt();
        int guess;
        guess = in.nextInt();
        String str = "";
        boolean result = false;

        while (guess != number ) {
            str =in.nextLine();
            if (str.equalsIgnoreCase("Y")) {
                System.out.println("Correct");
                System.exit(0);
            } else if (str.equalsIgnoreCase("L")) {
                max = guess;
                guess = guess-(min-max);
                result = true;

            } else if (str.equalsIgnoreCase("M")){
                min = guess;
                guess = guess + (max -min);
                result =true;
            } if (result) {
                System.out.println(guess + "");
                result = false ;
            }
        }


    }

}


