import java.io.File;
import java.util.ArrayList;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main implements Constant{
    public static void main(String[] args) {
        ArrayList<Customer> customers;
        File file = new File(path + fileName);
        if (file.exists()) {
            FileHandler handler = new FileHandler();
            customers = handler.dataRead(file);
            PowerOffice office = new PowerOffice(customers);
            office.sortByPay();
            OutputHandler outputHandler = new OutputHandler();
            outputHandler.display(customers);
        }else {
            System.out.printf("Data File %s가 준비되지 않았습니다.", path +
                    fileName);
        }
    }
}
