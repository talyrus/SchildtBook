/**
 * Created by Taly on 23.12.2016.
 * Параметризированный конструктор
 */
class MyClass {
    int x;

    MyClass(int i){ //конструктор имеет параметр
        x = i;
    }
}


class ParmConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(80);

        System.out.println(t1.x + " " + t2.x);
    }
}
