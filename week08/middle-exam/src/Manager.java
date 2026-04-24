class Manager extends Regular {
    Manager(String id, String name, String birth, int grade, int step) {
        super(id, name, birth, grade, step);
    }

    double getAllowance() {
        double base = super.getPay();

        if (base <= 1800000) return base * 0.06;
        else if (base <= 2400000) return base * 0.05;
        else return base * 0.04;
    }

    @Override
    double getPay() {
        return super.getPay() + getAllowance();
    }

    @Override
    int getIncentive() {
        return (int)getAllowance();
    }

    @Override
    String getType() {
        return "정규직";
    }
}