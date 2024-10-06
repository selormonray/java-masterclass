public class Main {
    public static void main(String[] args) {

//        Account selormAccount = new Account("12345", 5000, "Sel Ah", "sel@test.com",
//                "+23352654775");

        Account selormAccount = new Account();

        System.out.println(selormAccount.getBalance());
        System.out.println(selormAccount.getNumber());

//        selormAccount.setNumber("12345");
//        selormAccount.setBalance(500_000);
//        selormAccount.setCustomerName("Sel Ah");
//        selormAccount.setCustomerEmail("sel@test.com");
//        selormAccount.setCustomerPhone("+233542401517");


        selormAccount.withdrawFunds(500);
        selormAccount.depositFunds(5000);
        selormAccount.withdrawFunds(500);

        selormAccount.withdrawFunds(4500);

        selormAccount.depositFunds(5000);
        selormAccount.withdrawFunds(2500.55);
        selormAccount.withdrawFunds(17256.55);

        Account edsAccount = new Account("Ed", "ed@mail.com", "2635681212");
        System.out.println("Account Number: " + edsAccount.getNumber() + "; name " + edsAccount.getCustomerName());
    }


}