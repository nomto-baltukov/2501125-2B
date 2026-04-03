public class Home extends Customer{
    public Home(String name, String waterNo) {  // 생성자
        super(name, waterNo);
        super.type= newType("가정용", 40, 5.0f);
    }
}
