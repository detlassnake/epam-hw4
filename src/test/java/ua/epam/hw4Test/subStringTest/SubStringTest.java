package ua.epam.hw4Test.subStringTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import ua.epam.hw4.subString.SubString;

public class SubStringTest {
    SubString subStr = new SubString();
    String input11 = "1234567";
    String input12 = "871234";
    String result1 = "1234";

    String input21 = "123456";
    String input22 = "987";
    String result2 = "";

    @Test
    public void testSubString() {
        assertEquals(subStr.commonSubString(input11,input12),result1);
    }
    @Test
    public void testNoSubString() {
        assertEquals(subStr.commonSubString(input21,input22),result2);
    }
}
