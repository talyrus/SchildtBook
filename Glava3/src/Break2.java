/**
 * Created by Taly on 20.12.2016.
 * Чтение вводимых данных до тех пор, пока не будет получена буква q
 */
public class Break2 {
    public static void main(String[] args)
        throws java.io.IOException{

        char ch;

        for ( ; ; ){
            ch = (char) System.in.read();
            if (ch == 'q') {
                break; //бесконечный цикл, завершаемый оператором break
            }
        }
        System.out.println("Вы нажали клавишу q!");
    }
}
