import java.time.LocalDate;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setYear(int year) {
        if (year >= 1) {
            this.year = year;
        } else {
            System.err.println("ERROR : 년도 오류");
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.err.println("ERROR : 월 오류");
        }
    }

    public void setDate(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void setDay(int day) {
        int maxDays = getMaxDaysInMonth();
        if (day >= 1 && day <= maxDays) {
            this.day = day;
        } else {
            System.err.println("ERROR : 일자 오류");
        }
    }

    private int getMaxDaysInMonth() {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, day);

        int age = today.getYear() - birthDate.getYear();


        if (today.getMonthValue() < birthDate.getMonthValue() ||
                (today.getMonthValue() == birthDate.getMonthValue() && today.getDayOfMonth() < birthDate.getDayOfMonth())) {
            age--;
        }

        return age;
    }

    @Override
    public String toString() {
        return String.format("(%04d년 %02d월 %02d일)", year, month, day);
    }
}