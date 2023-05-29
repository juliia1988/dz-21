package operations;

import dataproviders.TestDataProvider;
import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAgeBoundaryValues {

    @Test(dataProvider = "age for woman that not Retired", dataProviderClass = TestDataProvider.class)
    public void testWomanNotRetired(int age) {
        Woman woman = new Woman("Olena","Volosyna",age,"Ÿes");
        Assert.assertNotEquals(woman.isRetired(age), age < 60 , "Retired age works with mistakes");
    }

    @Test(dataProvider = "age for woman that Retired", dataProviderClass = TestDataProvider.class)
    public void testWonamRetired(int age) {
        Woman woman = new Woman("Viktoria","Kozakova",age,"No");
        Assert.assertEquals(woman.isRetired(age), age > 60 , "Retired age works with mistakes");
    }

    @Test(dataProvider = "age for man that not Retired", dataProviderClass = TestDataProvider.class)
    public void testManNotRetired(int age) {
        Man man = new Man("Oleg","Syvko",age,"Ÿes");
        Assert.assertNotEquals(man.isRetired(age), age < 65 , "Retired age works with mistakes");
    }

    @Test(dataProvider = "age for man that Retired", dataProviderClass = TestDataProvider.class)
    public void testManRetired(int age) {
        Man man = new Man("Evgeniy","horlov",age,"No");
        Assert.assertEquals(man.isRetired(age), age > 65 , "Retired age works with mistakes");
    }

}

