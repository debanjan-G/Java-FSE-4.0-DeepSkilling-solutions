public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        stripeGateway.chargeCard(amount);
    }

    @Override
    public boolean validatePayment(double amount) {
        return stripeGateway.verifyCharge(amount);
    }
}