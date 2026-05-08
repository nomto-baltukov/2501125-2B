import java.io.IOException;

public interface Symbolic {
    public interface SymbolDefine {
        int[] salary = new int[]{0, 6000000, 5000000, 4589000, 3689000, 3235000,
                2589000, 2123000};
        String[] title = {"", "상무", "이사", "부장", "차장", "과장", "대리", "사원"};
        int CONTACT = 2000000;
        int STEP1 = 100000;
        int STEP2 = 150000;
        double MANAGER = 10.0;
        double RESEARCH = 30.0;
        int TAX1 = 2000000;
        int TAX2 = 4000000;
        int TAX3 = 6000000;

        double RATE1 = 4.5;
        double RATE2 = 8.4;
        double RATE3 = 10.6;
        double RATE4 = 12.3;

        default boolean dailyPay(int pay) {
            return pay >= 25000 && pay <= 95000;
        }

        default boolean performance(int money) {
            return money >= 0 && money <= 700000;
        }

        default boolean isCheck(int grade, int start, int last) {
            return grade >= start && grade <= last;
        }

        default boolean stock(int money) {
            return money >= 0 && money <= 1000000;
        }

        default boolean checkDay(int day) {
            return day >= 0 && day <= 31;
        }

        default void error(String message) throws IOException {
            System.err.println("ERROR : " + message);
            System.in.read();
        }
    }

}
