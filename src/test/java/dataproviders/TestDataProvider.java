package dataproviders;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "age for woman that not Retired")
    public static Object[][] womanNotRetired() {
        return new Object[][] {{0},{59}};
    }

    @DataProvider(name = "age for woman that Retired")
    public static Object[][] womanRetired() {
        return new Object[][] {{60},{61}};
    }


    @DataProvider(name = "age for man that not Retired")
    public static Object[][] manNotRetired() {
        return new Object[][] {{0},{64}};
    }

    @DataProvider(name = "age for man that Retired")
    public static Object[][] manRetired() {
        return new Object[][] {{65},{66}};
    }


    @DataProvider(name = "age not valid")
    public static Object[][] ageNotValid() {
        return new Object[][] {{-1},{131}};
    }
}