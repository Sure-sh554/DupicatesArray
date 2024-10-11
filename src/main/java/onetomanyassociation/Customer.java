package onetomanyassociation;

public class Customer {
    private Long customerId;
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;
    private Orders[] orders;
    private int orderCount;
    private int maxOrdes;

    public Customer(Long customerId, String customerName,
                    String customerAddress, String customerEmail,
                    String customerPhone, Orders[] orders, int orderCount, int maxOrdes) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.maxOrdes = maxOrdes;
        this.orders = new Orders[maxOrdes];
        this.orderCount = 0;
    }

    public void addOrder(Orders order) {
        if (orderCount < maxOrdes) {
            orders[orderCount] = order;

            orderCount++;
        } else {
            System.out.println("Maximum orders reached for this customer.");
        }
    }

    public void getCustomerDetails() {
        System.out.println("Customer Details");
        System.out.println("Customer Id : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer Address : " + customerAddress);
        System.out.println("Customer Email : " + customerEmail);
        System.out.println("Customer Phone : " + customerPhone);
        System.out.println("Orders : ");
        for (Orders order : orders) {
            System.out.println("Order Id : " + order.getOrderId());
            System.out.println("Order Name : " + order.getOrderName());
            System.out.println("Order price : " + order.getOrderPrice());

        }
    }

}
