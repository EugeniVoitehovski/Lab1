package implemented;

public class MainString {

    public static final String FINAL_FILE = "" +
            "package generated; \n" +
            "\n" +
            "public class %s {\n" +
            "public static void main (String args[]){\n" +
            "try{\n" +
            "program();" +
            "} catch (Exception ex){" +
            "ex.printStackTrace();" +
            "}\n" +
            "}\n" +
            "\n" +
            "%s" +
            "\n" +
            "}" +
            "\n";
}
