/**
 * Created by Taly on 02.01.2017.
 * Домашнее задание глава 5 пункт 7 (Encode.java)
 * Использование поразрядной операции исключающего ИЛИ
 * для шифрования и дешифрования сообщений
 * Расширьте класс Encode таким образом, чтобы в качестве ключа
 * шифрования использовалась строка из восьми символов
 */
class HW_7 {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        //int key = 88;
        String key = "qwertyui";
        int j;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        //Защифровать сообщение
        j = 0;
        for (int i = 0; i < msg.length(); i++)
            //Построение зашифрованной строки сообщения
            {
                encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j)); //создание зашифрованной строки
                j++;
                if (j == 8) j = 0;
            }


        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        //Дешифровать сообщение
        j = 0;
        for (int i = 0; i < msg.length(); i++)
            //Построение дешифрованной строки сообщения
            {
                decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j)); //создание дешифрованной строки
                j++;
                if (j == 8) j = 0;
            }


        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);


    }
}
