package HomeWork1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends Account {
    private LocalDate action;
    private LocalDate border;

    @Override
    public void take(double number){
        if (border == null) {
            border = LocalDate.now();
        }
        LocalDate now = LocalDate.now();
        if (now.isAfter(border) || now.isEqual(border)) {
            balance -= number;
            action = LocalDate.now();
            border = action.plus(1, ChronoUnit.MONTHS);
        } else {
            throw new IllegalArgumentException("Время еще не вышло");
        }

    }


}
