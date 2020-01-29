package Structural.Proxy;

import java.util.Date;

public class PoS {
    public void swipe(String cardNumber, double amount) {
        System.out.println("Card swiped for " + amount + ", card number: " + cardNumber);
    }

    public String report(Date date) {
        return "Reporting for " + date.toString();
    }
}
