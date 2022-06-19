package com.okunev.payservice;

import java.util.Scanner;


public class CalculateTotalPayment {

    public static void main(String[] args) {

        double rent = 26_000;

        ElectricityPayment electro = new ElectricityPayment();

        Scanner console = new Scanner(System.in);
        System.out.println("Введите СТАРЫЕ показания электросчетчика:");
        double oldCounterValue = console.nextDouble();
        System.out.println("Введите НОВЫЕ показания электросчетчика:");
        double newCounterValue = console.nextDouble();

        double totalElectro = electro.CalculateElectPayment(oldCounterValue, newCounterValue);

        WaterSupplyPayment water = new WaterSupplyPayment();

        Scanner console2 = new Scanner(System.in);
        System.out.println("Введите СТАРЫЕ показания счетчика ГОРЯЧЕЙ воды:");
        double boiledWaterOldCounterValue = console2.nextDouble();
        System.out.println("Введите НОВЫЕ показания счетчика ГОРЯЧЕЙ воды:");
        double boiledWaterNewCounterValue = console2.nextDouble();


        Scanner console3 = new Scanner(System.in);
        System.out.println("Введите СТАРЫЕ показания счетчика ХОЛОДНОЙ воды:");
        double coldWaterOldCounterValue = console3.nextDouble();
        System.out.println("Введите НОВЫЕ показания счетчика ХОЛОДНОЙ воды:");
        double coldWaterNewCounterValue = console3.nextDouble();

        double totalWater = water.CalculateWaterPayment(boiledWaterOldCounterValue, boiledWaterNewCounterValue, coldWaterOldCounterValue, coldWaterNewCounterValue);


        if (totalElectro > 650) {
            System.out.println("Надо меньше жечь свет, миллионеры херовы!!!");
        } else {
            System.out.println("Свет расходуется разумно");// Инфо, что надо бы подумать
        }

        if (totalWater > 1500) {
            System.out.println("Сколько можно можно лить воду, блэт?!");
        } else {
            System.out.println("Вода расходуется разумно");
        }


        double totalPayment = totalElectro + totalWater + rent; //Суммируем показания электросчетчика, счетчиков воды и самой аренды квартиры
        System.out.println("Сумма платежа: " + totalPayment + " рублей");

    }
}