package com.company.professions;

public class Driver extends Person {
      private int drivingExperience;

      public Driver(String fullName, int age, boolean retired, int drivingExperience) {
            super(fullName, age, retired);
            this.drivingExperience = drivingExperience;
      }

      @Override
      public String toString() {
            return super.toString()+"Driver{" +
                    "drivingExperience=" + drivingExperience +
                    '}';
      }
}
