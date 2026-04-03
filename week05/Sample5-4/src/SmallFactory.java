public class SmallFactory extends Factory{
    public SmallFactory(String name, String waterNo) {
        super(name, waterNo);
        super.type = "소공장";
    }
    protected int fee() {
        int use = (int) (usage + 0.5f);
        return use * 65 + BASIC;
    }
    protected int tax() {
        int tax = (int) (fee() * (2.5f / 100));
        tax = (tax / 10) * 10;
        return tax;
    }
