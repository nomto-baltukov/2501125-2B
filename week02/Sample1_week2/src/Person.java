public class Person {

    private String name;
    private int age;
    private boolean gender;
    private boolean isMaried;
    private int children;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, boolean gender, boolean isMaried, int children) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMaried = isMaried;
        this.children = children;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setMaried(boolean isMaried) {
        this.isMaried = isMaried;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    @Override
    public String toString() {
        String genderStr = gender ? "남자" : "여자";
        String marriedStr = isMaried ? "결혼했습니다" : "미혼입니다";

        return String.format(
                "나이는 %d살, 이름은 %s인 %s가 있습니다. 결혼 상태: %s, 자식은 %d명 있습니다.",
                age, name, genderStr, marriedStr, children
        );
    }
}