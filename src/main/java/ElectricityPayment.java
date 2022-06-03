public class ElectricityPayment {

    double rate = 5.92;

    double CalculateElectPayment(double oldCounterValue, double newCounterValue) {

        double totalElectro = rate * (newCounterValue - oldCounterValue);


        if (totalElectro > 650) {
            System.out.println("Надо меньше жечь свет, миллионеры херовы!!!");
        } else {
            System.out.println("Свет расходуется разумно");
        }

        return totalElectro;

    }
}
