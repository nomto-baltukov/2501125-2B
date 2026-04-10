import java.util.Scanner;
import java.io.IOException;

public class Customer extends Person {
    private String phoneNo;
    private int usageTime;
    private int message;
    private Plan plan;

    public Customer(String phoneNo, String name, Date birthday, Plan plan) {
        super(name, birthday);
        this.phoneNo = phoneNo;
        this.usageTime = 0;
        this.message = 0;
        this.plan = plan;

        if (birthday.getAge() >= 80) {
            this.plan = new DiscountPlan();
        }
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
            if (message >= 0) {
                break;
            } else {
                System.err.println("ERROR : 문자 메세지 건수 오류");
                System.in.read();
            }
        }
    }

    protected void inputUsageTime() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님 통화 시간 입력 : ", name);
            usageTime = keyboard.nextInt();
            if (usageTime >= 0) {
                break;
            } else {
                System.err.println("ERROR : 통화 시간 오류");
                System.in.read();
            }
        }
    }

    private int fee() {
        if (birthDay.getAge() >= 80 && !(plan instanceof DiscountPlan)) {
            plan = new DiscountPlan();
        }

        if (plan instanceof BasicPlan) {
            return ((BasicPlan) plan).calculateFee(this);
        } else {
            return ((DiscountPlan) plan).calculateFee(this);
        }
    }

    private int tax() {
        if (plan instanceof BasicPlan) {
            return ((BasicPlan) plan).tax(this);
        } else {
            return ((DiscountPlan) plan).tax(this);
        }
    }

    protected int charge() {
        return fee() + tax();
    }

    @Override
    public String toString() {
        return String.format("%s %13s %,6d 초 %,5d 건 %s %,9d원 %,6d원 %,9d원",
                super.toString(), phoneNo, usageTime, message,
                plan.getPlanName(), fee(), tax(), charge());
    }
}