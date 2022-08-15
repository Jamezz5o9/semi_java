package Week12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        int savedNum = stack.get(6);
        assertEquals(1, savedNum);
    }

}
