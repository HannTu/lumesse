package htulowiecka.lumesse.command;

import org.junit.Assert;
import org.junit.Test;

public class SumTest {

    @Test
    public void addNumbers() {
        //given
        String[] words = {"1", "2", "3"};
        //when
        String result = new Sum().execute(words);
        //then
        Assert.assertEquals("6", result);
    }

    @Test(expected = NumberFormatException.class)
    public void handleIncorrectNumbers() {
        //given
        String[] words = {"1", "2", "f"};
        //when
        //should throw NumberFormatException
        new Sum().execute(words);
    }

    @Test
    public void handleEmptyArgumentList() {
        //given
        String[] words = {};
        //when
        String result = new Sum().execute(words);
        //then
        Assert.assertEquals("0", result);
    }
}
