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

    // Геттеры
    public int getUsageTime() { return usageTime; }
    public int getMessage() { return message; }
    public Plan getPlan() { return plan; }

    @Override
    public Date getBirthDay() {
        return birthDay;
    }

    protected void inputMessage() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님 문자 메세지 사용 건수 입력 : ", name);
            if (keyboard.hasNextInt()) {
                message = keyboard.nextInt();
                if (message >= 0) break;
            } else {
                keyboard.next(); // Очистка неверного ввода
            }
            System.err.println("ERROR : 문자 메세지 건수 오류");
        }
    }

    protected void inputUsageTime() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님 통화 시간 입력 : ", name);
            if (keyboard.hasNextInt()) {
                usageTime = keyboard.nextInt();
                if (usageTime >= 0) break;
            } else {
                keyboard.next();
            }
            System.err.println("ERROR : 통화 시간 오류");
        }
    }

    private int fee() {
        if (getBirthDay().getAge() >= 80 && !(plan instanceof DiscountPlan)) {
            plan = new DiscountPlan();
        }
        return plan.calculateFee(this);
    }

    protected int charge() {
        return fee() + plan.tax(this);
    }

    @Override
    public String toString() {
        return String.format("%s %13s %,6d 초 %,5d 건 %s %,9d원 %,6d원 %,9d원",
                super.toString(), phoneNo, usageTime, message,
                plan.getPlanName(), fee(), plan.tax(this), charge());
    }
}