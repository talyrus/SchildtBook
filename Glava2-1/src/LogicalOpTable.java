/**
 * Created by Taly on 13.12.2016.
 * Упражнение 2.2
 * Отображение таблицы истинности для логических операций
 *
 */
public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT"); //создали заголовок таблицы, используя табуляцию

        p = true; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = true; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        System.out.println();
        System.out.println("P\t\tQ\t\tAND\tOR\tXOR\tNOT"); //создали заголовок таблицы, используя табуляцию

        p = true; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print(((p&q)?1:0) + "\t" + ((p|q)?1:0) + "\t");
        System.out.println(((p^q)?1:0) + "\t" + ((!p)?1:0));

        p = true; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print(((p&q)?1:0) + "\t" + ((p|q)?1:0) + "\t");
        System.out.println(((p^q)?1:0) + "\t" + ((!p)?1:0));

        p = false; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print(((p&q)?1:0) + "\t" + ((p|q)?1:0) + "\t");
        System.out.println(((p^q)?1:0) + "\t" + ((!p)?1:0));

        p = false; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print(((p&q)?1:0) + "\t" + ((p|q)?1:0) + "\t");
        System.out.println(((p^q)?1:0) + "\t" + ((!p)?1:0));




    }
}
