class Salesman extends Regular {
    double sales;
    double rate;

    Salesman(String id, String name, String birth, int grade, int step, double sales, double rate) {
        super(id, name, birth, grade, step);
        this.sales = sales;
        this.rate = rate;
    }

    @Override
    double getPay() {
        return super.getPay() + getCommission();
    }

    @Override
    int getCommission() {
        return (int)(sales * rate / 100.0);
    }

    @Override
    String getType() {
        return "영업직";
    }
}