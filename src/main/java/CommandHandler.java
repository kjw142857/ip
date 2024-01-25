public class CommandHandler {
    /**
     * Indents a given line.
     *
     * @param line Line to be indented.
     *
     * @return Indented line.
     */
    public static String indentLine(String line) {
        return "  " + line;
    }
    /**
     * Prints the command typed in by the user.
     *
     * @param command Command entered.
     */
    public static void echoCommand(String command) {
        System.out.println(indentLine(command));
    }

    /**
     * Prints the exit line.
     */
    public static void exit() {
        String exitLine = "Bye. Gonna go back to sleep now *yawn*";
        System.out.println(indentLine(exitLine));
    }
}
