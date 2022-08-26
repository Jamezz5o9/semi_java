package ElevenQuestions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

    @Test
    public void concatenateTwoArrayTest(){
        int[] arr1 = {1, 4, 5};
        int[] arr2 = {3, 6, 7};
        String[] arr3 = {"she", "is", "fine"};
        String[] result = {String.valueOf(1), String.valueOf(4), String.valueOf(5), String.valueOf(3), String.valueOf(6), String.valueOf(7), "she", "is", "fine"};

        assertEquals(Arrays.toString(result), eleven.concatenateArray(arr1, arr2, arr3));


    }
    @Test
    public void concatenateTwoArrayTestTwo() {
        int[] arr1 = {1, 4, 5};
        int[] arr2 = {3, 6, 7};
        int[] result = {1, 4, 5, 3, 6, 7};

        assertEquals(Arrays.toString(result), eleven.concatenateArray2(arr1, arr2));

    }

    @Test
    public void arrayValueCanBeAddedAlternatively(){
        int[] arr1 = {1, 0, 9};
        int[] arr2 = {4,5, 6};
        int[] result = {1, 4, 0, 5, 9, 6};
        assertEquals(Arrays.toString(result), eleven.alternateArray(arr1, arr2));
    }

    @Test
    public void arrayValueCanBeAlternatedWithStrings(){
        int[] arr1 = {1, 4, 5};
        String[] arr2 = {"she", "is", "fine"};
        String[] result = {String.valueOf(1), "she", String.valueOf(4), "is", String.valueOf(5), "fine"};
        assertEquals(Arrays.toString(result), eleven.alternateArray2(arr2, arr1));
    }
}
