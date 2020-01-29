package Behavioral.Strategy;

public class SubprimeApprovalStrategy extends ApprovalStrategy {
    @Override
    public boolean isApproved(Customer customer) {
        return customer.getCreditHistory() > 12
                && customer.getCreditScore() > 600
                && customer.getCreditRatio() < 0.7;
    }
}
