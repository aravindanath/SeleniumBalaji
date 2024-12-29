package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ExampleByName extends BaseClass{


    @Test
    public void Byid(){
        driver.get("https://www.google.in/");
        driver.findElement(By.name("q")).sendKeys("Iphone 16", Keys.ENTER);
    }

}
