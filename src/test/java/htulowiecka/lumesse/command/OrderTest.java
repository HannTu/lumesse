package htulowiecka.lumesse.command;

import org.junit.Assert;
import org.junit.Test;

public class OrderTest {

    @Test
    public void orderLexicographically() {
        //given
        String[] words = {"bd", "cb", "ac"};
        //when
        String result = new Order().execute(words);
        //then
        Assert.assertEquals("ac bd cb", result);
    }

    @Test
    public void handleEmptyArgumentList() {
        //given
        String[] words = {};
        //when
        String result = new Order().execute(words);
        //then
        Assert.assertEquals("", result);
    }
}
