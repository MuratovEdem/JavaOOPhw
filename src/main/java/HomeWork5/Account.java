package HomeWork5;

public class Account {
    protected double balance;

    public Account(double bal) {
        balance = bal;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void put(double number) {
        if (number >= 0) {
            balance += number;
        } else {
            throw new IllegalArgumentException("Введено некорретное значение");
        }
    }

    public void take(double number) {
        if (number >= 0 && number <= balance) {
            balance -= number;
        } else {
            throw new IllegalArgumentException("Введено некорретное значение");
        }
    }

    public double getAmount() {
        return balance;
    }

}
