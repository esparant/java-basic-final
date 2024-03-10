package poly.exfinal.sender;

public class EmailSender implements Sender{
    @Override
    public void sendMassage(String massage) {
        System.out.println("SMS를 발송합니다 : " + massage);
    }
}
