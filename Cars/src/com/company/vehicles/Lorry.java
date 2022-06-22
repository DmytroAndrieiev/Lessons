package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
   private int loadCapacity;

   public Lorry(String model, String autoClass, double weight, Driver driver, Engine engine, int loadCapacity) {
      super(model, autoClass, weight, driver, engine);
      this.loadCapacity = loadCapacity;
   }

   public int getLoadCapacity() {
      return loadCapacity;
   }

   @Override
   public String toString() {
      return super.toString()+" Lorry{" +
              "loadCapacity=" + loadCapacity +
              '}';
   }
}
