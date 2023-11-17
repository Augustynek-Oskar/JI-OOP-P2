public class BillCalculator {

    public double calculate(double billValue, float servicePrice){
        return billValue + servicePrice;
    }

    public double calculate(double discount, double billValue, float servicePrice){
        return (billValue - discount) + servicePrice;
    }

    public double calculate(short takeAwayPackage, double billValue, float servicePrice){
        return billValue + servicePrice + takeAwayPackage;
    }

}
