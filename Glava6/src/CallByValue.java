/**
 * Created by Taly on 09.01.2017.
 * Простые типы данных передаются методам по значению
 */

class Test {
    /*
    Этот метод не может изменить значения аргументов, передаваемых ему при вызове.
     */
    void noChange(int i, int j){
        i = i + j;
        j = -j;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;

        System.out.println("a и b перед вызовом: " + a  + " " + b);
        ob.noChange(a, b);
        System.out.println("a и b после вызова: " + a  + " " + b);
    }
}
