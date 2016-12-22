/**
 * Created by Taly on 22.12.2016.
 * В этой программе создаются два объекта класса Vehicle
 */

class Vehicle{
    int passengers; // количество пассажиров
    int fuelcap;    // емкость топливного бака
    int mpg;        // потребление топлива в милях на галлон
}

//В этом классе объявляется объект типа Vehicle
class TwoVehicles {
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

        // рассчитать дальность поездки при полном баке
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на расстояние "
                + range1 + " миль");

        System.out.println("Спортивный автомобиль может перевезти " + sportscar.passengers + " пассажиров на расстояние "
                + range2 + " миль");





    }

}
