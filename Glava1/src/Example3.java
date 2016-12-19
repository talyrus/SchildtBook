/**
 * Created by Taly on 09.12.2016.
 * Различия между типами int и double
 */
public class Example3 {
    public static void main(String[] args) {
        int var; //объявили целочисленную переменную

        double x; //объявили переменную с плавающей точкой

        var = 10; //присвоили переменной var  значение 10

        x = 10.0; //присвоили переменной x значение 10.0

        System.out.println("Начальное значение переменной var: " + var);
        System.out.println("Начальное значение переменной x: " + x);
        System.out.println(); //Ввести пустую строку

        //Разделить значения обеих переменных на 4

        var = var / 4;
        x = x / 4;

        System.out.println("Значение переменной var после деления: " + var);
        System.out.println("Значение переменной x после деления: " + x);

    }


}
