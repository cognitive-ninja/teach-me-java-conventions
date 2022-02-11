package powerpackage;
import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void one_power_one_is_one() {
        assert PowerFinder.calcPower(1,1) == 1;
    }

    @Test
    public void two_power_one_is_two() {
        assert PowerFinder.calcPower(2,1) == 2;
    }

    @Test
    public void two_power_two_is_four() {
        assert PowerFinder.calcPower(2, 2) == 4;
    }

    @Test
    public void three_power_two_is_nine() {
        assert PowerFinder.calcPower(3, 2) == 3*3;
    }
}
