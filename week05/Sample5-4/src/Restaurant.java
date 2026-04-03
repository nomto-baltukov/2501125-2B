public class Restaurant extends Business{
    public Restaurant(String name, String waterNo) {
        super(name, waterNo);
        super.type = "음식점";
    }
    protected int fee() {
        int use = (int) (usage + 0.5f);
        return use * 55 + BASIC;
    }
    protected int tax() {
        int tax = (int) (fee() * (3.5f / 100));
        tax = (tax / 10) * 10;
        return tax;
    }
