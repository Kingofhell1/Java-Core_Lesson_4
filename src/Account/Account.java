package Account;
import javax.naming.InsufficientResourcesException;
import java.util.Scanner;
import Account.InsufficientFundsException;
public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Начальный баланс не может быть отрицательным");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма депозита не может быть отрицательной");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            throw new InsufficientFundsException("Недостаточно средств. Текущий баланс: " + this.balance);
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
