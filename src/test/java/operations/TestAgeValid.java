package operations;

import dataproviders.TestDataProvider;
import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestAgeValid {

    @Test(dataProvider = "age not valid", dataProviderClass = TestDataProvider.class)
    public void testAgeIsValid(int age) {
        Woman woman = new Woman("Olena","Volosyna",age,"Ÿes");
        Man man = new Man("Ignat","Koval",age,"Ÿes");
        Assert.assertNotEquals(woman.getAge(), 0 < age && age < 130 , "Age should be more then 0 but less then 130 years");
        Assert.assertNotEquals(man.getAge(), 0 < age && age < 130 , "Age should be more then 0 but less then 130 years");

    }

}