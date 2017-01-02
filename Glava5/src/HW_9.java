/**
 * Created by Taly on 02.01.2017.
 * Домашнее задание глава 5 пункт 9
 * Перепишите приведенную ниже последовательность операторов,
 * воспользовавшись оператором ?
 * if(x < 0) y = 10;
 * else y = 20;
 */
public class HW_9 {
    public static void main(String[] args) {
        int x = 6;
        int y = 0;

        y = (x < 0)? 10: 20;
        System.out.println(y);
    }
}
