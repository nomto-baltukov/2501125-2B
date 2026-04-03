public class Book {
    private String title;

    // 생성자: 매개변수 부분의 쉼표(,)를 제거하고 올바르게 수정했습니다.
    public Book(String title) {
        this.title = title;
    }

    // getter 메서드 (필요시 추가)
    public String getTitle() {
        return title;
    }

    // Object 클래스의 toString 메서드를 오버라이드하여 객체 정보를 출력합니다.
    @Override
    public String toString() {
        return "Book [title=" + title + "]";
    }
}