/**
 * Created by Taly on 13.12.2016.
 * Домашнее задание 2.11
 * Написать программу, которая находила бы простые числа в пределах от 2 до 100
 *
 */
public class SimpleNumbers {
    public static void main(String[] args) {
        int x, y;
        boolean isSimple;

        for (x = 2; x < 100; x++) {
            isSimple = true;

            //проверим, делится ли число без остатка
            for (y = 2; y <= x/y; y++)
                //если число делится без остатка, значит оно не простое
                if ((x % y) == 0) isSimple = false;

            if(isSimple)
                System.out.println(x + " - простое число.");


        }
    }

}
