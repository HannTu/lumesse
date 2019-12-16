package htulowiecka.lumesse.command;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCase extends Command {

    public String execute(String[] arguments) {
        return Arrays.stream(arguments)
                .map(CamelCase::capitalize)
                .collect(Collectors.joining());
    }

    private static String capitalize(String s){
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

}
