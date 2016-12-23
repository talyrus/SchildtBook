/**
 * Created by Taly on 12.12.2016.
 * соответствие кода символу
 */
public class CharArithDemo {
    public static void main(String[] args) {
        char ch;
        ch = 'X';
        System.out.println("ch содержит " + ch);

        ch++;
        System.out.println("ch содержит " + ch);

        ch = 90;
        System.out.println("ch содержит " + ch);

        for (ch = 0; ch < 256; ch++) { //65536
            int num = (int)ch;
            System.out.println("ch содержит " + ch + " имеющая код " + num);

        }
    }
}