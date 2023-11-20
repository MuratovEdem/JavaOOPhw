package HomeWork5;

public class CreditAccount extends Account {

    public CreditAccount(double bal) {
        super(bal);
    }

    @Override
    public void take(double number){
        if (number >= 0 && (number * 1.01) <= balance) {
            balance = balance - (number * 1.01);
        } else {
            throw new IllegalArgumentException("Введено некорретное значение");
        }
    }
}
