public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int cost = 1_000_000;
        double payment = service.calculate(cost);
        System.out.println(payment);
    }
}
