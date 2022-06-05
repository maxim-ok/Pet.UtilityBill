import com.okunev.payservice.ElectricityPayment;
import com.okunev.payservice.WaterSupplyPayment;

public class CalculateTotalPayment {

    public static void main(String[] args) {
        double rent = 26_000;

        ElectricityPayment electro = new ElectricityPayment();
        double totalElectro = electro.CalculateElectPayment(7195, 7309); //Вводим старые и новые показания электросчетчика для расчета

        WaterSupplyPayment water = new WaterSupplyPayment();
        double totalWater = water.CalculateWaterPayment(669, 674, 883, 887); //Вводим старые и новые показания счетчиков горячей и холодной воды для расчета

        double totalPayment = totalElectro + totalWater + rent; //Суммируем показания электросчетчика, счетчиков воды и самой аренды квартиры
        System.out.println("Сумма платежа: " + totalPayment + " рублей");

    }
}