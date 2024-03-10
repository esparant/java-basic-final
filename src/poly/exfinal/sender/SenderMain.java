package poly.exfinal.sender;

public class SenderMain {
    public static void main(String[] args) {
        Sender[] sender = {
                new EmailSender(), new FacebookSender(), new SmsSender()
        };

        for (Sender senders : sender) {
            senders.sendMassage("환영합니다. 아따 아따 반갑다잉");
        }
    }
}
