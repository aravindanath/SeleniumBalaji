package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ExampleByLinkText extends BaseClass{


    @Test
    public void Byid(){
        driver.get("https://www.google.in/");
        driver.findElement(By.linkText("தமிழ்")).click();
        driver.findElement(By.className("gLFyf")).sendKeys("Iphone 16", Keys.ENTER);
    }

}
