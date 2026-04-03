public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void teach() {
        System.out.printf("선생님(%s): 오늘은 %s 과목을 가르칠게요.\n", name, subject);
    }

    // 추가: close 메서드를 정의합니다.
    public void close() {
        System.out.printf("선생님(%s): 오늘 %s 수업은 여기까지입니다. 다들 고생했어요!\n", name, subject);
    }
}