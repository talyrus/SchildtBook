/**
 * Created by Taly on 04.01.2017.
 * Сравнение видов доступа public и private
 */
class MyClass {
    private int alpha; // закрытый доступ
    public int beta; // открытый доступ
    int gamma; // тип доступа по умолчанию (по сути, public)

    /*
    Методы доступа к переменной alpha.
    Члены класса могут обращаться к закрытым членам того же класса
     */
    void setAlpha(int a){
        alpha = a;
    }

    int getAlpha(){
        return alpha;
    }
}

class AccessDemo{
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        /*
        Доступ к переменной alpha возможен только с помощью
        специально предназначенных для этой цели методов(setAlpha(), getAlpha())
         */

        ob.setAlpha(-99); // устанавливаем значение переменной alpha
        System.out.println("ob.alpha: " + ob.getAlpha()); //получаем значение переменной alpha

        //Обратиться к переменной alpha, как показано ниже, нельзя
        //ob.alpha = 10; // Ошибка: alpha - закрытая переменная

        // Следующие обращения вполне допустимы, так как переменные
        //beta и gama являются открытыми

        ob.beta = 88;
        ob.gamma = 99;


    }
}