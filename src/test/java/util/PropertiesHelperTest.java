package util;

import config.Resources;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;

public class PropertiesHelperTest {
    @Test
    public void testGetValue() throws IOException {
        String filePath = Resources.TAX_RATE_FILE_PATH;

        Assert.assertEquals(String.valueOf(0.0975), PropertiesHelper.getValue(filePath, "CA"));
        Assert.assertEquals(String.valueOf(0.08875), PropertiesHelper.getValue(filePath, "NY"));
    }
}
