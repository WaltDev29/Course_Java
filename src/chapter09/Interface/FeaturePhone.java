package chapter09.Interface;

public class FeaturePhone implements Phone{
    @Override
    public void callPhone(String phoneNum) {
        System.out.println("FeaturePhone Calling " + phoneNum);
    }

    @Override
    public void receivePhone(String phoneNum) {
        System.out.println("FeaturePhone Receive " + phoneNum);
    }

    public void sendSMS(String phoneNum, String message) {
        System.out.println("Sending SMS to " + phoneNum);
        System.out.println(message);
    }

    public void receiveSMS(String phoneNum, String message) {
        System.out.println("Receive SMS from " + phoneNum);
        System.out.println(message);
    }
}
