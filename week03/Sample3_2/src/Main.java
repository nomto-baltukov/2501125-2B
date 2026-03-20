public class Main {
    public static void main(String[] args) {
        // 1. 객체 생성
        Book book = new Book("자바의 정석"); // "정식"을 "정석"으로 살짝 고쳤어요!
        Student student = new Student("김영희");
        Teacher teacher = new Teacher("김철수", "JAVA");

        // 2. 메서드 호출
        teacher.teach();

        // 중요: 생성한 book 객체를 인수로 전달합니다.
        student.study(book);
    }
}