package HomeWork5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {

    @Test
    void testTake() {
        CreditAccount creditAccount = new CreditAccount(0);
        creditAccount.put(100);
        creditAccount.take(50);
        double actual = creditAccount.getAmount();
        double expected = 49.5;

        Assertions.assertEquals(expected, actual);
    }

}