package com.company.formula;

import com.company.vehicle.Vehicle;

public enum Formula {

    CAR_BASIC_FORMULA{
        public int calculate(Vehicle vehicle) {
            int cost = 100 * vehicle.getAge();
            cost += vehicle.isDiesel() ? 500 : 0;
            cost += vehicle.getNumberOfMiles() > 200000 ? 500 : 0;
            return cost;
        }
    },

    BUS__BASIC_FORMULA {
        public int calculate(Vehicle vehicle) {
            int cost = 200 * vehicle.getAge();
            cost += vehicle.isDiesel() ? 1000 : 0;
            if (vehicle.getNumberOfMiles() > 200000)
                cost += 1000;
            else if (vehicle.getNumberOfMiles() > 100000)
                cost += 500;

            return cost;
        }

    },

    TIPPER__BASIC_FORMULA {

        public int calculate(Vehicle vehicle) {
            int cost = 300 * vehicle.getAge();
            cost += vehicle.getNumberOfMiles() > 80000 ? 700 : 0;
            return cost;
        }
    };

    Formula(){

    }

        public abstract int calculate(Vehicle vehicle);


}
