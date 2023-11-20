package HomeWork5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends Account {
    private LocalDate border;

    public DepositAccount(double bal) {
        super(bal);
    }

    @Override
    public void take(double number){
        if (border == null) {
            border = LocalDate.now();
        }
        LocalDate now = LocalDate.now();
        if (now.isAfter(border) || now.isEqual(border)) {
            balance -= number;
            border = LocalDate.now().plusMonths(1);
        } else {
            throw new IllegalArgumentException("Время еще не вышло");
        }

    }


}
