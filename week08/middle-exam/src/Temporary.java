class Temporary extends Employee {
    int dailyPay;
    int days;

    Temporary(String id, String name, String birth, int dailyPay, int days) {
        super(id, name, birth);
        this.dailyPay = dailyPay;
        this.days = days;
    }

    @Override
    double getPay() {
        return dailyPay * days;
    }

    @Override
    double getTax() {
        return getPay() * 0.066;
    }

    @Override
    int getDailyPay() {
        return dailyPay;
    }

    @Override
    int getDays() {
        return days;
    }

    @Override
    String getPositionInfo() {
        return "0급-0호";
    }

    @Override
    String getType() {
        return "일용직";
    }
}