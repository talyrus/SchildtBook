/**
 * Created by Taly on 28.12.2016.
 * Применение метода substring()
 */
class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java - двигатель Интернета!";

        //Сформировать подстроку
        String substr = orgstr.substring(7,25); //создается новая строка, содержащая нужную подстроку

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
