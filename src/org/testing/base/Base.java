package org.testing.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public ChromeDriver driver;
  //  public Properties prop;
    @BeforeMethod
    public void init(){
        System.setProperty("webdriver.ChromeDriver.driver","C:\\Users\\Admin\\IdeaProjects\\practice\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.linkedin.com/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void browserclose(){
        driver.close();
    }
}
