import org.junit.Assert;
import org.junit.Test;

/**
 * Created by levyx on 16/8/2.
 */

public class TestHello {

    @Test
    public void testSayHello(){
        Assert.assertEquals(new Hello().sayHello(),"hello!");
    }
}
