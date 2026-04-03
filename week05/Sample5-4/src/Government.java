public class Government extends Customer{
public Government(String name, String waterNo) {
        super(name, waterNo);
        super.type= newType("관공서", 35, 1.5f);
    }
}
