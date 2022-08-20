package com.okunev.payservice;

import java.util.Scanner;


public class WaterSupplyPayment {

    double boiledWaterRate = 223.04;
    double coldWaterRate = 45.88;
    double sanitationRate = 35.53;

    public double CalculateWaterPayment(double boiledWaterOldCounterValue, double boiledWaterNewCounterValue, double coldWaterOldCounterValue, double coldWaterNewCounterValue) {


        double bWater = boiledWaterRate * (boiledWaterNewCounterValue - boiledWaterOldCounterValue);
        double cWater = coldWaterRate * (coldWaterNewCounterValue - coldWaterOldCounterValue);
        double sanitation = sanitationRate * ((boiledWaterNewCounterValue - boiledWaterOldCounterValue) + (coldWaterNewCounterValue - coldWaterOldCounterValue));

        double totalWaterPayment = bWater + cWater + sanitation;
        return totalWaterPayment;

    }
}
