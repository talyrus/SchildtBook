/**
 * Created by Taly on 21.12.2016.
 * Напишите программу, использующую цикл for для вывода числе в геометрической прогрессии: 1, 2, 4, 8, 16, 32 и т.д.
 */
public class HomeWork_3_9 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i+=i) {
            System.out.print(i + " ");
        }
    }
}
