package Behavioral.Strategy;

public class Customer {
    private int creditScore;
    private double creditRatio;
    private int creditHistory;

    private ApprovalStrategy strategy;

    public Customer(ApprovalStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean isApproved() {
        return this.strategy.isApproved(this);
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public double getCreditRatio() {
        return creditRatio;
    }

    public void setCreditRatio(double creditRatio) {
        this.creditRatio = creditRatio;
    }

    public int getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(int creditHistory) {
        this.creditHistory = creditHistory;
    }
}
