import java.io.IOException;
import java.util.Scanner;

public class Customer {
    private String name;
    private String waterNo;
    private char type;
    protected float usage;
    protected final int BASIC;
    public Customer(String name, String waterNo, char type) {
        this.name = name;
        this.waterNo = waterNo;
        this.type = type;
        this.usage = 0.0f;
        this.BASIC = 1200;
    }
    protected void inputData() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("[%s] %s님의수도사용량입력: ", type(), name);
            usage = keyboard.nextFloat();
            if (usage >= 0.0f && usage <= 999.9f)
                break;
            else {
                System.err.print("Error : 수도사용량은0 ~ 999.9까지임");
                System.in.read();
            }
        }
    }
    private String type() {
        String result = "";
        switch (type) {
            case '1':
                result = "가정용";
                break;
            case '2':
                result = "영업용";
                break;
            case '3':
                result = "공장용";
                break;
            case '4':
                result = "관공서";
                break;
            case '5':
                result = "군기관";
        }
        return result;
    }
    protected int fee() {
        int fee = BASIC;
        int use = (int) (usage + 0.5f);
        switch (type) {
            case '1':
                fee += use * 40;
                break;
            case '2':
                fee += use * 55;
                break;
            case '3':
                fee += use * 78;
                break;
            case '4':
                fee += use * 35;
                break;
            case '5':
                fee += use * 20;
        }
        return fee;
    }
    protected int tax() {
        int tax = 0;
        switch (type) {
            case '1':
                tax = (int) (fee() * (5.0f / 100));
                break;
            case '2':
                tax = (int) (fee() * (3.5f / 100));
                break;
            case '3':
                tax = (int) (fee() * (2.5f / 100));
                break;
            case'4':
                tax = (int) (fee() * (1.5f / 100));
                break;
            case'5':
                tax = 0;
        }
        tax = (tax / 10) * 10;
        return tax;
    }

    protected int charge() {
        return fee() + tax();
    }
    @Override
    public String toString() {
        return String.format("%6s %3s %3s %,8.2f\u33A5%,7d원\n" +
                        "%,6d원%,7d원%s",
                waterNo, name, type(), usage, fee(), tax(), charge(),
                (type == '5' ? "일괄징수" : ""));
    }
}
