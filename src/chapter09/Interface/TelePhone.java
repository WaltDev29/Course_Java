package chapter09.Interface;

public class TelePhone implements Phone{
    @Override
    public void callPhone(String phoneNum) {
        System.out.println("TelePhone Calling " + phoneNum);
    }

    @Override
    public void receivePhone(String phoneNum) {
        System.out.println("TelePhone Receive " + phoneNum);
    }

    public void answeringMachine(String message) {
        System.out.println(message);
    }
}
