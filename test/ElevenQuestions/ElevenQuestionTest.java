package ElevenQuestions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ElevenQuestionTest {
    private ElevenQuestions eleven;
    @BeforeEach
    public void setUp(){
        eleven = new ElevenQuestions();
    }
    @Test
    public void largestNumberInAnArrayTest(){

        int[] array = {8, 6, 4, 11, 3, 5};
        assertEquals(11, eleven.largestElement(array));
    }

    @Test
    public void reverseNumberInAnArrayTest(){
        int[] array = {8, 6, 4, 11, 3, 5};

       assertEquals("[5, 3, 11, 4, 6, 8]", eleven.reverse(array));
    }

    @Test
    public void elementExistInAList(){
        int[] array = {8, 6, 4, 11, 3, 5};
        assertTrue(eleven.elementInAList(array, 6));
    }
    @Test
    public void testThatElementDoesNotExistInArray(){
        int[] array = {8, 6, 4, 11, 3, 5};
        assertFalse(eleven.elementInAList(array, 9));
    }

    @Test
    public void elementThatPrintOddPositionInAList(){
        int[] array = {8, 6, 4, 11, 3, 5};

        assertEquals("843", eleven.oddPosition(array));
    }
    @Test
    public void elementThatPrintEvenPositionInAList(){
        int[] array = {8, 6, 4, 11, 3, 5};

        assertEquals("6115", eleven.evenPosition(array));
    }

    @Test
    public void computeTotalOfAListTest(){
        int[] arr = {9, 1, 10, 11, 8, 1, 3, 7};

        assertEquals(50, eleven.totalAmount(arr));

    }

    @Test
    public void palindromeTestForRealPalindromeString(){
        String check = "mom";
        assertTrue(eleven.palindromeCheck(check));
    }

    @Test
    public void palindromeTestForUnRealPalindromeString(){
        String check = "james";
        assertFalse(eleven.palindromeCheck(check));
    }

    @Test
    public void testForLoopToComputeValue(){
        int result = 10;
        assertEquals(result, eleven.computeValueForLoop());
    }
    @Test
    public void testWhileLoopToComputeValue(){
        int result = 10;
        assertEquals(result, eleven.computeValueWhileLoop());
    }

    @Test
    public void testDoWhileLoopToComputeValue(){
        int result = 10;
        assertEquals(result, eleven.computeValueUsingDoWhileLoop());
    }
}
