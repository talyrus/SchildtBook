/**
 * Created by Taly on 10.01.2017.
 * Перегрузка методовов
 */
class Overload {
    void ovlDemo() { // Первая версия (метод ничего не возвращает. Просто печатает текст)
        System.out.println("Без параметров");
    }

    // Перегрузка метода ovlDemo для одного параметра типа int
    void ovlDemo(int a) { // Вторая версия (метод ничего не возвращает. Просто печатает текст и значение параметра)
        System.out.println("Один параметр: " + a);
    }

    // Перегрузка метода ovlDemo для двух параметров типа int
    int ovlDemo(int a, int b) { // Третья версия (метод возвращает целочисленное значение, печатает текст и значения параметров)
        System.out.println("Два параметра: " + a + " " + b);
        return a + b;
    }

    // Перегрузка метода ovlDemo для двух параметров типа double
    double ovlDemo(double a, double b) { // Четвертая версия (метод возвращает значение типа double, печатает текст и значения параметров)
        System.out.println("Два параметра типа double: " + a + " " + b);
        return a + b;
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        //Поочередно вызываем все версии метода ovlDemo()
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Результат вызова ob.ovlDemo(4, 6): " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Результат вызова ob.ovlDemo(1.1, 2.32): " + resD);
    }
}
