/**
 * Created by Taly on 19.12.2016.
 * Игра в угадывание букв
 */
public class Guess {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'S';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.println("Попытайтесь ее угадать: ");

        ch = (char) System.in.read(); //получить символ с клавиатуры

        if (ch == answer) {
            System.out.println("** Правильно! **");
        }
    }

}
