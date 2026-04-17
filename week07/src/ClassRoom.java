import java.io.IOException;

public class ClassRoom {
    private Student[] students;
    public ClassRoom(Student[] students) {
        this.students = students;
    }
    protected void inputData() throws IOException {
        for (int i = 0; i < students.length; i++) {
            students[i].inputData();
            System.out.println();
        }
    }
    private void sortBySum() {
        Student temp;
        for (int i = 0; i < students.length-1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].average() < students[j].average()) {
                    temp = students[j];
                    students[j] = students[i];
                    students[i] = temp;
                }
            }
        }
    }
    private int getRank(int index) {
        int rank = 1;
        double score = students[index].average();    // 나의총점
        for (int i = 0; i < students.length; i++) {
            if (students[i].average() > score) {
                rank++;                   // 나의총점보다크면등수를더함
            }
        }
        return rank;
    }
    public void display(int type) {
        sortBySum();
        if (type == 1) {
            System.out.println("\t\t\t\t\t고등학생 성적표");
            line(53);
            System.out.printf("  학번 이름 %s  총점 평균 석차\n",
                    students[0].partNameList());
            line(53);
        }else {
            System.out.println("\t\t\t\t\t대학생 성적표");
            line(70);
            System.out.printf("  학번 이름 %s   점수 석차 \n",
                    students[0].partNameList());
            line(70);
        }
        for (int i = 0; i < students.length; i++)
            System.out.printf("%s %3d\n", students[i], getRank(i));
        if (type == 1)
            line(53);
        else
            line(70);
    }
    private void line(int count) {
        for (int i = 0; i < count; i++)
            System.out.print("*");
        System.out.println();
    }
}