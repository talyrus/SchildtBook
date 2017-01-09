/**
 * Created by Taly on 09.01.2017.
 * Возврат объекта типа String
 */
class ErrorMsg {
    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Вывод индекса за границы диапазона"
    };

    String getErrorMsg(int i) { //Возврат объекта типа String
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Несуществующий код ошибки";
    }
}

class ErrMsg{
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));

    }
}
