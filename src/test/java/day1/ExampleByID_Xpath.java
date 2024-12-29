package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ExampleByID_Xpath extends BaseClass{


    @Test
    public void Byid(){
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 16", Keys.ENTER);
    }

}
