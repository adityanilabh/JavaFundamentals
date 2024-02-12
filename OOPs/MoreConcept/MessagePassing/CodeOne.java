package OOPs.MoreConcept.MessagePassing;


class MessageReciever{
    public void reciveMessage(String str)
    {
        System.out.println("message recieved!");
    }
}
class MessageSender{
    public void sendMessage(String str, MessageReciever reciever)
    {
         reciever.reciveMessage(str);
    }
}

public class CodeOne{
    public static void main(String[] args)
    {
        MessageSender sender= new MessageSender();
        MessageReciever reciever= new MessageReciever();

        sender.sendMessage("Hey how are you", reciever);
    }
}