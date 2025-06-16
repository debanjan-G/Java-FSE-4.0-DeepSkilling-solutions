public class SquareGateway {
    public void executePayment(double amount) {
        System.out.println("Executing payment of $" + amount + " through Square");
    }

    public boolean confirmPayment(double amount) {
        System.out.println("Confirming Square payment of $" + amount);
        return amount > 0;
    }
}