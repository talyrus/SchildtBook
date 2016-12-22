/**
 * Created by Taly on 22.12.2016.
 * Простой пример применения параметра в методе
 */
class ChkNum{
    //вернуть логическое значение true, если x содержит четное число
    boolean isEven(int x){
        if ((x % 2) == 0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if (e.isEven(10)) System.out.println("10 - четное число"); //передача аргумента "10" методу isEven()
        if (e.isEven(9)) System.out.println("9 - четное число"); //передача аргумента "9" методу isEven()
        if (e.isEven(8)) System.out.println("8 - четное число"); //передача аргумента "8" методу isEven()

    }
}
