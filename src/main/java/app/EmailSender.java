package app;

public class EmailSender implements MessageSender{

    @Override
    public void send(String recipient, String message) {
        //This method will decide how the email will be sent.
        System.out.println("The email is sent to "+ recipient+"-->"+message);
    }
}
