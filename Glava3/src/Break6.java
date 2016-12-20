/**
 * Created by Taly on 20.12.2016.
 * РАсположение метки имеет большое значение
 */
public class Break6 {
    public static void main(String[] args) {
        int x = 0, y = 0;

        // здесь метка располагается перед оператором for
        stop1:for (x = 0; x < 5; x++){
            for (y = 0; y < 5; y++) {
                if (y ==2) break stop1;
                System.out.println("x и y: " + x + " " + y);
            }
        }
        System.out.println();

        //А здесь метка располагается непосредственно перед открывающейся фигурной скобкой
        for (x = 0; x < 5; x++)
        stop2: {
            for (y = 0; y < 5; y++) {
                if (y == 2) break stop2;
                System.out.println("x и y: " + x + " " + y);
            }
        }

    }
}
