import org.junit.Test;
import static org.junit.Assert.*;

public class ArmstrongNumberTest {

    public boolean isArmstrong(int n) {
        if (n < 0) {
            return false;
        }

        int original = n;
        int sum = 0;
        int digits = 0;
        int temp = n;

        if (n == 0) {
            return true;
        }

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        return sum == original;
    }

    @Test
    public void testArmstrongTrue() {
        assertTrue(isArmstrong(153));
    }

    @Test
    public void testArmstrongFalse() {
        assertFalse(isArmstrong(123));
    }

    @Test
    public void testArmstrongSingleDigit() {
        assertTrue(isArmstrong(7));
    }
}
