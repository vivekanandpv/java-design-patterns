package Behavioral.Strategy;

public class PrimeApprovalStrategy extends ApprovalStrategy {
    @Override
    public boolean isApproved(Customer customer) {
        return customer.getCreditHistory() > 60
                && customer.getCreditScore() > 750
                && customer.getCreditRatio() < 0.4;
    }
}
