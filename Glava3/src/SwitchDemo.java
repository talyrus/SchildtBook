/**
 * Created by Taly on 19.12.2016.
 * демонстрация использования оператора switch
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                    System.out.println("i равно нулю");
                    break;
                 case 1:
                    System.out.println("i равно единице");
                    break;
                 case 2:
                    System.out.println("i равно двум");
                    break;
                 case 3:
                    System.out.println("i равно трем");
                    break;
                 case 4:
                    System.out.println("i равно четырем");
                    break;
                default:
                    System.out.println("i равно или больше пяти");
            }

        }
    }
}
