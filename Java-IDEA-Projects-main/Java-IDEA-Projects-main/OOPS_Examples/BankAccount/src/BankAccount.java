public class BankAccount {
    private String accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("2872", 0, "NULL", "NULL", "NULL");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, long balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("2872", 999, customerName, email, phoneNumber);
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }

    public long getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositFunds(int depositAmount){
        this.balance += depositAmount;
        System.out.println("Rs. " + depositAmount + " deposited in " + this.customerName + "'s account. Available Balance: " + this.balance);
    }

    public void withdrawalFunds(int withdrawalAmount){
        if(this.balance < withdrawalAmount){
            System.out.println("Balance Insufficient to withdrawal Rs. " + withdrawalAmount + ". Available Balance: " + this.balance);
            return;
        }
        this.balance -= withdrawalAmount;
        System.out.println("Rs. " + withdrawalAmount + " withdrawal from your account. Available Balance: " + this.balance);
    }

    public void accountDetails(){
        System.out.println("Account Details:" +
                "\nCustomer Name: " + this.customerName +
                "\nAccount Number: " + this.accountNumber +
                "\nBalance: " + this.balance +
                "\nEmail: " + this.email +
                "\nPhone Number: " + this.phoneNumber + "\n\n");
    }
}
