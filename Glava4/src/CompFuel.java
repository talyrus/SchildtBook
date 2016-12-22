/**
 * Created by Taly on 22.12.2016.
 * Добавление параметризированного метода, в котором производится расчет объема топлива,
 * необходимого транспортному средству для преодоления заданного расстояния
 */

class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap;    // емкость топливного бака
    int mpg;        // потребление топлива в милях на галлон

    //Определить дальность поездки
    int range(){
        return fuelcap*mpg;
    }

    //Рассчитать объем топлива, необходимого транспортному средству для преодоления заданного расстояния
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }
}

public class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252; //задаем расстояние, для которого проводим расчет

        //Присвоить значение полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Присвоить значение полям в объекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется " + gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется " + gallons + " галлонов топлива");


    }
}
