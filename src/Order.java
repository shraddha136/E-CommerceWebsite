import java.util.List;

public class Order {
    private String orderId;
    private List<Item> itemList;
    private OrderStatus orderStatus;

    public boolean makePayment() {
        return false;
    }

    public boolean checkout() {
        return false;
    }

    public boolean addOrderLog() {
        return false;
    }
}
