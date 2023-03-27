import org.example.accounts.Account;
import org.example.accounts.SavingsAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class MainTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new SavingsAccount("Aleksandr", 10000, 50000);
    }

    @Test
    @DisplayName("Пополнение счета на 5000")
    void savingsAdd() {
        Assertions.assertTrue(account.add(5000));
    }

    @Test
    @DisplayName("Снятие 5000")
    void savingsPayFour() {
        Assertions.assertTrue(account.pay(5000));
    }

    @Test
    @DisplayName("Снятие 5001")
    void savingsPayFive() {
        Assertions.assertFalse(account.pay(5001));
    }
}
