public class Plan {
    private String planName;
    protected final int NETWORK;
    protected final int BASIC;

    public Plan(String planName) {
        this.planName = planName;
        this.NETWORK = 3200;
        this.BASIC = 1000;
    }

    public String getPlanName() {
        return planName;
    }

    // Если вы не хотите делать класс абстрактным, оставляем так:
    protected int calculateFee(Customer customer) {
        return 0;
    }

    protected int tax(Customer customer) {
        int tax = 0;

        // ВАЖНО: Проверьте, что в Customer есть метод getBirthDay()
        // и что он не возвращает null
        if (customer.getBirthDay() != null && customer.getBirthDay().getAge() > 19) {
            // Используем double для точности, затем приводим к int
            tax = (int) (this.calculateFee(customer) * 0.065);
        }
        return tax;
    }
}