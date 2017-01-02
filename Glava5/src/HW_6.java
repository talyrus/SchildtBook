/**
 * Created by Taly on 02.01.2017.
 * Домашнее задание глава 5 пункт 6
 * Все строки являются объектами типа String.
 * Покажите, как вызываются методы length() и charAt()
 * для строкового литерала "Мне нравится Java".
 */
public class HW_6 {
    public static void main(String[] args) {
        String string = "Мне нравится Java";
        System.out.println("Длина исходной строки " + "\"" + string + "\": " +
                string.length() + " символов." + "\n");
        System.out.print("Изменненная строка имеет вид: " );
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
    }
}
