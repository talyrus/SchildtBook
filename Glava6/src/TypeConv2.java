/**
 * Created by Taly on 12.01.2017.
 * Автоматическое преобразование типов может влиять на выбор перегружаемого метода. Версия 2
 */
class Overload3 {
    // Добавление версии метода f(byte)
    void f(byte x){                     // Эта версия принимает параметр типа byte
        System.out.println("Внутри f(byte): " + x);
    }

    void f(int x) {
        System.out.println("Внутри f(int): " + x);
    }

    void f(double x) {
        System.out.println("Внутри f(double): " + x);
    }
}

class TypeConv2 {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i); // вызов метода 0b.f(int)
        ob.f(d); // вызов метода 0b.f(double)

        ob.f(b); // вызов метода 0b.f(byte) без преобразования типа

        ob.f(s); // вызов метода 0b.f(int) с преобразованием типов
        ob.f(f); // вызов метода 0b.f(double) с преобразованием типов
    }
}
