/**
 * Created by Taly on 23.12.2016.
 * Демонстрация одномерного массива
 */
class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        for (i = 0; i < 10; i = i+1)
            sample[i] = i;

        for (i = 0; i < 10; i = i+1)
        System.out.println("Элемент [" + i + "]: " + sample[i]);

    }
}
