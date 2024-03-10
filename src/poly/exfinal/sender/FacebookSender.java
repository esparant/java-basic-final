package poly.exfinal.sender;

public class FacebookSender implements Sender{
    @Override
    public void sendMassage(String massage) {
        System.out.println("페이스북에 발송합니다 : " + massage);
    }
}
