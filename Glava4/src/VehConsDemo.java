/**
 * Created by Taly on 23.12.2016.
 * Добавление конструктора
 */

class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap;    // емкость топливного бака
    int mpg;        // потребление топлива в милях на галлон

    Vehicle(int p, int f, int m) { //конструктор класса Vehicle
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    //Определить дальность поездки
    int range() {
        return fuelcap * mpg;
    }

    //Рассчитать объем топлива, необходимого транспортному средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class VehConsDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21 );
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252; //задаем расстояние, для которого проводим расчет

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется " + gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется " + gallons + " галлонов топлива");
    }
}

