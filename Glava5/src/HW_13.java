/**
 * Created by Taly on 02.01.2017.
 * Нахождение минимального и максимального значений в массиве
 *
 * Перепишите рассмотренный ранее класс MinMax таким образом,
 * чтобы в нем использовалась разновидность for-each цикла for
 */
class HW_13 {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        min = max = nums[0];

        /*for (int i = 1; i < 10; i++) {
            if (min > nums[i]) min = nums[i];
            if (max < nums[i]) max = nums[i];
        }*/
        for (int i : nums) {
            if (min > i) min = i;
            if (max < i) max = i;
        }

        System.out.println("min и max: " + min + " "  + max);
    }



}
