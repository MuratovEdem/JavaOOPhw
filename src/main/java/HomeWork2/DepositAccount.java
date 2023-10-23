package HomeWork2;

import java.time.LocalDate;


public class DepositAccount implements Account {
    private double balance;
    private LocalDate border;

    public DepositAccount(double number) {
        this.balance = number;
        this.border = LocalDate.now();
    }

    @Override
    public void put(double number) {
        if (number >= 0) {
            this.balance += number;
        } else {
            throw new IllegalArgumentException("Введено некорретное значение");
        }
    }

    @Override
    public void take(double number) {
        LocalDate now = LocalDate.now();
        if (now.isAfter(border) || now.isEqual(border)) {
            this.balance -= number;
            border = LocalDate.now().plusMonths(1);
        } else {
            throw new IllegalArgumentException("Время еще не вышло");
        }

    }

    @Override
    public double getAmount() {
        return this.balance;
    }
}