package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String model;
    private String autoClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public void start(){
        System.out.println("Поехали");
    }
    public void  stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public String getModel() {
        return model;
    }

    public String getAutoClass() {
        return autoClass;
    }

    public double getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car(String model, String autoClass, double weight, Driver driver, Engine engine) {
        this.model = model;
        this.autoClass = autoClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
     }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", autoClass='" + autoClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
