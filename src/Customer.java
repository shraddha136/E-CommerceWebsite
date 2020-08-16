public abstract class Customer {
    private ShoppingCart shoppingCart;
    private Order order;

    public ShoppingCart getShoppingCart() {
        return null;

    }

    public void addItemToCart(Item item) {

    }

    public void removeItemFromCart(Item item) {
    }

}

class Member extends Customer {
    private Account account;

    public OrderStatus placeOrder(Order order) {
        return null;
    }
}

class Guest extends Customer{
    public Account registerAccount() {
        return null;
    }
}