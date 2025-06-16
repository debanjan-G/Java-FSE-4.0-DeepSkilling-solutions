public class SquareAdapter implements PaymentProcessor {
    private SquareGateway squareGateway;

    public SquareAdapter(SquareGateway squareGateway) {
        this.squareGateway = squareGateway;
    }

    @Override
    public void processPayment(double amount) {
        squareGateway.executePayment(amount);
    }

    @Override
    public boolean validatePayment(double amount) {
        return squareGateway.confirmPayment(amount);
    }
}