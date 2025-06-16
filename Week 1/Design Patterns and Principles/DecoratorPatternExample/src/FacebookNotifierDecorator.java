public class FacebookNotifierDecorator extends NotifierDecorator {
    public FacebookNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendFacebookMessage(message);
    }

    private void sendFacebookMessage(String message) {
        System.out.println("Sending Facebook message: " + message);
    }
}