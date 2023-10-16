public class Challenge {
    public static void main(String[] args){
        Account account = new Account();
        account.setNumber("12312312");
        account.setBalance(100000000);
        account.setCustomerName("Khuslen");
        account.setCustomerEmail("1@1");
        account.withdrawFunds(10000);
        account.depositFunds(200);
        account.withdrawFunds(100.0);
        account.withdrawFunds(100);
        account.depositFunds(100);
        account.withdrawFunds(45.55);
        account.withdrawFunds(54.46);
        account.withdrawFunds(54.45);

    }
}
