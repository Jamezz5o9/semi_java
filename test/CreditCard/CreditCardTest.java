package CreditCard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {
    private CreditCard creditCard;
    @BeforeEach
    public void setUp(){
        creditCard = new CreditCard();
    }

    @Test
    public void NumberShouldBeBetweenRangeOf13And16(){
        String numLength = "2345665432456";
        assertTrue(creditCard.checkNumLength(numLength));
        String secondNum = "56789876543234";
        assertTrue(creditCard.checkNumLength(secondNum));
        String thirdNum = "123456789";
        assertFalse(creditCard.checkNumLength(thirdNum));
    }

    @Test
    public void NumberMustStartWithDigit4AndMustBeWithinTheRangeOf13And16(){
        String num = "45467889787563";
        assertTrue(creditCard.startWithFourForVisa(num));
        String num2 = "65467889787563";
        assertFalse(creditCard.startWithFourForVisa(num2));
        String num3 = "4567384688";
        assertFalse(creditCard.startWithFourForVisa(num3));
    }

    @Test
    public void NumberMustStartWithDigit5AndMustBeWithinTheRangeOf13And16(){
        String num = "534689732456478";
        assertTrue(creditCard.startWithFiveForMaster(num));
        String num2 = "56748378838";
        assertFalse(creditCard.startWithFiveForMaster(num2));
        String num3 = "546783908735643";
        assertTrue(creditCard.startWithFiveSec(num3));
        String num4 = "634689732456478";
        assertFalse(creditCard.startWithFiveForMaster(num4));
    }

    @Test
    public void NumberMustStartWithDigit37AndMustBeWithinTheRangeOf13And16(){
        String num = "3767324529876549";
        assertTrue(creditCard.americanCard(num));
        String num1 = "3867324529876549";
        assertFalse(creditCard.americanCard(num1));
        String num2 = "2767324529876549";
        assertFalse(creditCard.americanCard(num2));
        String num3 = "2367324529876549";
        assertFalse(creditCard.americanCard(num3));
        String num4 = "37673245298";
        assertFalse(creditCard.americanCard(num4));
    }

    @Test
    public void NumberMustStartWithDigit6AndMustBeWithinTheRangeOf13And16(){
        String num = "6767324529876549";
        assertTrue(creditCard.discoverCard(num));
        String num1 = "54768376543267364";
        assertFalse(creditCard.discoverCard(num1));
        String num2 = "674885788";
        assertFalse(creditCard.discoverCard(num2));
    }

    @Test
    public void testThatWeHaveSumOfEvenDigitInACard(){
       String number = "4388576018402626";
       int sum = creditCard.sumOfDoubleEvenPlace(number);
       assertEquals(37, sum);

    }

    @Test
    public void testThatSumOfOddPlaceNumberCanBeAdded(){
        String number = "4388576018402626";
        int sum = creditCard.sumOfOddPlace(number);
        assertEquals(38, sum);
    }

    @Test
    public void testForSumOfOddAndEvenPlace(){
        String number = "4388576018402626";
        int sum = creditCard.sumOfEvenAndOdd(number);
        assertEquals(75, sum);
    }

    @Test
    public void testForValidityOfCardNumber(){
        String number = "4388576018402626";
        assertFalse(creditCard.isValid(number));
        String numberTwo = "4388576018410707";
        assertTrue(creditCard.isValid(numberTwo));
        String numberThree = "4187452016471567";
        assertTrue(creditCard.isValid(numberThree));
        String numberFour = "4105400018034650";
        assertTrue(creditCard.isValid(numberFour));
    }
    @Test
    public void testThatNumberIsASingleDigitOrItIsADoubleDigit(){
        String number = "4388576018402626";
        assertTrue(creditCard.getDigitForOdd(number));
        String numberTwo = "432112333243213";
        assertFalse(creditCard.getDigitForOdd(numberTwo));
    }

    @Test
    public void testThatWeCanReturnNumberIfItsSingleDigit(){
        String numberTwo = "4388576018402626";
        String number = "43113434";
        assertEquals(11, creditCard.numberCheck(numberTwo));
        assertEquals(43113434, creditCard.numberCheck(number));
    }

    @Test
    public void testThatTheNumberPrefixTheListOfNumber(){
        String number = "4388576018402626";
        String d = "4";
        assertTrue(creditCard.prefixMatched(number, d));
    }

    @Test
    public void testThatWeCanGetTheNumberOfSize(){
        String number = "4388576018402626";
        assertEquals(16, creditCard.getSize((number)));
    }

    @Test
    public void testThatWeCanGetThePrefixOfNumber(){
        String number = "4327";
        String k = "234";
        assertEquals(2, creditCard.getPrefix(number, k));
        String numberOne = "4327";
        String kOne = "23444";
        assertEquals(4327, creditCard.getPrefix(numberOne, kOne));

    }
}
