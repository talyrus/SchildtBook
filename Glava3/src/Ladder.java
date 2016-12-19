/**
 * Created by Taly on 19.12.2016.
 * Демонстрация многоступенчатой конструкци if-else-if
 */
public class Ladder {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 6; x++) {
            if (x == 1) {
                System.out.println("x равен единице");
            }
            else if (x == 2) {
                System.out.println("x равен двум");
            }
            else if (x == 3) {
                System.out.println("x равен трем");
            }
            else if (x == 4) {
                System.out.println("x равен четырем");
            }
            else
                //Условие, выполняемое по умолчанию
                System.out.println("Значение х находится вне диапазона 1 - 4");

        }
    }
}
