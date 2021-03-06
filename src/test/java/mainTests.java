

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

@Description("This is an example test suite")
public class mainTests {

    @Test(groups={"add"})
    @Title("Good add")
    public void testGoodAdd(){
        Assert.assertEquals(5,2+3);
    }

    @Test(groups={"add"},dependsOnMethods={"testGoodAdd"})
    @Title("Bad Add")
    public void testBadAdd(){
        Assert.assertEquals(5,2+6);
    }

    @Test(groups={"mult"})
    @Title("Good mult")
    public void testGoodMult(){
        Assert.assertEquals(6,2*3);
    }

    @Test(groups={"mult"})
    @Title("Failing test")
    public void testBadMult(){
        Assert.assertEquals(5,2*6);
    }
}
