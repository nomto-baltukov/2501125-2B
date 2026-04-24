import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        System.out.println("■ 입력 내용");

        int daily1 = inputDaily(sc, "경복대");
        System.out.print("[일용직] 경복대님의 작업 일수 입력 : ");
        int days1 = sc.nextInt();
        list.add(new Temporary("123456", "경복대", "1993년 10월 5일", daily1, days1));

        System.out.println();

        System.out.print("[영업직] 한승이님의 판매 금액 입력 : ");
        double sales1 = sc.nextDouble();
        System.out.print("[영업직] 한승이님의 커미션 비율 입력 : ");
        double rate1 = sc.nextDouble();
        list.add(new Salesman("124567", "한승이", "2011년 4월 19일", 3, 4, sales1, rate1));

        System.out.println();

        int daily2 = inputDaily(sc, "이대한");
        System.out.print("[일용직] 이대한님의 작업 일수 입력 : ");
        int days2 = sc.nextInt();
        list.add(new Temporary("456213", "이대한", "1999년 5월 13일", daily2, days2));

        System.out.println();

        System.out.print("[영업직] 최명길님의 판매 금액 입력 : ");
        double sales2 = sc.nextDouble();
        System.out.print("[영업직] 최명길님의 커미션 비율 입력 : ");
        double rate2 = sc.nextDouble();
        list.add(new Salesman("424561", "최명길", "2012년 4월 20일", 3, 2, sales2, rate2));

        System.out.println();

        System.out.print("[영업직] 정통파님의 판매 금액 입력 : ");
        double sales3 = sc.nextDouble();
        System.out.print("[영업직] 정통파님의 커미션 비율 입력 : ");
        double rate3 = sc.nextDouble();
        list.add(new Salesman("124565", "정통파", "2013년 12월 20일", 2, 3, sales3, rate3));

        list.add(new Regular("348988", "고도나", "2011년 8월 10일", 1, 4));
        list.add(new Regular("245778", "한민국", "2012년 12월 20일", 3, 1));
        list.add(new Manager("348967", "진잡", "1987년 6월 22일", 4, 5));
        list.add(new Manager("345678", "한국인", "2012년 7월 20일", 1, 1));

        list.sort((a, b) -> Double.compare(b.getPay(), a.getPay()));

        printSalaryTable(list);
        printCommissionTable(list);
    }

    static int inputDaily(Scanner sc, String name) {
        while (true) {
            System.out.print("[일용직] " + name + "님의 일당 입력 : ");
            int daily = sc.nextInt();

            if (daily < 25000 || daily > 95000) {
                System.out.println("ERROR : 일당 범위 오류 (25,000 ~ 95,000원)");
            } else {
                return daily;
            }
        }
    }

    static void printSalaryTable(ArrayList<Employee> list) {
        System.out.println("\n■ 출력 내용\n");
        System.out.println("                         경복주식회사 급여 대장");
        System.out.println("********************************************************************************************************");

        System.out.printf("%-8s %-20s %-10s %5s %10s %12s %12s %12s %12s %12s %10s%n",
                "사번", "이름", "급-호", "day", "일당",
                "기본급", "인센티브", "커미션",
                "급여액", "세금", "지급액");

        System.out.println("********************************************************************************************************");

        int total = 0;

        for (Employee e : list) {
            int pay = (int)e.getPay();
            int tax = (int)e.getTax();
            int real = (int)e.getRealPay();

            total += real;

            System.out.printf("%-8s %-20s %-10s %5d %,10d %,12d %,12d %,12d %,12d %,12d %,12d %s%n",
                    e.employeeID,
                    e.name + "(" + e.birthday + ")",
                    e.getPositionInfo(),
                    e.getDays(),
                    e.getDailyPay(),
                    e.getBasePay(),
                    e.getIncentive(),
                    e.getCommission(),
                    pay,
                    tax,
                    real,
                    e.getType()
            );
        }

        System.out.println("********************************************************************************************************");
        System.out.printf("%70s : %,d 원%n", "지급액 합계", total);
        System.out.println("********************************************************************************************************");
    }

    static void printCommissionTable(ArrayList<Employee> list) {
        System.out.println("\n\n영업직 사원 커미션 산출 내역");
        System.out.println("************************************************************");
        System.out.printf("%-10s %-20s %15s %8s %15s%n",
                "사번", "이름", "판매 실적", "요율", "커미션 금액");
        System.out.println("************************************************************");

        for (Employee e : list) {
            if (e instanceof Salesman) {
                Salesman s = (Salesman)e;

                System.out.printf("%-10s %-20s %,15.0f %7.1f %% %,15d%n",
                        s.employeeID,
                        s.name + "(" + s.birthday + ")",
                        s.sales,
                        s.rate,
                        s.getCommission()
                );
            }
        }

        System.out.println("************************************************************");
    }
}