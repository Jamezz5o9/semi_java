package HugeInteger;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {
    private HugeInteger hugeInteger;
    @BeforeEach
    public void setUp(){
        hugeInteger = new HugeInteger();
    }
    @Test
    public void testThatHugeIntegerClassIsNotNull(){
        assertNotNull(hugeInteger);
    }

    @Test
    public void testThatMethodParseCanConvertStrintoInteger(){
       String newNum = hugeInteger.parse("1455376843981786354232453676353423126789");
       String getNewArray = hugeInteger.getNewNum();
       assertEquals(getNewArray, newNum);
    }
    @Test
    public void testThatWeCanAddNumber(){
        String num = "1455376843981786354232453676353423126789";
        int add = hugeInteger.addNewNum(num);
        assertEquals(188, add);
    }
    @Test
    public void testThatWeCanSubtractNumber(){
        String num1 = "1455376843981786354232453676353423126789";

    }
}
