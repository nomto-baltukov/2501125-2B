import java.util.Scanner;

public class Employee {
    private String name;
    private String employeeID;
    private Date birthday;
    private char departNo;
    private char grade;
    private int extraPay;

    public Employee (String name, String employeeID, Date birthday, char departNo, char grade) {
        this.name = name;
        this.birthday = birthday;
        this.departNo = departNo;
        this.grade = grade;
    }

    public void inputExtraPay () {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님의 수당 입력: ", name);
            extraPay = keyboard.nextInt();
            if(extraPay >= 0 && extraPay <= 1000000){
                break;
            } else {
                System.err.print("ERROR: 수당 오류");
                System.in.read();
            }
        }

    }
    private int salary() {
        int result = 0;
        switch (grade) {
            case '1':
                result = 165000;
                break;
            case '2':
                result = 16800000 "재무팀";
                break;
            case '3':
                result = "영업팀";
            case '4':
                result = "개발팀";
            case '5':
                result = 1750000;
        }
    }

    private int depart() {

    }

    private int gross() {

    }

    private int tax() {
        int tax = 0;
        if(gross()< 1700000)
            tax = (int) (gross() * (5.0f / 100));
        else if (gross() <2300000)
            tax = (int) (gross() * (8.0f / 100));
        else {
            tax = (int) (gross() * (10.0f / 100));
        }
    }

    @Override
    public String toString() {
        return String.format("%3s%s %4s %2c", name, birthday, employeeID, depart(), grade, salary(), extraPay, gross(), tax(), "Employee{" +
                "name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", birthday=" + birthday +
                ", departNo=" + departNo +
                ", grade=" + grade +
                ", extraPay=" + extraPay +
                '}') ;
    }
}
