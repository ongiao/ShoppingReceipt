package config;

import org.junit.Assert;
import org.junit.Test;

public class ResourcesTest {
    @Test
    public void testResources() {
        Assert.assertEquals("./src/main/resources/input.txt", Resources.INPUT_FILE_PATH);
        Assert.assertEquals("./src/main/resources/taxRate.properties", Resources.TAX_RATE_FILE_PATH);
    }
}
