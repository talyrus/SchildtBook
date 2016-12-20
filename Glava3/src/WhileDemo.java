/**
 * Created by Taly on 20.12.2016.
 *  Демонстрация использования цикла while
 */
public class WhileDemo {
    public static void main(String[] args) {
        char ch;

        //вывести буквы английского алфавита, используя цикл while
        ch = 'a';
        while (ch <= 'z'){
            System.out.println(ch);
            ch++;
        }
    }
}
