/**
 * Created by Taly on 09.12.2016.
 * Упражнение 1.2
 * Эта программа отображает таблицу перевода галлонов в литры
 *  */
public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, litres;
        int counter;

        counter = 0; //инициализация счетчика нулевым значением

        for (gallons = 1; gallons <= 100; gallons++) {
            litres = gallons * 3.7854; //преобразовать литры
            System.out.println(gallons + " галлонам соответствует " + litres + " литров");
            counter++; //увеличить значение счетчика строк на 1 накаждый итерации цикла
            if (counter == 10) { //если значение счетчика строк равно 10, ввести пустую строку
                System.out.println();
                counter = 0; //сбросить счетчик строк
            }
        }
    }
}
