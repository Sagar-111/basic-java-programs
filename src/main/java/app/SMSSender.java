package app;

public class SMSSender implements MessageSender{

    @Override
    public void send(String recipient, String message) {
        //This will decide how the SMS will be sent.
        System.out.println("The SMS is sent to "+ recipient+"-->"+message);
    }
}
