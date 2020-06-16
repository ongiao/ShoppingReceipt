package util;

import java.math.BigDecimal;

public class DigitHelper {
    public static Double roundup(Double value) {
        return Math.ceil(value * 20.0) / 20.0;
    }

    public static double formatDigit(double value) {
        BigDecimal b = new BigDecimal(value);
        double f1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return f1;
    }
}
