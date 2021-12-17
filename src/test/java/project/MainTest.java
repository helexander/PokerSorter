package project;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test_PokerHandRegexConstructor() {
        String testInputShouldPass = "4H 4C 6S 7S KD 2C 3S 9S 9D TD";
        String testInputShouldFail = "JS 9S 6S JD 5H 9D K9 8H 5S DD";

        String moreThanTenCards = "8H 7D QH 3H QD 3S 4H 2D 7H TD 2C JH QD";
        String equalTenCards = "TH 8H 7S QS 7D 5S 6C 9S 8D 2H";

        Assert.assertEquals(true, testInputShouldPass.matches(Main.VALID_PATTERN));
        Assert.assertEquals(false, testInputShouldFail.matches(Main.VALID_PATTERN));

        Assert.assertEquals(false, moreThanTenCards.matches(Main.VALID_PATTERN));
        Assert.assertEquals(true, equalTenCards.matches(Main.VALID_PATTERN));
    }

}