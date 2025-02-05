package ExerciciosPOO.Exercise18.domain;

public class Order {
    private OrderStatus orderStatus;
    private Product product;
    private int quantity;

    public Order(Product product, int quantity) {
        this.orderStatus = OrderStatus.PROCESSING;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderStatus=" + orderStatus +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }

    public void processOrder(){
        if(product.reduceStock(quantity)){
            orderStatus = OrderStatus.SENT;
            System.out.println("The Product " + product.getName() + ", was sent!");
        }else{
            orderStatus = OrderStatus.CANCELED;
            System.out.println("The Product " + product.getName() + ", was cancelled!");
        }
    }

    public void sentOrder(){
        if(orderStatus == OrderStatus.SENT){
            orderStatus = OrderStatus.DELIVERED;
            System.out.println("The Product " + product.getName() + ", was Delivered!");
        }else{
            System.out.println("The Product can't be delivered, Order status is " + orderStatus);
        }

    }
}
