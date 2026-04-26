package pgr1_package;

import org.testng.Assert;
import org.testng.annotations.Test;

public class pgr1ClassTest {

    @Test
    public void testPass() {
        Assert.assertEquals(pgr1_class.display(55), "pass");
    }

    @Test
    public void testFail() {
        Assert.assertEquals(pgr1_class.display(35), "fail");
    }

    @Test
    public void testInvalid() {
        Assert.assertEquals(pgr1_class.display(-5), "invalid");
    }
}