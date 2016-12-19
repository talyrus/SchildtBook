/**
 * Created by Taly on 19.12.2016.
 * Пропуск отдельных составляющих в определении цикла for
 */
public class Empty {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; ) { //отсутствует итерационное выражение
            System.out.println("Проход # " + i);
            i++; //инкрементировать переменную цикла
        }
    }
}
