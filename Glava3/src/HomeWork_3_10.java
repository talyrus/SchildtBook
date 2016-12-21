/**
 * Created by Taly on 21.12.2016.
 * Написать программу, преобразующую строчные буквы в прописные, а прописные в строчные. Остальные символы
 * не должны изменяться. Работа программы завершается при вводе точки. Вывести число символов, для которых
 * был изменен регистр. (Для преобразования строчкой буквы в прописную нужно уменьшить ее код на 32)
 */
public class HomeWork_3_10 {
    public static void main(String[] args)
        throws java.io.IOException{

        char ch;
        int changes = 0;

        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z' ) {
                System.out.println("Преобразован введенный символ " + ch + " в " + ((char)(ch-32)));
                changes++;
            }else if (ch >= 'A' & ch <= 'Z' ) {
                System.out.println("Преобразован введенный символ " + ch + " в " + ((char)(ch+32)));
                changes++;
            }

        }while (ch != '.');

        System.out.println("Преобразовано " + changes + " символов");

    }
}
