/**
 * Created by Taly on 30.12.2016.
 * Предотвращение деления на нуль с помощью оператора ?
 */

class NoZeroDiv2 {
    public static void main(String[] args) {
        int result;

        for (int i = -5; i < 6; i++) {
            if(i != 0 ? true : false)
                System.out.println("100 / " + i + " равно " + 100 / i);
        }
    }
}
