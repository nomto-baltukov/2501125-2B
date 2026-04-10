public class DiscountPlan implements Plan {
    @Override
    public int calculateFee(Customer customer) {
        int callFee = (customer.getUsageTime() / UNIT +
                (customer.getUsageTime() % UNIT != 0 ? 1 : 0)) * FEE[1];
        int msgFee;
        if (isOld(customer)) {
            msgFee = 0; // 문자 무제한 무료
        } else {
            msgFee = customer.getMessage() <= FREE_MESSAGE[1] ? 0 :
                    (customer.getMessage() - FREE_MESSAGE[1]) * MESSAGE_FEE;
        }
        return NETWORK + BASIC_FEE + callFee + msgFee;
    }

    @Override
    public String getPlanName() {
        return "할인 요금제";
    }
}