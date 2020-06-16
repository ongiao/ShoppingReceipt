package util;

public class StringHelper {
    public static String ensureSpace (int index, String word) {
        int spaceNum = index - word.length();
        String space = "";

        for (int i = 0; i < spaceNum; i++) {
            space += " ";
        }

        return space;
    }
}
