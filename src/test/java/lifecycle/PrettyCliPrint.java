package lifecycle;

public class PrettyCliPrint {

    static final String STATIC_FINAL_STRING = "static final String";
    static final String STATIC_STRING = "static String";
    static final String STRING = "String";

    /* ---------- */

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";

    static void same(String name, String value) {
//        System.out.format("%24s | %s %s\n\r", name, "=", value);
        format(name, value, "=", ANSI_RESET);
    }

    static void changed(String name, String value) {
//        System.out.format("%24s | %s%s %s\n\r", name, ANSI_YELLOW, "+", value);
        format(name, value, "+", ANSI_BLUE);
    }

    static void error(String name, String value) {
//        System.out.format("%24s | %s%s %s\n\r", name, ANSI_RED, "!", value);
        format(name, value, "!", ANSI_RED);
    }

    private static void format(String name, String value, String sign, String color) {
        System.out.format("%s%24s %s| %s%s %s\n\r", ANSI_YELLOW, name, ANSI_RESET, color, sign, value);
    }

}
