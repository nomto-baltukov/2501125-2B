public class Customer {
    private Apple apple;
    private int myMoney;

    public Customer(int myMoney) {
        this.apple = null;
        this.myMoney = myMoney;
    }

    public  void buy(Seller seller, Apple apple, int count){
        int total = count * apple.getPrice();

        if(myMoney >= total) {
            if(seller.sale(count)) {

            } else {
                System.out.println("ERROR: 판매자의 재고 부족");
            }
        } else {
            System.out.println("ERROR: 예산이 부족합니다.");
        }
    }
}
