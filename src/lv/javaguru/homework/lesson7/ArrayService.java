package lv.javaguru.homework.lesson7;

import java.util.Random;
//šim trūkst testu vai darbības demonstrācijas
public class ArrayService {

    //šai metodei ir tikai jāizveido jauns masīvs un jāatgriež rezuktātā
    //print nav nepieciešams
    //Meotei kā parametru ir jānodod vēlamā masīva izmērs
    public int[] create(int[] n) {
        for (int i = 0; i < n.length; i = i + 2) {
            System.out.println(n);

        }
      return n;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(101);
        }
    }

    public void printArrayToConsole(int[] array) {

        for (int elementOfArray : array) {

            System.out.println(elementOfArray);

        }

    }

}
