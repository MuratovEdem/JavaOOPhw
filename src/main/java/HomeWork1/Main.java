package HomeWork1;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(1000);
        account.put(5000);
        account.take(3500);
        System.out.println(account.getAmount());

        CreditAccount creditAccount = new CreditAccount();
        creditAccount.setBalance(5000);
        creditAccount.take(100);
        System.out.println(creditAccount.getAmount());


        DepositAccount depositAccount = new DepositAccount();
        depositAccount.setBalance(1000);
        depositAccount.take(100);
        System.out.println(depositAccount.getAmount());
        depositAccount.take(100);
    }
}