package app;

public class NotificationService {
    private final MessageSender sender;
    private final String recipient;
//    public NotificationService(MessageSender sender){
//        this.sender = sender;
//    }

    public NotificationService(MessageSender sender, String recipient){
        this.sender = sender;
        this.recipient = recipient;
    }

    public void notifyUser(String recipient, String message){
        sender.send(recipient, message);
    }

    public void alert(String message){
        sender.send(recipient, message);
    }
}
