package util.impl;

import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;

public class FileReaderTest {
    @Test
    public void testReadLine() throws IOException {
        FileReader fileReader = new FileReader("./src/main/resources/input.txt");

        Assert.assertEquals("Location: CA, 1 book at 17.99, 1 potato chips at 3.99", fileReader.readLine());
        Assert.assertEquals("Location: NY, 1 book at 17.99, 3 pencils at 2.99", fileReader.readLine());
        Assert.assertEquals("Location: NY, 2 pencils at 2.99, 1 shirt at 29.99", fileReader.readLine());
    }
}
