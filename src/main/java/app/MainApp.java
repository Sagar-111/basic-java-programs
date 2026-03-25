package app;

public class MainApp {
    public static void main(String[] args) {

        MessageSender sender = new EmailSender();
//        sender.send("sgrchdhr@sddsb.com", "You have successfully passed all our interview stages and we are happy to onboard you.");

        NotificationService service = new NotificationService(sender, "jnjkjnk");
        service.notifyUser("sgr@124.com", "message to be sent");

        sender = new SMSSender();
//        sender.send("48934760934", "You have successfully passed all our interview stages and we are happy to onboard you.");

//        service = new NotificationService(sender);
//        service.notifyUser("57574663", "message to be sent");

        service = new NotificationService(sender, "23523342353");
        service.alert("sbdskbmmbsdmbdbewb");
    }
}