package chapter09.Interface;

public class SmartPhone implements Phone {
    @Override
    public void callPhone(String phoneNum) {
        System.out.println("SmartPhone Calling " + phoneNum);
    }

    @Override
    public void receivePhone(String phoneNum) {
        System.out.println("SmartPhone Receive " + phoneNum);
    }

    public void sendSMS(String phoneNum, String message) {
        System.out.println("Sending SMS to " + phoneNum);
        System.out.println(message);
    }

    public void receiveSMS(String phoneNum, String message) {
        System.out.println("Receive SMS from " + phoneNum);
        System.out.println(message);
    }

    public void installApp(String appName) {
        System.out.println("Installing app " + appName);
    }
}
