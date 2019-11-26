import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DuplicateTest {

    Duplicate SUT;

    @Before
    public void setup(){
        SUT = new Duplicate();
        SUT.createFile();
    }

    @After
    public void end(){
        SUT.deleteFile();
    }

    @Test
    public void duplicator_isDuplicate_returnDuplicate(){
        int number = SUT.duplicator(4);
        assertThat(number, is(8));
        assertThat(number, is(Math.addExact(4,4)));
    }

    @Test
    public void multiply_isMultiply_returnMultiplied() {
        int result;

        Euro cash = new Euro(10);
        result = cash.multiply(5);
        assertEquals(result, 50);

    }

    @Test
    public void multiplyAmountWith_isMultiply_returnMultiplied() {
        int result;

        Euro cash = new Euro();
        result = cash.multiplyAmountWith(10, 5);
        assertEquals(result, 50);

    }

}
