import java.io.IOException;
import java.util.ArrayList;

public class PhoneOffice {
    private ArrayList<Customer> customers;

    public PhoneOffice(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    protected void inputData() throws IOException {
        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).inputUsageTime();
            customers.get(i).inputMessage();
        }
    }

    private void sortByName() {
        for (int i = 0; i < customers.size() - 1; i++) {
            for (int j = 0; j < customers.size() - 1 - i; j++) {
                if (customers.get(j).getName().compareTo(
                        customers.get(j + 1).getName()) > 0) {
                    Customer temp = customers.get(j);
                    customers.set(j, customers.get(j + 1));
                    customers.set(j + 1, temp);
                }
            }
        }
    }

    protected void display() {
        sortByName();
        line();
        System.out.println("\t\t 이름(생일)\t 나이\t  전화번호\t 통화시간\t " +
                "문자건수\t 요금제\t  사용요금\t 세금\t     납부금액");
        line();
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
        line();
    }

    private void line() {
        for (int i = 0; i < 102; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}