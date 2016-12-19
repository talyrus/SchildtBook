/**
 * Created by Taly on 12.12.2016.
 * Упражнение ДЗ 1.10
 * Эта программа отображает таблицу перевода дюймов в метры
 *  */

public class InchToMetrTable {
    public static void main(String[] args) {
        double inch, metr;
        int counter;

        counter = 0; //инициализация счетчика нулевым значением

        for (inch = 1; inch <= 144; inch++) {
            //metr = inch * 0.0254; //преобразовать дюймы в метры
            metr = inch / 39.37; //преобразовать дюймы в метры
            System.out.println(inch + " дюймам соответствует " + metr + " метров");
            counter++; //увеличить значение счетчика строк на 1 накаждый итерации цикла
            if (counter == 12) { //если значение счетчика строк равно 12, ввести пустую строку
                System.out.println();
                counter = 0; //сбросить счетчик строк
            }
        }
    }
}
