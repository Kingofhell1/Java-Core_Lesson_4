package Bank;

import Account.Account;
import Account.InsufficientFundsException;
public class Transaction  {
    public static void transfer(Account fromAccount, Account toAccount, double amount) {
        try {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Транзакция прошла успешно");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }


}
