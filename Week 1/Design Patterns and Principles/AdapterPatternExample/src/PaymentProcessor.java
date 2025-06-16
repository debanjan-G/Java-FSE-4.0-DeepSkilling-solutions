public interface PaymentProcessor {
    void processPayment(double amount);

    boolean validatePayment(double amount);
}