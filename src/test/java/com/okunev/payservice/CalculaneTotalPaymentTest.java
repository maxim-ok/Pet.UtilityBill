package com.okunev.payservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class CalculaneTotalPaymentTest {

    @ParameterizedTest //Тестируем расчет за электроэнергию
    @CsvFileSource(resources = {"/TetsDataElectro.csv"})
    public void correctCalculatePaymentElectro1(double oldCounterValue, double newCounterValue, double expected) {
        ElectricityPayment electro = new ElectricityPayment();

        double actual = electro.CalculateElectPayment(oldCounterValue, newCounterValue);
       // double expected = 674.88;
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest //Тестируем расчет за водоснабжение
    @CsvFileSource(resources = {"/TestDataWater.csv"})
    public void correctWaterSupplyPayment(double boiledWaterOldCounterValue, double boiledWaterNewCounterValue, double coldWaterOldCounterValue, double coldWaterNewCounterValue, double expected) {

        WaterSupplyPayment water = new WaterSupplyPayment();
        double actual = water.CalculateWaterPayment(boiledWaterOldCounterValue, boiledWaterNewCounterValue, coldWaterOldCounterValue, coldWaterNewCounterValue);
      //  double expected = 1521.94;
        Assertions.assertEquals(expected, actual);
    }

}
