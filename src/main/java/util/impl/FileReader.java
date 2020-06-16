package util.impl;

import util.IReader;
import java.io.*;

public class FileReader implements IReader {
    BufferedReader bufferedReader;

    public FileReader (String filename) throws FileNotFoundException {
        File file = new File(filename);
        bufferedReader = new BufferedReader(new java.io.FileReader(file));
    }

    public String readLine () throws IOException {
        String str;
        str = bufferedReader.readLine();
        if (str!=null){
            return str;
        } else {
            return "";
        }
    }
}
