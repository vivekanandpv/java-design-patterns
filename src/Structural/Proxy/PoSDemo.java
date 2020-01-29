package Structural.Proxy;

import java.util.Date;

public class PoSDemo {
    public static void main(String[] args) {
        CardSwiper cardSwiper = new PoSProxy();

        cardSwiper.swipeCard("123456789", 100.25);
        System.out.println(cardSwiper.getReport(new Date()));
    }
}
