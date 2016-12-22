/**
 * Created by Taly on 22.12.2016.
 *  Использование возвращаемого значения
 */

class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap;    // емкость топливного бака
    int mpg;        // потребление топлива в милях на галлон

    //Возврат дальности поездки
    int range(){
        return fuelcap*mpg;
    }
}
class RethMeth {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle(); // переменные minivan и sportscar ссылаются на разные объекты

        int range1, range2;

        //Присвоить значение полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Присвоить значение полям в объекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        //Получить разность поездки для разных транспортных средств
        range1 = minivan.range();
        range2 = sportscar.range();

        minivan.range(); //присвоение переменным значения, возвращаемого методом range()
        sportscar.range();

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на расстояние " + range1 + " миль.");
        System.out.println("Спортивный автомобиль может перевезти " + sportscar.passengers + " пассажира  на расстояние " + range1 + " миль.");

    }
}

