/**
 * Created by Taly on 20.12.2016.
 * Демонстрация использования цикла do-while
 */
public class DWDemo {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        do {
            System.out.print("Нажмите нужную клавишу, а затем клавишу <ENTER>: ");
            ch = (char) System.in.read(); //получить символ с клавиатуры
        } while (ch != 'q');
    }
}
