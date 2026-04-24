class Contract extends Employee {
    Contract(String id, String name, String birth) {
        super(id, name, birth);
    }

    @Override
    double getPay() {
        return 0;
    }

    @Override
    String getPositionInfo() {
        return "0급-0호";
    }

    @Override
    String getType() {
        return "계약직";
    }
}