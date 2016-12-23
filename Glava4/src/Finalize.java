/**
 * Created by Taly on 23.12.2016.
 * Демонстрация сборки мусора и метода finalize()
 */
class Finalize {
    public static void main(String[] args) {
        int count;

        FDemo ob = new FDemo(0);
        /*
        Генерируется большое количество объектов.
        В какой-то момент времен должна начаться сборка мусоро.
        Примечание: возможно, для того чтобы активизировать систему сборки мусора,
        количество ненерируемых объектов придется увеличить
         */
        for (count = 1; count < 100000; count++) {
            ob.generator(count);
        }
    }
}
class FDemo{
    int x;

    FDemo(int i){
        x = i;
    }

    //Вызывается при удалении объекта
    protected void finalize() {
        System.out.println("Финализация " + x);
    }

    //Генерирует объект, который точас уничтожается
    void generator(int i){
        FDemo o = new FDemo(i);
    }
}