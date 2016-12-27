/**
 * Created by Taly on 27.12.2016.
 * Использование переменной length для копирования массива
 */
class ACopy {
    public static void main(String[] args) {
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];


        for (i = 0; i < nums1.length; i++)
            nums1[i] = i;

        if (nums2.length >= nums1.length) //Использование переменной length для сравнения размеров массивов
            for (i = 0; i < nums2.length; i++)
                nums2[i] = nums1[i];

        for (i = 0; i < nums2.length; i++)
            System.out.print(nums2[i] + " ");
    }
}
