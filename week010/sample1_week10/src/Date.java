import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;

public class Date implements Symbol {
    private LocalDate birthDate;

    public Date(int year, int month, int day) throws IOException {
        try {
            this.birthDate = LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            inputError("잘못된 날짜입니다.");
            this.birthDate = null;
        }
    }

    public int age() {// 나이 계산
        if (birthDate == null)
            error("유효하지 않은 생년월일입니다.");
        LocalDate today = LocalDate.now();
        return Period.between(birthDate, today).getYears();
    }

    @Override
    public String toString() {
        return String.format("(%4d년 %2d월 %2d일)", birthDate.getYear(),
                birthDate.getMonthValue(), birthDate.getDayOfMonth());
    }
}