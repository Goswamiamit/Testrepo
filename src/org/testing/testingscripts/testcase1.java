package org.testing.testingscripts;

import org.testing.base.Base;
import org.testing.pages.LoginPage;
import org.testng.annotations.Test;


public class testcase1 extends Base {
    @Test
    public void logintest(){
        LoginPage log=new LoginPage(driver);
        log.Login();


    }
}
