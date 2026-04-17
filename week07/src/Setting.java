import java.io.IOException;
import java.util.Scanner;

public class Setting implements Project {
    public int typeSelect() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int type;
        while (true) {
            System.out.print("type 선택 \n고등학교 = 1, 대학교 = 2 : ");
            type = keyboard.nextInt();
            if (type == 1 || type == 2)
                break;
            else
                error("입력 오류");
        }
        return type;
    }
    protected Student[] prepare(int type, Person[] persons) {
        Student[] students;
        if (type == 1) {
            students = new HighSchool[persons.length];
        } else {
            students = new University[persons.length];
        }
        for (int i = 0; i < students.length; i++) {
            if (type == 1)
                students[i] = new HighSchool(persons[i].getStudentID(),
                        persons[i].getName());
            else
                students[i] = new University(persons[i].getStudentID(),
                        persons[i].getName());
        }
        return students;
    }
}
