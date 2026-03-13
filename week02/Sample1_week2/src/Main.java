public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("홍길동");
        person.setAge(30);
        person.setGender(true);
        person.setMaried(true);
        person.setChildren(5);

        System.out.println(person);

        Person hong = new Person("홍길동", 30, true, true, 5);
    }
}