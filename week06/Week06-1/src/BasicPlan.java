public class BasicPlan extends Plan {
    public BasicPlan() {
        super("기본 요금제");
    }
    protected int calculateFee(Customer customer) {
        int callFee = (customer.getUsageTime() / 2 +
                (customer.getUsageTime() % 2 != 0 ? 1 : 0)) * 10;
        int msgFee = customer.getMessage() <= 20 ? 0 :
                (customer.getMessage() - 20) * 2;
        return NETWORK + callFee + msgFee;
    }
    protected int tax(Customer customer) {
        int tax = 0;
        if (customer.birthDay.getAge() > 19) {
            tax = (int) (calculateFee(customer) * (6.5 / 100));
        }
        return tax;
    }
}
