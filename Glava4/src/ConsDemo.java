/**
 * Created by Taly on 23.12.2016.
 * Простой конструктор
 */
class MyClass1 {
    int x;

    MyClass1(){ //Конструктор класса MyClass
        x = 10;
    }
}
class ConsDemo {
    public static void main(String[] args) {
        MyClass1 t1 = new MyClass1();
        MyClass1 t2 = new MyClass1();

        System.out.println(t1.x + " " + t2.x);
    }
}
