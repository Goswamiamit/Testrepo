package org.testing.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public ChromeDriver driver;

    public HomePage( ChromeDriver driver) {
        this.driver = driver;
    }

    public void homepagenavigation() {
        String title = driver.getTitle();
        System.out.println(title);
        //if (title = homepage) {
           // System.out.println("Login Successful");
        //} else
          //  driver.navigate().to("https://www.linkedin.com/home");



    }

    }
}
