public class Seller {
    private Apple apple;
    private int myMoney;

    public Seller(Apple apple, int myMoney) {
        this.apple = apple;
        this.myMoney = myMoney;
    }

    public boolean sale(int count) {
        boolean flag = true;
        if(this.apple.getInventory() >= count) {
            apple.setInventory();
        } else {
            System.out.println("ERROR : 재고랑이 부족 합니다");
            flag = false;
        }
        return flag;
    }

    @Override
    public String toString() {
        return String.format("판매자 : 현금 : %, d워느 사과 : %d, 개 보유 ", ,);
    }
}
