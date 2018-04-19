package com.company;

import com.company.calculator.InsurancePolicyCalculator;
import com.company.formula.*;
import com.company.vehicle.Bus;
import com.company.vehicle.Car;
import com.company.vehicle.Tipper;
import com.company.vehicle.Vehicle;

public class MainApp
{

    public static void main(String[] args) {

       final Vehicle joesCar = new Car(5,200000,true, "auto");
       final Vehicle steveBus = new Bus(3,100000,true,31);
        final  Vehicle petersTipper= new Tipper(6, 80000,false,15);

        final InsurancePolicyCalculator calculator = InsurancePolicyCalculator.INSTANCE;


        final int joesInsurancePolicyCost = calculator.calculate(steveBus, Formula.CAR_BASIC_FORMULA);
        final int stevesInsurancePolicyCost = calculator.calculate(steveBus,Formula.BUS__BASIC_FORMULA);
        final int petersInsurancePolicyCost = calculator.calculate(petersTipper,Formula.TIPPER__BASIC_FORMULA);


        System.out.println("Joe's policy cost is: "+ joesInsurancePolicyCost);
        System.out.println("Steve's policy cost is: "+ stevesInsurancePolicyCost);
        System.out.println("Peter's policy cost is: "+ petersInsurancePolicyCost);


       /* final String inputString="Ana has apples!";
        System.out.println(applyStringFunction(StringFunction.TO_UPPER_FUNCTION, inputString));
        System.out.println(applyStringFunction(StringFunction.TO_LOWER_FUNCTION, inputString));
        System.out.println(applyStringFunction(StringFunction.REMOVE_CHAR_FUNCTION, inputString));
    */}
}
