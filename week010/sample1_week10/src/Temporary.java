public class Temporary extends Employee {
    private int workDay;
    private int dailyPay;
    public Temporary(String name, Date birthDay, String employeeID) {
        super(name, birthDay, employeeID);
        this.workDay = 0;
        this.dailyPay = 0;
    }
    protected void inputData() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        inputWorkday(keyboard);
        inputDailyPay(keyboard);
    }
    private void inputWorkday(Scanner keyboard) throws IOException {
        while (true) {
            System.out.printf("[%s] %s님의 일한 날수 입력 : ", "일용직",
                    super.getName());
            try {
                workDay = keyboard.nextInt();
                if (isValid(workDay))
                    break;
                else
                    error(keyboard, "근무일수는 음수일 수 없습니다.");
            } catch (Exception e) {
                error(keyboard, "유효한 숫자를 입력해주세요.");
            }
        }
    }
    private void inputDailyPay(Scanner keyboard) throws IOException {
        while (true) {
            System.out.printf("[%s] %s님의 일당 입력 : ", "일용직", super.getName());
            try {
                dailyPay = keyboard.nextInt();
                if (isValid1(dailyPay))
                    break;
                else
                    error(keyboard, "일당의 범위를 확인하세요.");
            } catch (Exception e) {
                error(keyboard, "유효한 숫자를 입력해주세요.");
            }
        }
    }
    @Override
    public int salary() {
        return workDay * dailyPay;
    }
    @Override
    public int tax() {
        return (int) (gross() * taxRate[0] / 100);
    }
}
@Override
public String toString() {
    return String.format("%s %c급-%c호 %2d %,7d원 %s %s",
            super.toString(), 'X', 'X', workDay, dailyPay, employeePrint(0), "일당제");
}

