public class Store extends Business{
    public Store(String name, String waterNo) {
        super(name, waterNo);
        super.type = "상점용";
    }
    protected int fee() {
        int use = (int) (usage + 0.5f);
        return use * 45 + BASIC;
    }
    protected int tax() {
        int tax = (int) (fee() * (3.5f / 100));
        tax = (tax / 10) * 10;
        return tax;
    }
