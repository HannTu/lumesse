package htulowiecka.lumesse.command;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Order extends Command {
    public String execute(String[] arguments) {
        return Arrays.stream(arguments)
                .sorted()
                .collect(Collectors.joining(" "));
    }
}
