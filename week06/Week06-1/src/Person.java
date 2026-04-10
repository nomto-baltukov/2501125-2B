public class Person {
    protected String name;
    protected Date birthDay;
    public Person(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return String.format("%3s%s %2d세 ", name, birthDay, birthDay.getAge());
    }
}
