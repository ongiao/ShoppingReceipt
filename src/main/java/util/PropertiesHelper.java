package util;

import java.io.*;
import java.util.Properties;

public class PropertiesHelper {
    public static String getValue(String path, String key) throws IOException {
        InputStream in = new BufferedInputStream(new FileInputStream(path));

        Properties p = new Properties();
        p.load(in);

        return p.getProperty(key);
    }
}
