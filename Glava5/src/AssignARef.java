/**
 * Created by Taly on 26.12.2016.
 * Присваивание ссылок на массивы
 */
class AssignARef {
    public static void main(String[] args) {
        int i;

        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for (i = 0; i < 10; i++)
            nums1[i] = i;

        for (i = 0; i < 10; i++)
            nums2[i] = -i;

        System.out.print("Массив nums1: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.print("Массив nums2: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        nums2 = nums1; // теперь обе переменные ссылаются на массив nums1

        System.out.print("Массив nums2 после присвоения: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        // Выполниль операции над массивом nums1 через переменную nums2
        nums2[3] = 99;

        System.out.print("Массив nums1 после изменения через nums2: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

    }
}
