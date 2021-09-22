package org.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public ChromeDriver driver;
public LoginPage(ChromeDriver driver){
    this.driver=driver;
}
    public void Login(){
            WebElement Signinbutton=driver.findElement(By.xpath("//a[@class='nav__button-secondary']"));
            Signinbutton.click();
            //Sending data to username text box
        WebElement usernamebox= driver.findElement(By.xpath("//input[@id='username']"));
        usernamebox.sendKeys("amitgoswami218@gmail.com");
            //Sending data to Password field
        WebElement passwordbox=driver.findElement(By.xpath("//input[@id='password']"));
        passwordbox.sendKeys("Gosamit@18");
            //Clicking on Submit button
        WebElement SubmitButton= driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']"));
        SubmitButton.click();

        }

    }

