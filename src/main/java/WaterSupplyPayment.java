public class WaterSupplyPayment {

    double boiledWaterRate = 211.67;
    double coldWaterRate = 43.74;
    double sanitationRate = 32.07;

    double CalculateWaterPayment(double boiledWaterOldCounterValue, double boiledWaterNewCounterValue, double coldWaterOldCounterValue, double coldWaterNewCounterValue) {

        double bWater = boiledWaterRate * (boiledWaterNewCounterValue - boiledWaterOldCounterValue);
        double cWater = coldWaterRate * (coldWaterNewCounterValue - coldWaterOldCounterValue);
        double sanitation = sanitationRate * ((boiledWaterNewCounterValue - boiledWaterOldCounterValue) + (coldWaterNewCounterValue - coldWaterOldCounterValue));

        double totalWaterPayment = bWater + cWater + sanitation;

        if (totalWaterPayment > 1500) {
            System.out.println("Сколько можно можно лить воду, блэт?!");
        } else {
            System.out.println("Вода расходуется разумно");
        }

        return totalWaterPayment;

    }
}
