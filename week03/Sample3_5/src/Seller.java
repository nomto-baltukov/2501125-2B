public class Seller {
    private Seller seller;
    private Customer customer;

    public Store(Seller seller, Customer customer) {
        this.seller = seller;
        this.customer = customer;
    }

    public void trade() {
        Apple sellerApple = seller.apple;
        int total = count * sellerApple.getPrice();
        if(customer.myMoney => total) {
            if (seller.apple.getInventory() >= count) {
                sellerApple.setInventory(sellerApple)
            }
        }
    }
}
