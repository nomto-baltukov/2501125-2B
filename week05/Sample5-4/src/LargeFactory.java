public class LargeFactory extends Factory{
    public LargeFactory(String name, String waterNo) {
        super(name, waterNo);
        super.type = "대공장";
    }
    protected int fee() {
        int use = (int) (usage + 0.5f);
        return use * 78 + BASIC;
    }
    protected int tax() {
        int tax = (int) (fee() * (2.5f / 100));
        tax = (tax / 10) * 10;
        return tax;
    }