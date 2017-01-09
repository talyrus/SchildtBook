/**
 * Created by Taly on 09.01.2017.
 * Объекты передаются по ссылке
 */
class TestRef{
    int a, b;

    TestRef(int i, int j){
        a = i;
        b = j;
    }
    /*
    Передача объекта методу. Теперь переменные ob.a и ob.b объекта, используемого при вызове,
    также будут изменяться.
     */
    void change(TestRef ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

class CallByRef {
    public static void main(String[] args) {
        TestRef ob = new TestRef(15, 20);

        System.out.println("ob.a и ob.b перед вызовом: " + ob.a  + " " + ob.b);
        ob.change(ob);
        System.out.println("ob.a и ob.b после вызова: " + ob.a  + " " + ob.b);

    }
}
