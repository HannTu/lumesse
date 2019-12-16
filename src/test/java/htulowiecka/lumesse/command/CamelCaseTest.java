package htulowiecka.lumesse.command;

import org.junit.Assert;
import org.junit.Test;

public class CamelCaseTest {

    @Test
    public void capitalizeLowercaseStrings() {
        //given
        String[] words = {"abc", "def", "ghi"};
        //when
        String result = new CamelCase().execute(words);
        //then
        Assert.assertEquals("AbcDefGhi", result);
    }

    @Test
    public void capitalizeUppercaseStrings() {
        //given
        String[] words = {"ABC", "DEF", "GHI"};
        //when
        String result = new CamelCase().execute(words);
        //then
        Assert.assertEquals("ABCDEFGHI", result);
    }

    @Test
    public void handleEmptyArgumentList() {
        //given
        String[] words = {};
        //when
        String result = new CamelCase().execute(words);
        //then
        Assert.assertEquals("", result);
    }
}
