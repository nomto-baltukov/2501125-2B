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

    // ДОБАВЬТЕ ЭТОТ МЕТОД:
    public Date getBirthDay() {
        return birthDay;
    }

    @Override
    public String toString() {
        // Здесь birthDay (объект класса Date) автоматически вызовет свой toString()
        return String.format("%3s%s %2d세 ", name, birthDay, birthDay.getAge());
    }
}