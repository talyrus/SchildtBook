/**
 * Created by Taly on 22.12.2016.
 * Передача в метод двух аргументов
 */
class Factor{
    boolean isFactor(int a, int b){ //Метод имеет два параметра, принимающих два аргумента
        if ((b % a) == 0) return true;
        else return false;
    }
}

public class IsFactor {
    public static void main(String[] args) {
        Factor x = new Factor();

        if (x.isFactor(2, 20)) System.out.println("2 - делитель");
        if (x.isFactor(3, 20)) System.out.println("Эта строка не будет выведена!");

    }
}
