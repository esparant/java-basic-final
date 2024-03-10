package poly.exfinal.sender;

public class SmsSender implements Sender{
    @Override
    public void sendMassage(String massage) {
        System.out.println("메일을 발송합니다 : " + massage);
    }
}
