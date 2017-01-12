/**
 * Created by Taly on 12.01.2017.
 * Демонстрация перегрузки конструкторов
 */

class MyClass {
    int x;

    MyClass() {
        System.out.println("Внутри MyClass().");
        x = 0;
    }

    MyClass(int i) {
        System.out.println("Внутри MyClass(int).");
        x = i;
    }

    MyClass(double d) {
        System.out.println("Внутри MyClass(double).");
        x = (int) d;
    }

    MyClass(int i, int j) {
        System.out.println("Внутри MyClass(int, int).");
        x = i * j;
    }
}

class OverloadConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(88);
        MyClass t3 = new MyClass(17.23);
        MyClass t4 = new MyClass(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}
