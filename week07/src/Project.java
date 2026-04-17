public interface Project {
    double A = 90.0;
    double B = 80.0;
    double C = 70.0;
    double D = 60.0;
    default boolean isValid(int score) {
        return score >= 0 && score <= 100;
    }
    default boolean isValid1(int score) {
        return score >= 0 && score <= 20;
    }
    default void error(String message) throws IOException {
        System.err.printf("ERROR : %s", message);
        System.in.read();
    }
}
