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
}