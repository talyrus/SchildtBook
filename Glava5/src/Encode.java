/**
 * Created by Taly on 29.12.2016.
 * Использование поразрядной операции исключающего ИЛИ
 * для шифрования и дешифрования сообщений
 */
class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        //Защифровать сообщение
        for (int i = 0; i < msg.length(); i++)
            //Построение зашифрованной строки сообщения
            encmsg = encmsg + (char) (msg.charAt(i) ^ key); //создание зашифрованной строки

        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        //Дешифровать сообщение
        for (int i = 0; i < msg.length(); i++)
            //Построение дешифрованной строки сообщения
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key); //создание дешифрованной строки

        System.out.print("Зашифрованное сообщение: ");
        System.out.println(decmsg);


    }
}
