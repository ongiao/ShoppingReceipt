package config;

import org.junit.Assert;
import org.junit.Test;

public class ExemptCatagoryTest {
    @Test
    public void testExemptMap() {
        Assert.assertEquals(true, ExemptCatagory.EXEMPT_CATAGORIES.get("CA").contains("potato chips"));
        Assert.assertEquals(true, ExemptCatagory.EXEMPT_CATAGORIES.get("NY").contains("shirt"));
        Assert.assertEquals(false, ExemptCatagory.EXEMPT_CATAGORIES.get("CA").contains("book"));
    }
}
