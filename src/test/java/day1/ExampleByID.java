package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ExampleByID extends BaseClass{


    @Test
    public void Byid(){
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 16", Keys.ENTER);
    }

}
