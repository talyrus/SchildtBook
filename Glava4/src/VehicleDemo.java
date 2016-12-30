/**
 * Created by Taly on 21.12.2016.
 */
class Vehicle5 {
    int passengers; // количество пассажиров
    int fuelcap;    // емкость топливного бака
    int mpg;        // потребление топлива в милях на галлон
}


    //В этом классе объявляется объект типа Vehicle
    class VehicleDemo {
    public static void main(String[] args) {
        Vehicle5 minivan = new Vehicle5();
        int range;

        //Присвоить значения полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //рассчитать дальность поездки при полном баке
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на расстояние "
                + range + " миль");
    }
}

