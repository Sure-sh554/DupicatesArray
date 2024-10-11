package onetooneassociation;

public class Employee {
    private String employeeId;
    private String employeeName;
    private float employeeSalary;
    private String employeeAddress;
    private Account account;

    public Employee(String employeeId, String employeeName, float employeeSalary, String employeeAddress, Account account) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeAddress = employeeAddress;
        this.account = account;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee Details");
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("Employee Address: " + employeeAddress);
        System.out.println("Account Details");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Name: " + account.getAccountName());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Account Balance: " + account.getAccountBalance());
    }
}
