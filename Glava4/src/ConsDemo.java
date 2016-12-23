/**
 * Created by Taly on 23.12.2016.
 * Простой конструктор
 */
class MyClass {
    int x;

    MyClass(){ //Конструктор класса MyClass
        x = 10;
    }
}
class ConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);
    }
}
