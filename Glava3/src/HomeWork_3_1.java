/**
 * Created by Taly on 21.12.2016.
 * Напишите программу, которая получает символы, введенные с клавиатура, до тех пор, пока не встретится точка.
 * Предусмотрите в программе счетчик пробелов. Сведения о количестве пробелов должны выводиться в конце программы.
 */
public class HomeWork_3_1 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        int spaces = 0;
        System.out.println("Для остановки введите символ точки.");
        do {
            ch = (char) System.in.read();
            if ( ch == ' ') {
                spaces++;
                }
            }while (ch != '.');
        System.out.println("Вы ввели " + spaces + " пробелов");
    }
}
