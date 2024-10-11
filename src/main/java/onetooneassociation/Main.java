package onetooneassociation;

public class Main {
    public static void main(String[] args) {
        Account account=new Account("123","Suresh","savings",
                1000);
        Employee employee=new Employee("101","Ramesh",
                5000,
                "Hyderabad",account);
        employee.getEmployeeDetails();
    }
}
