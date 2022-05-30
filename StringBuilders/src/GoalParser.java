public class GoalParser {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        command.replace("()", "o");
        command.replace("(al)", "al");
        command.replace("G", "G");

        return ;
    }
}
