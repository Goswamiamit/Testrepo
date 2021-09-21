package org.testing.testingscripts;

import org.testing.base.Base;
import org.testing.pages.HomePage;
import org.testng.annotations.Test;

public class Testcase2 extends Base {
    @Test
    public void HomePagetest(){
        HomePage home=new HomePage(driver);
        home.homepagenavigation();
        home.driver.getTitle();
    }



}
