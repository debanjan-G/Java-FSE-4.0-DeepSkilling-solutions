public class TestAdapterPattern {
    public static void main(String[] args) {
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();
        SquareGateway squareGateway = new SquareGateway();

        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);
        PaymentProcessor squareProcessor = new SquareAdapter(squareGateway);

        System.out.println("=== Testing PayPal Payment ===");
        processPaymentWithValidation(payPalProcessor, 100.0);

        System.out.println("\n=== Testing Stripe Payment ===");
        processPaymentWithValidation(stripeProcessor, 250.0);

        System.out.println("\n=== Testing Square Payment ===");
        processPaymentWithValidation(squareProcessor, 75.0);

        System.out.println("\n=== Testing Stripe with Large Amount ===");
        processPaymentWithValidation(stripeProcessor, 15000.0);
    }

    private static void processPaymentWithValidation(PaymentProcessor processor, double amount) {
        if (processor.validatePayment(amount)) {
            processor.processPayment(amount);
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment validation failed!");
        }
    }
}