package onetomanyassociation;

public class Main {
    public static void main(String[] args) {
        Orders orders4 = new Orders(1L, "Blender", 22.2);
        Orders orders1 = new Orders(2L, "Fridge", 22.2);
        Orders orders2 = new Orders(3L, "AC", 22.2);
        Orders orders3 = new Orders(4L, "Washing Machine", 22.2);
        Orders[] orders = new Orders[]{orders4, orders1, orders2, orders3};
        Customer customer = new Customer(1L, "Suresh",
                "abc", "abc@gmail.com",
                "2222", orders, 2, 10);
        customer.getCustomerDetails();


    }
}

