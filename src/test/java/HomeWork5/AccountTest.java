package HomeWork5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testPut() {
        Account account = new Account(0);
        account.put(100);
        double actual = account.getAmount();
        double expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPut2() {
        Account account = new Account(48);
        account.put(36);
        double actual = account.getAmount();
        double expected = 84;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testTake() {
        Account account = new Account(0);
        account.put(100);
        account.take(36);
        double actual = account.getAmount();
        double expected = 64;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testTake2() {
        Account account = new Account(0);
        account.put(73);
        account.take(28);
        double actual = account.getAmount();
        double expected = 45;

        Assertions.assertEquals(expected, actual);
    }

}