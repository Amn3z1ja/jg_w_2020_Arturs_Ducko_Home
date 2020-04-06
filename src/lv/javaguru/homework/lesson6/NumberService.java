package lv.javaguru.homework.lesson6;

public class NumberService {

    //Kā Tu saskaitīsi skaitļus piemēram no 10 līdz 15
    //šai metodei ir jānodod 2 paramateri, viens - no kura skaitļa un otrs - līdz kuram skaitlim jaskaita
    //un rezultātam ir jābut šai summai
    public static boolean sumInRange() {
        //šādai metodei ir jāizskatās
        //public static int sumInRange(int from, int to) {

        int num = 5;
        int sum = 0;

        for (int i = 1; i < num; ++i) {  //šeit "1" vietā ir jāieliek no parametra saņemtais "from" vērtība
            // un "num" vietā jaliek no parametriem saņemtais "to"
            sum += i;

        }
        System.out.println("Sum = " + sum);
        return false;//return sum;
    }

    //šeit tas pats, kas iepriekšējā metodē
    public static int getEvenNumberCount() {

        for (int i = 0; i < 10; i = i + 2) {
            System.out.println("Numbers " + i);
        }
        return 0;
    }
}
