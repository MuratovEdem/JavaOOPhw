package HomeWork2;

public abstract class AbstractAccount {
    public double balance;

    public AbstractAccount(double number) {
        this.balance = number;
    }

    public void put(double number) {
        if (number >= 0) {
            balance += number;
        } else {
            throw new IllegalArgumentException("Введено некорретное значение");
        }
    }

    public abstract void take(double number);


    public double getAmount() {
        return balance;
    }
}
