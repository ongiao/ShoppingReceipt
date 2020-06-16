package util;

import org.junit.Assert;
import org.junit.Test;

public class StringHelperTest {
    @Test
    public void testEnsureSpace() {
        String str = "item      price";

        int expectedSpaceCount = 5;
        String gotSpaceStr = StringHelper.ensureSpace(str.indexOf("price") - 1, "item");
        int gotSpaceCount = gotSpaceStr.length();

        Assert.assertEquals(expectedSpaceCount, gotSpaceCount);
        Assert.assertEquals("", gotSpaceStr.trim());
    }
}
