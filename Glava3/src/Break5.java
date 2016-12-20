/**
 * Created by Taly on 20.12.2016.
 * Еще один пример применения оператора break с меткой
 */
public class Break5 {
    public static void main(String[] args) {

        done:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5) break done;
                    }
                    System.out.println("После цикла по k"); // не выполнится
                }
                System.out.println("После цикла по j"); // не выполнится
            }
            System.out.println("После цикла по i");
    }
}

