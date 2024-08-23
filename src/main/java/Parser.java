public class Parser {
    /**
     * Splits the command string to extract the task number
     *
     * @param command The command string containing the command and task number
     * @return The task number as an integer
     */
    public int splitCommandAndTaskNumber(String command) {
        String taskNum = command.split(" ", 2)[1];
        return Integer.parseInt(taskNum);
    }

    public String splitCommandAndTaskDescription(String command) {
        return command.split(" ", 2)[1];
    }

    public String[] splitDeadlineCommand(String command) {
        return command.split("/by ", 2);
    }

    public String[] splitEventCommand(String command) {
        return command.split(" /", 3);
    }
}
