public class BasicPlan implements Plan {
    @Override
    public int calculateFee(Customer customer) {
        int callFee = (customer.getUsageTime() / UNIT +
                (customer.getUsageTime() % UNIT != 0 ? 1 : 0)) * FEE[0];
        int msgFee = customer.getMessage() <= FREE_MESSAGE[0] ? 0 :
                (customer.getMessage() - FREE_MESSAGE[0]) *
                        MESSAGE_FEE;
        return  NETWORK + callFee + msgFee;
    }
    @Override
    public String getPlanName() {
        return "기본 요금제";
    }
}
