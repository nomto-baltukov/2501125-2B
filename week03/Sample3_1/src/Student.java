public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    // (수정 전) public void study()
    // (수정 후) Book 객체를 인수로 받도록 변경
    public void study(Book book) {
        // book.getTitle()은 Book 클래스에 정의된 메서드여야 합니다.
        System.out.printf("학생(%s): 네 ~ %s으로 공부할게요\n", name, book.getTitle());
    }
}