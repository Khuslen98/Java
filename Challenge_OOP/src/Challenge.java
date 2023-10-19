public class Challenge {
    public static void main(String[] args){

//        Account account = new Account("123", 1000.00, "Bob", "email@e" ,"1299319321");
        Account account = new Account();
        System.out.println(account.getNumber());
        System.out.println(account.getBalance());

//        account.setNumber("12312312");
//        account.setBalance(100000000);
//        account.setCustomerName("Khuslen");
//        account.setCustomerEmail("1@1");
//        account.withdrawFunds(10000);

        account.depositFunds(200);
        account.withdrawFunds(100.0);

        account.withdrawFunds(100);
        account.depositFunds(100);
        account.withdrawFunds(45.55);

        account.withdrawFunds(54.46);
        account.withdrawFunds(54.45);

        Account saccount = new Account("Khus", "khu@gmail", "123");
        System.out.println("AccountNo : " + saccount.getNumber() + ": name " + saccount.getCustomerName());

    }
}
