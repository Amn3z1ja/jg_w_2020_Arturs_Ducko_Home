package lv.javaguru.homework.lekcija2;

//ieliec majas darbus atsevišķā "package" - lv.javaguru.homework.lesson2
public class MathOperations {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 5;

        //ieliekot atstarpi būs ērtak izlasīt
        int sumResult = firstNumber + secondNumber;
        int subtractResult = firstNumber - secondNumber;
        int divideResult = firstNumber / secondNumber;
        int multiplyResult = firstNumber * secondNumber;

        //atstarpe vajadzīgā vietā kodu sadala "loģiskos blokos"
        System.out.println("Summa:" + sumResult);
        System.out.println("Atņemšanas rezultāts:" + subtractResult);
        System.out.println("Dalīšanā rezultāts:" + divideResult);
        System.out.println("Reizināšanas rezultāts:" + multiplyResult);

        //šis nebija prasīts majas darbā - nav nepieciešams
        double a = Math.random() * 200 - 100;
        System.out.println(a);
    }
}
