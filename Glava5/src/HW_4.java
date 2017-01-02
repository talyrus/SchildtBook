/**
 * Created by Taly on 02.01.2017.
 * Домашнее задание глава 5 пункт 4
 * Измените программу, написанную в упражении 5.1 (Bubble.java), таким
 * образом, чтобы она сортировала массив символьных строк.
 * Продемонстрируйте ее работоспособность.
 */

class HW_4 {
    public static void main(String[] args) {
        String nums[] = {"one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten"};
        int a, b;
        String t;
        int size;

        size = nums.length; // количество сортируемых элементов

        // отобразить исходный массив
        System.out.print("Исходный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        // Реализовать алгоритм пузырьковой сортировки
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if ((nums[b - 1].compareTo(nums[b]) > 0)) { //если требуемый порядок следования
                    // не соблюдается, поменять местами
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        // отобразить отсортированный массив
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
