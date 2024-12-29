package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ExampleByXpath1 extends BaseClass{


    @Test
    public void Byid(){
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//a[contains(text(),'Today') and contains(@class,'nav-a')]")).click();
    }

}
