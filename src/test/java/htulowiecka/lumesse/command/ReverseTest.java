package htulowiecka.lumesse.command;

import org.junit.Assert;
import org.junit.Test;

public class ReverseTest {

    @Test
    public void reverseString() {
        //given
        String[] words = {"abcd"};
        //when
        String result = new Reverse().execute(words);
        //then
        Assert.assertEquals("dcba", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwExceptionOnNoArguments() {
        //given
        String[] words = {};
        //when
        //should throw IllegalArgumentException
        new Reverse().execute(words);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwExceptionOnTooManyArguments() {
        //given
        String[] words = {"ab", "cd"};
        //when
        //should throw IllegalArgumentException
        new Reverse().execute(words);
    }
}
