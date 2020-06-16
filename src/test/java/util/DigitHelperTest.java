package util;

import org.junit.Assert;
import org.junit.Test;

public class DigitHelperTest {
    @Test
    public void testRoundup() {
        Double[] actual = new Double[] {1.13, 1.16, 1.151, 2.3927};
        Double[] expected = new Double[] {1.15, 1.20, 1.20, 2.4};


        for (int i = 0; i < actual.length; i++) {
            double got = DigitHelper.roundup(actual[i]);
            Assert.assertEquals(expected[i].toString(), String.valueOf(got));
        }
    }

    @Test
    public void testFormatDigit() {
        Double[] actual = new Double[] {21.979999999999997, 36.519999999999996, 2.4000000000000004};
        Double[] expect = new Double[] {21.98, 36.52, 2.4};

        for (int i = 0; i < actual.length; i++) {
            double got = DigitHelper.formatDigit(actual[i]);
            Assert.assertEquals(String.valueOf(expect[i]), String.valueOf(got));
        }
    }
}
