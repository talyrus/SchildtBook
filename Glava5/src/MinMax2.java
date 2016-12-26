/**
 * Created by Taly on 26.12.2016.
 * Применение инициализаторов массива
 */
public class MinMax2 {
    public static void main(String[] args) {
        int min, max;

        int nums []= {99, -10,  100123, 18, -978, 5623, 463, -9, 287, 49};

        min =  max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (min > nums[i]) min = nums[i];
            if (max < nums[i]) max = nums[i];
        }
        System.out.println("min и max: " + min + " "  + max);
    }
}
