public class StripeGateway {
    public void chargeCard(double amount) {
        System.out.println("Charging $" + amount + " via Stripe");
    }

    public boolean verifyCharge(double amount) {
        System.out.println("Verifying Stripe charge of $" + amount);
        return amount > 0 && amount < 10000;
    }
}