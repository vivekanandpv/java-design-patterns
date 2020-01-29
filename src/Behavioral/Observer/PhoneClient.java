package Behavioral.Observer;

public class PhoneClient extends Observer {


    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        this.subject.setState(message + " - from PhoneClient");
    }

    @Override
    void update() {
        System.out.println("Phone stream:" + this.subject.getState());
    }
}
