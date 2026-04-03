import java.io.IOException;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Customer[] customers = new Customer[]{
                new Customer("홍길동", "1365", new Home()),
                new Customer("이대한", "5678", new Government()),
                new Customer("이수도", "3333", new Factory()),
                new Customer("김천지", "4444", new Army()),
                new Customer("정밀도", "5234", new Home()),
                new Customer("정확한", "5567", new Business()),
                new Customer("이수한", "3473", new Business()),
                new Customer("김천도", "4564", new Army()),
                new Customer("정확도", "5895", new Factory()),
                new Customer("김이천", "5523", new Home())};
        WaterOffice office = new WaterOffice(customers);
        office.inputData();
        office.display();
    }
}