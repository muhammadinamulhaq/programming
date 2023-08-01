public class Main {
    public static void main(String[] args) {
        BankAccount AB01 = new BankAccount("2872", 1000, "Abhishek Chandra", "1ac23456789@gmail.com", "8750074055");

//        AB01.setCustomerName("Abhishek Chandra");
//        AB01.setAccountNumber("2872");
//        AB01.setBalance(1000);
//        AB01.setEmail("1ac23456789@gmail.com");
//        AB01.setPhoneNumber("8750074055");

        AB01.accountDetails();

        AB01.depositFunds(1000);

        AB01.accountDetails();

        AB01.withdrawalFunds(10000);

        AB01.accountDetails();

        AB01.withdrawalFunds(1000);

        AB01.accountDetails();

        BankAccount AB02 = new BankAccount();

        AB02.accountDetails();

        BankAccount AB03 = new BankAccount("Monika", "monika1999@gmail.com", "9872101000");

        AB03.accountDetails();

        VipCustomer VI01 = new VipCustomer();
        VI01.vipCustomerInfo();

        VipCustomer VI02 = new VipCustomer("Abhishek", 1000);
        VI02.vipCustomerInfo();

        VipCustomer VI03 = new VipCustomer("Abhishek", 1000, "abhishek@gmail.com");
        VI03.vipCustomerInfo();
    }
}
