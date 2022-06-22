package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String model, String autoClass, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(model, autoClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString()+"SportCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
