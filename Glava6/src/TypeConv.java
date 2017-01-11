/**
 * Created by Taly on 11.01.2017.
 * Автоматическое преобразование типов может влиять на выбор перегружаемого метода.
 */

class Overload2 {
    void f(int x) {
        System.out.println("Внутри f(int): " + x);
    }

    void f(double x) {
        System.out.println("Внутри f(double): " + x);
    }
}

class TypeConv {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i); // вызов метода 0b.f(int)
        ob.f(d); // вызов метода 0b.f(double)
        ob.f(b); // вызов метода 0b.f(int) с преобразованием типов
        ob.f(s); // вызов метода 0b.f(int) с преобразованием типов
        ob.f(f); // вызов метода 0b.f(double) с преобразованием типов
    }
}
