package github.io.toandv.crackingthecodinginterview.arraysandstrings;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by toan on 5/5/17.
 */

@RunWith(Parameterized.class)
public class IsUniqueTest {

    private String inputString;

    private Boolean expectedResult;

    public IsUniqueTest(String inputString, Boolean expectedResult) {
        this.inputString = inputString;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {"abcabcabc", false},
                {"abcdefghijk123", true},
                {"", true},
                {"123", true},
                {"1231", false}
        });
    }

    @Test
    public void testUnique() {
        Assert.assertEquals(expectedResult, IsUnique.isUnique(inputString));
    }

}
