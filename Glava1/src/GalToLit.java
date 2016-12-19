/**
 * Created by Taly on 09.12.2016.
 * Упражнение 1.1
 * Программа перевода галлонов в литры
 */
public class GalToLit {
    public static void main(String[] args) {
        double gallons; // в этой переменной хранится значение, выражающее объем жидкости в галлонах

        double litres; // в этой переменной хранится значение, выражающее объем жидкости в литрах

        gallons = 10; // начальное значение соответствует 10 галлонам

        litres = gallons * 3.7854; // перевести в литры

        System.out.println(gallons + " галлонам соответствует " + litres + " литров");
    }
}
