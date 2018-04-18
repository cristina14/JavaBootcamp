package com.company.formula;

import com.company.vehicle.Vehicle;

public class TipperBasicFormula implements Formula {

    public int calculate(Vehicle vehicle) {
        int cost = 300 * vehicle.getAge();
        cost += vehicle.getNumberOfMiles() > 80000 ? 700 : 0;
        return cost;
    }
}
