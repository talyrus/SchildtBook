/**
 * Created by Taly on 26.12.2016.
 * Демонстрация превышения границ массива
 */
public class ArrayError {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        // искусственно создать выход индекса за границы массива
        for (i = 0; i < 100; i++) {
            sample[i] = i;
        }
    }
}
