import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Type[] types = new Type[]{
                new Type('0', "", 0, 0.0f),
                new Type('1', "가정용", 40, 5.0f),
                new Type('2', "영업용", 55, 3.5f),
                new Type('3', "공장용", 78, 2.5f),
                new Type('4', "관공서", 35, 1.5f),
                new Type('5', "군기관", 20, 0.0f)
        };

        Customer[] customers = new Customer[]{
                new Customer("홍길동", "1365", types[1]),
                new Customer("이대한", "5678", types[4]),
                new Customer("이수도", "3333", types[3]),
                new Customer("김천지", "4444", types[5]),
                new Customer("정밀도", "5234", types[1]),
                new Customer("정확한", "5567", types[2]),
                new Customer("이수한", "3473", types[2]),
                new Customer("김천도", "4564", types[5]),
                new Customer("정확도", "5895", types[3]),
                new Customer("김이천", "5523", types[1])
        };

        WaterOffice office = new WaterOffice(customers);
        office.inputData();
        office.display();
    }
}