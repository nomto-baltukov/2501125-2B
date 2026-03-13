public class FastFood {
    private String name;
    private int radius;

    private final float PI;



    public FastFood (String name, int radius) {
        this.name = name;
        this.radius = radius;
        this.PI = 3.141592f;
    }

    public int getRadius() {
        return radius;
    }

    public float area() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        float diameter = radius * 2;
        float circumference = 2 * PI * radius;
        float area = PI * radius * radius;

        return String.format(
                "FastFood 정보\n" +
                        "이름: %s\n" +
                        "반지름: %d\n" +
                        "지름: %.2f\n" +
                        "둘레: %.2f\n" +
                        "넓이: %.2f",
                name, radius, diameter, circumference, area
        );
    }
}
