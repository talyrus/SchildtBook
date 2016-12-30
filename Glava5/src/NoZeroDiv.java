/**
 * Created by Taly on 30.12.2016.
 * Предотвращение деления на нуль с помощью оператора ?
 */

class NoZeroDiv {
    public static void main(String[] args) {
        int result;

        for (int i = -5; i < 6; i++) {
            //деление на нуль предотвращается
            result = i != 0 ? 100 / i : 0;
            if (i != 0)
                System.out.println("100 / " + i + " равно " + result);
        }
    }
}
