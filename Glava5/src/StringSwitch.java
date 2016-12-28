/**
 * Created by Taly on 28.12.2016.
 *  Использование строк для управления оператором switch
 */
class StringSwitch {
    public static void main(String[] args) {
        String command = "cancel";

        switch (command){
            case "connect":
                System.out.println("Connect");
                break;
            case "cancel":
                System.out.println("Cancel");
                break;
            case "disconnect":
                System.out.println("Disconnect");
                break;
            default:
                System.out.println("Wrong command!");
                break;
        }
    }
}
