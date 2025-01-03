import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    // public void add(Message message) - adds a message passed as a parameter to
    // the messaging service as long as the message content is at most 280
    // characters long.
    //
    // public ArrayList<Message> getMessages() - returns the messages added to the
    // messaging service.

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.messages.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.messages;
    }

}
