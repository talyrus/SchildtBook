/**
 * Created by Taly on 20.12.2016.
 * Применение оператор break с меткой
 */
public class Break4 {
    public static void main(String[] args) {
        int i;

        for (i = 1; i < 4; i++) {
            one:{
                two:{
                    three:{
                        System.out.println("\ni равно " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) {
                            break three;
                        }
                        // эта строка кода никогда не будет достигнута
                        System.out.println("не будет выведено");
                    }
                    System.out.println("После блока three");
                }
                System.out.println("После блока two");
            }
            System.out.println("После блока one");
        }
        System.out.println("После цикла for");
    }
}
