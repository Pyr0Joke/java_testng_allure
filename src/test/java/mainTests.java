

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

@Description("This is an example test suite")
public class mainTests {
    @Test
    @Title("Successful test")
    public void testGoodAdd(){
        Assert.assertEquals(5,2+3);
    }

//    @Test
//    @DisplayName("Bad Add")
//    public void testBadAdd(){
//        Assert.assertEquals(5,2+6);
//    }

    @Test
    @Title("Successful test")
    public void testGoodMult(){
        Assert.assertEquals(6,2*3);
    }

//    @Test
//    @Title("Failing test")
//    public void testBadMult(){
//        Assert.assertEquals(5,2*6);
//    }
}
