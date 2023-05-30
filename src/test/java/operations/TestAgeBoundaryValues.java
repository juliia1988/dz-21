package operations;

import dataproviders.TestDataProvider;
import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAgeBoundaryValues {

    private Woman woman;
    private Man man;

    @BeforeMethod
    public void createWoman(){
        woman = new Woman("Olena","Volosyna",35,"Ÿes");
    }

    @BeforeMethod
    public void createMan(){
        man = new Man("Oleg","Syvko",55,"Yes");
    }


    @Test(dataProvider = "age for woman that not Retired", dataProviderClass = TestDataProvider.class)
    public void testWomanNotRetired(int age) {
        Assert.assertNotEquals(woman.isRetired(age), age < 60 , "Retired age works with mistakes");
    }

    @Test(dataProvider = "age for woman that Retired", dataProviderClass = TestDataProvider.class)
    public void testWonamRetired(int age) {
        Assert.assertEquals(woman.isRetired(age), age > 60 , "Retired age works with mistakes");
    }

    @Test(dataProvider = "age for man that not Retired", dataProviderClass = TestDataProvider.class)
    public void testManNotRetired(int age) {
        Assert.assertNotEquals(man.isRetired(age), age < 65 , "Retired age works with mistakes");
    }

    @Test(dataProvider = "age for man that Retired", dataProviderClass = TestDataProvider.class)
    public void testManRetired(int age) {
        Assert.assertEquals(man.isRetired(age), age > 65 , "Retired age works with mistakes");
    }

}

