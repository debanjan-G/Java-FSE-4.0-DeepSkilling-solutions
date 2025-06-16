public class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal");
    }

    public boolean checkPayment(double amount) {
        System.out.println("Validating PayPal payment of $" + amount);
        return amount > 0;
    }
}