package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Demo {
    public static void main(String[] args){
        Driver bmwDriver=new Driver("Иванов В.В.", 50, false, 30);
        Engine bmwEngine=new Engine(60, "BMW1");
        Car car=new Car("bmw","A",3000,bmwDriver,bmwEngine);

        Driver lorryDriver=new Driver("Петров В.В.", 45, false, 20);
        Engine lorryEngine=new Engine(350,"Iveco");
        Lorry lory=new Lorry("Грузовик", "D", 8000, lorryDriver, lorryEngine, 70);

        Driver sportCarDriver=new Driver("Сидоров В.В.", 30, false,15);
        Engine sportEngine=new Engine(800, "SportEngine");
        SportCar sportCar=new SportCar("SportCar", "C", 4000, sportCarDriver, sportEngine, 300);

        System.out.println(car);
        System.out.println(lory);
        System.out.println(sportCar);
    }
}
