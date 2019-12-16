package htulowiecka.lumesse.command;

public class Reverse extends Command {
    public String execute(String[] arguments) throws IllegalArgumentException {
        if (arguments.length != 1) {
            throw new IllegalArgumentException("REVERSE: Invalid argument count. Expected 1 got " + arguments.length);
        }
        return new StringBuilder(arguments[0])
                .reverse()
                .toString();
    }
}
