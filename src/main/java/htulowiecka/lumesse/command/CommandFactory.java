package htulowiecka.lumesse.command;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private static final Map<String, Command> COMMAND_NAMES;

    static {
        Map<String, Command> commands = new HashMap<>();
        commands.put("CC", new CamelCase());
        commands.put("ORDER", new Order());
        commands.put("REVERSE", new Reverse());
        commands.put("SUM", new Sum());
        COMMAND_NAMES = Collections.unmodifiableMap(commands);
    }

    public Command fromName(String name) throws IllegalArgumentException {
        if (!COMMAND_NAMES.containsKey(name)) {
            throw new IllegalArgumentException("Incorrect command name. Got " + name);
        }
        return COMMAND_NAMES.get(name);
    }
}
