package Structural.Proxy;

import java.util.Date;

public interface CardSwiper {
    void swipeCard(String cardNumber, double amount);
    String getReport(Date date);
}
