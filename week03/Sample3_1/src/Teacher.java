public class Teacher {
    // 1. 변수명은 관례적으로 소문자로 시작합니다 (Name -> name)
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void teach() {
        // 2. 클래스 내부에 정의된 'name'과 'subject'를 사용합니다.
        // 'book'은 이 클래스에 없으므로 'subject'를 출력하는 것이 적절합니다.
        System.out.printf("선생님(%s): 오늘은 %s 과목을 가르칠게요.\n", name, subject);
    }
}