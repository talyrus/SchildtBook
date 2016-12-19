/**
 * Created by Taly on 19.12.2016.
 * Пропуск отдельных составляющих в определении цикла for
 */
public class Empty2 {
    public static void main(String[] args) {
        int i;
        i = 0; //из определения цикла исключено инициализирующее выражение

        for (; i < 10; ){
            System.out.println("Проход #" + i);
            i++;
        }
    }
}
