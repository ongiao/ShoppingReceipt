package config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExemptCatagory {
    public static final Map<String, ArrayList<String>> EXEMPT_CATAGORIES = new HashMap<String, ArrayList<String>>() {{
        put("CA", new ArrayList<String>() {{
            add("potato chips");
        }});
        put("NY", new ArrayList<String>() {{
            add("shirt");
        }});
    }};
}
