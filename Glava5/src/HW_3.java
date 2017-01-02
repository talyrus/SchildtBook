/**
 * Created by Taly on 02.01.2017.
 * Домашнее задание глава 5 пункт 3
 * Напишите программу, в которой массив используется для нахождения
 * среднего арифметического десяти значений типа double.
 * Используйте любые десять чисел.
 */
public class HW_3 {
    public static void main(String[] args) {
        double[] arr = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};
        double sum = 0;
        //Вариант 1
        /*for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }*/
        //Вариант 2
        for (double x: arr) {
            sum += x;
        }
        System.out.println("Среднее значение: " + sum / arr.length);
    }
}
