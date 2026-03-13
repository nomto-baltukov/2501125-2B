public class Main {
    public static void main(String[] args) {

        FastFood pizza = new FastFood("경복 피자", 14);

        System.out.println(pizza);
        System.out.println("넓이: " + pizza.area());
        System.out.println("반지름: " + pizza.getRadius());

    }
}