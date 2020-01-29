package Structural.Proxy;

import java.util.Date;

public class PoSProxy implements CardSwiper {
    //  Consider DI here
    private PoS pos;

    public PoSProxy() {
        this.pos = new PoS();
    }

    @Override
    public void swipeCard(String cardNumber, double amount) {
        this.pos.swipe(cardNumber, amount);
    }

    @Override
    public String getReport(Date date) {
        return this.pos.report(date);
    }
}
