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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", birthday=" + birthday +
                ", departNo=" + departNo +
                ", grade=" + grade +
                ", extraPay=" + extraPay +
                '}';
    }
}

