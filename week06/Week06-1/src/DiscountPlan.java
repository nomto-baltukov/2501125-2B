public class DiscountPlan extends Plan {
    public DiscountPlan() {
        super("할인 요금제");
    }
    protected int calculateFee(Customer customer) {
        int callFee = (customer.getUsageTime() / 2 +
                (customer.getUsageTime() % 2 != 0 ? 1 : 0)) * 5;
        int msgFee;
        if (customer.birthDay.getAge() >= 80) {
            msgFee = 0; // 문자 무제한 무료
        } else {
            msgFee = customer.getMessage() <= 40 ? 0 :
                    (customer.getMessage() - 40) * 2;
        }
        return NETWORK + BASIC + callFee + msgFee;
    }
    protected int tax(Customer customer) {
        int tax = 0;
        if (customer.birthDay.getAge() > 19) {
            tax = (int) (calculateFee(customer) * (6.5 / 100));
        }
        return tax;
    }
}
