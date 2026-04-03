public class TVTest {
    public static void main(String[] args) {

        TV myTV = new TV();

        myTV.brand = "Samsung";
        myTV.year = 2017;
        myTV.size = 55;
        myTV.type = "LED";

        myTV.printInfo();
    }
}