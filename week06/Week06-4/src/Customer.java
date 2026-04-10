public class Customer extends Person  {
    private String phoneNo;
    private int usageTime; // 초 단위
    private int message;
    private Plan plan; // 고객이 선택한 요금제
    public Customer(String phoneNo, String name, Date birthday, Plan plan) {
        super(name, birthday);
        this.phoneNo = phoneNo;
        this.usageTime = 0;
        this.message = 0;
        this.plan = plan;
        if (plan.isOld(this))
            this.plan = new DiscountPlan();
    }
    public int getUsageTime() {
        return usageTime;
    }
    public int getMessage() {
        return message;
    }
    protected void inputMessage() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님 문자 메세지 사용 건수 입력 : ", name);
            message = keyboard.nextInt();
            if (message >= 0)
                break;
            else {
                System.err.print("ERROR : 문자 건수 오류");
                System.in.read();
            }
        }
    }
    protected void inputUsageTime() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님 통화 시간 입력 : ", name);
            usageTime = keyboard.nextInt();
            if (usageTime >= 0)
                break;
            else {
                System.err.print("ERROR : 통화 시간 오류");
                System.in.read();
            }
        }
    }
    private int fee() {
        if (plan.isOld(this)) {
            plan = new DiscountPlan(); // 강제 할인 요금제
        }
        return plan.calculateFee(this);
    }
    protected int charge() {
        return fee() + plan.tax(this);
    }
    @Override
    public String toString() {
        return String.format("%s %13s %,6d 초 %,5d 건 %,9d원 %,6d원 %,9d원",
                super.toString(), phoneNo, usageTime, message, plan.getPlanName(),
                fee(), plan.tax(this), charge());
    }
}
