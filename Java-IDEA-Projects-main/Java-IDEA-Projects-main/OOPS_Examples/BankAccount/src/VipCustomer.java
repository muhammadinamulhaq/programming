public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("VIP", 999.9, "vip@gmail.com");
        System.out.println("Empty constructor called.");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "vip@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void vipCustomerInfo(){
        System.out.println("\nName: " + this.name + " Credit Limit: " + this.creditLimit + " Email: " + this.email);
    }
}
