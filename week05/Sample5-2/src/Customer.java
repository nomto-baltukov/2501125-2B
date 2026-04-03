import java.io.IOException;
import java.util.Scanner;

public class Customer {

    private String name;
    private String waterNo;
    private Type type;
    protected float usage;

    private static final int BASIC = 1200;
    private static final float MAX_USAGE = 999.9f;

    // 하나의 Scanner만 사용
    private static final Scanner keyboard = new Scanner(System.in);

    // 생성자
    public Customer(String name, String waterNo, Type type) {
        this.name = name;
        this.waterNo = waterNo;
        this.type = type;
        this.usage = 0.0f;
    }

    // 데이터 입력
    protected void inputData() throws IOException {
        while (true) {
            System.out.printf("[%s] %s님의 수도 사용량 입력 : ",
                    type.getTypeName(), name);

            if (keyboard.hasNextFloat()) {
                usage = keyboard.nextFloat();

                if (usage >= 0.0f && usage <= MAX_USAGE) {
                    break;
                } else {
                    System.err.println("Error : 수도 사용량은 0 ~ 999.9까지입니다.");
                }
            } else {
                System.err.println("숫자를 입력하세요!");
                keyboard.next(); // 잘못된 입력 제거
            }
        }
    }

    // 요금 계산
    protected int fee() {
        int use = (int) (usage + 0.5f); // 반올림
        return BASIC + (use * type.getUnitPrice());
    }

    // 세금 계산 (핵심 수정!)
    protected int tax() {
        int tax = (int) (fee() * (type.getTaxRate() / 100.0));
        return (tax / 10) * 10; // 10원 단위 절삭
    }

    // 총 요금
    protected int charge() {
        return fee() + tax();
    }

    @Override
    public String toString() {
        String extra = type.getTypeName().equals("군기관") ? "일괄징수" : "";

        return String.format(
                "%6s %3s %6s %,8.2f㎥ %,7d원\n%,6d원 %,7d원 %s",
                waterNo,
                name,
                type.getTypeName(),
                usage,
                fee(),
                tax(),
                charge(),
                extra
        );
    }
}