public class TestDecoratorPattern {
    public static void main(String[] args) {
        String message = "Important notification: Server maintenance scheduled for tonight!";

        // Basic email notification
        System.out.println("=== Basic Email Notification ===");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send(message);

        System.out.println("\n=== Email + SMS Notification ===");
        Notifier emailSMSNotifier = new SMSNotifierDecorator(new EmailNotifier());
        emailSMSNotifier.send(message);

        System.out.println("\n=== Email + SMS + Slack Notification ===");
        Notifier multiChannelNotifier = new SlackNotifierDecorator(
                new SMSNotifierDecorator(
                        new EmailNotifier()));
        multiChannelNotifier.send(message);

        System.out.println("\n=== All Channels Notification ===");
        Notifier allChannelsNotifier = new FacebookNotifierDecorator(
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier())));
        allChannelsNotifier.send(message);

        System.out.println("\n=== Different Message with SMS + Slack ===");
        Notifier customNotifier = new SlackNotifierDecorator(
                new SMSNotifierDecorator(
                        new EmailNotifier()));
        customNotifier.send("Welcome to our service!");
    }
}