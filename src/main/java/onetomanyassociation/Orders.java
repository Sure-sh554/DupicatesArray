package onetomanyassociation;

public class Orders {
    private Long orderId;
    private String orderName;
    private Double orderPrice;

    public Orders(Long orderId, String orderName, Double orderPrice) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderPrice = orderPrice;

    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }


}
