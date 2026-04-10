public class BasicPlan extends Plan {

    public BasicPlan() {
        super("기본 요금제");
    }

    @Override
    protected int calculateFee(Customer customer) {
        // Расчет стоимости звонков: (время / 2, с округлением вверх) * 10
        int callFee = (customer.getUsageTime() / 2 +
                (customer.getUsageTime() % 2 != 0 ? 1 : 0)) * 10;

        // Расчет стоимости сообщений: первые 20 бесплатно, далее по 2원 за шт.
        int msgFee = (customer.getMessage() <= 20) ? 0 :
                (customer.getMessage() - 20) * 2;

        // Итоговая сумма: Сетевой сбор (NETWORK из родителя) + звонки + сообщения
        return NETWORK + callFee + msgFee;
    }
}