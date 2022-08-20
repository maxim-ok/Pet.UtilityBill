package com.okunev.payservice;

import java.util.Scanner;


public class ElectricityPayment {

    double rate = 6.43;

    public double CalculateElectPayment(double oldCounterValue, double newCounterValue) {




        double totalElectro = rate * (newCounterValue - oldCounterValue);
        return totalElectro;

    }
}
