/**
 * Created by Taly on 02.01.2017.
 * Домашнее задание глава 5 пункт 2
 *  Покажите, как инициализировать одномерный массив
 *  целочисленными значениями от 1 до 5
 */
public class HW_2 {
    public static void main(String[] args) {
        int[] arr_1 = {1, 2, 3, 4, 5};

        int[] arr_2 = new int[5];
        for (int i = 0; i < arr_2.length; i++) {
            arr_2[i] = i + 1;
        }
        for (int x:arr_2) {
            System.out.println(x);
        }
    }
}
