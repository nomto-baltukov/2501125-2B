public class Box {
    private int width;
    private int height;
    private int depth;
    private String color;
    private String message;

    public Box(int width, int height, int depth, String color, String message) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format(
                ">>>> %s Box <<<<<\n" +
                        "\t가로 : %d Cm\n" +
                        "\t세로 : %d Cm\n" +
                        "\t높이 : %d Cm\n" +
                        "\t문구 : %s\n",
                color, width, height, depth, message
        );
    }
}