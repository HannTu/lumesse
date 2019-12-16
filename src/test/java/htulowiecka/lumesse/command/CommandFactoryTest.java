package htulowiecka.lumesse.command;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CommandFactoryTest {

    @Test
    public void createCorrectCommands() {
        //given
        List<String> commandNames = Arrays.asList("CC", "ORDER", "REVERSE", "SUM");
        List<Class<? extends Command>> classes = Arrays.asList(
                CamelCase.class, Order.class, Reverse.class, Sum.class
        );
        CommandFactory commandFactory = new CommandFactory();
        //when
        //then
        for (int i = 0; i < commandNames.size(); ++i) {
            Assert.assertEquals(commandFactory.fromName(commandNames.get(i)).getClass(), classes.get(i));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void handleIncorrectCommandName() {
        //given
        String invalidName = "sum";
        CommandFactory commandFactory = new CommandFactory();
        //when
        commandFactory.fromName(invalidName);
    }
}