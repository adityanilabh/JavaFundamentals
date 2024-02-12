package OOPs.MoreConcept.MessagePassing;
// Define a class representing a Message
class Message {
    private String content;
    
    // Constructor
    public Message(String content) {
        this.content = content;
    }
    
    // Getter method
    public String getContent() {
        return content;
    }
}

// Define a class representing a MessageService
class MessageService {
    // Method to send a message to a recipient
    public void sendMessage(Message message, String recipient) {
        System.out.println("Sending message to " + recipient + ": " + message.getContent());
    }
}

// Define a class representing a User
class User {
    @SuppressWarnings("unused")
    private String name;
    private MessageService messageService;
    
    // Constructor
    public User(String name, MessageService messageService) {
        this.name = name;
        this.messageService = messageService;
    }
    
    // Method to send a message to another user
    public void sendMessageToUser(String recipient, String content) {
        Message message = new Message(content);
        messageService.sendMessage(message, recipient);
    }
}

public class CodeTwo {
    public static void main(String[] args) {
        // Create a MessageService
        MessageService messageService = new MessageService();
        
        // Create two User objects
        User user1 = new User("Alice", messageService);
        User user2 = new User("Bob", messageService);
        
        // Send messages between users
        user1.sendMessageToUser("Bob", "Hello Bob, how are you?");
        user2.sendMessageToUser("Alice", "Hi Alice, I'm doing well. Thanks for asking!");
    }
}
