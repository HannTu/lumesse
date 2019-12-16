package htulowiecka.lumesse.command;

import java.util.Arrays;

public class Sum extends Command {
    public String execute(String[] arguments) {
        return "" + Arrays.stream(arguments)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
