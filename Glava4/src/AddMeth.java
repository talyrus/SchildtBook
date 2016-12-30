/**
 * Created by Taly on 22.12.2016.
 * добавление метода range() в класс Vehicle
 */

class Vehicle3 {
    int passengers; // количество пассажиров
    int fuelcap;    // емкость топливного бака
    int mpg;        // потребление топлива в милях на галлон

    void range(){
        System.out.println("Дальность - " + fuelcap*mpg + " миль.");
    }
}

class AddMeth {
    public static void main(String[] args) {

        Vehicle3 minivan = new Vehicle3();
        Vehicle3 sportscar = new Vehicle3(); // переменные minivan и sportscar ссылаются на разные объекты

        int range1, range2;

        //Присвоить значение полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Присвоить значение полям в объекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Мини-фургон может перевезти " + minivan.passengers + " пассажиров.");
        minivan.range();

        System.out.println("Спортивный автомобиль может перевезти " + sportscar.passengers + " пассажиров.");
        sportscar.range();
    }
}
