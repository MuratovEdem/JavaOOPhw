package HomeWork2;

public class CreditAccount implements Account {
    private double balance;

    public CreditAccount(double number) {
        this.balance = number;
    }

    @Override
    public void put(double number) {
        if (number >= 0) {
            balance += number;
        } else {
            throw new IllegalArgumentException("Введено некорретное значение");
        }
    }

    @Override
    public void take(double number){
        if (number >= 0 && (number * 1.01) <= balance) {
            balance = balance - (number * 1.01);
        } else {
            throw new IllegalArgumentException("Введено некорретное значение");
        }
    }

    @Override
    public double getAmount() {
        return balance;
    }

}
