public class CreditPaymentService {
    public double calculate(int cost) {
        double rateOfInterest = 9.99;
        int period = 12;
        double payment;
                payment = cost*(rateOfInterest+rateOfInterest/((Math.pow(1+rateOfInterest,12)) - 1));
                        return payment;
    }
}
