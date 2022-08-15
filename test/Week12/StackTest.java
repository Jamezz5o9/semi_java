package Week12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;

    @BeforeEach
    void setUp(){
        stack = new StackIt();
    }
    @Test
    public void testThatStackIsEmpy(){
        Stack stack = new StackIt();
        assertTrue(stack.empty());
    }

    @Test
    public void checkThatStackHasElement(){
        stack.push(3);
        assertFalse(stack.empty());
    }

    @Test
    public  void stackIsNotEmpty_OneItemHasBeenAdded(){
        stack.push(5);
        stack.push(6);
        stack.push(9);
        assertEquals(3, stack.size());
    }

    @Test
    public void pushToStackAndGetbyIndex(){
        stack.push(3);
        stack.push(6);
        int savedNum = stack.get(1);
        assertEquals(6,savedNum);
    }

    @Test
    public void popThelastElementbyIndex(){
        stack.push(2);
        stack.push(6);
        stack.push(3);
        stack.push(4);

        assertEquals(4, stack.pop());
        assertEquals(3, stack.pop());
    }

    @Test
    public void returnIndexOfSearchedStackElement(){
        stack.push(1);
        stack.push(4);
        stack.push(3);
        assertEquals(0, stack.search(1));
    }



}
