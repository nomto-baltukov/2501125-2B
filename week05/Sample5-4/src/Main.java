import java.io.IOException;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Customer[] customers = new Customer[]{
                new Home("홍길동", "1365"),
                new Government("이대한", "5678"),
                new SmallFactory("이수도", "3333"),
                new Army("김천지", "4444"),
                new Home("정밀도", "5234"),
                new Restaurant("정확한", "5567"),
                new Store("이수한", "3473"),
                new Army("김천도", "4564"),
                new LargeFactory("정확도", "5895"),
                new Home("김이천", "5523")};
        WaterOffice office = new WaterOffice(customers);
        office.inputData();
        office.display();
    }
}