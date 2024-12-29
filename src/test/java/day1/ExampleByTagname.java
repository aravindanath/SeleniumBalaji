package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.SuiteRunner;
import org.testng.annotations.Test;

import java.util.List;

public class ExampleByTagname extends BaseClass{


    @Test
    public void Byid(){
        driver.get("https://www.amazon.in/");

        driver.findElements(By.tagName("a")).forEach(e ->System.out.println(e.getText()+ e.getAttribute("href")));

//       List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println("Total links: " + links.size());
//
//        for(WebElement link : links){
//            System.out.println(link.getText()+ " : " + link.getAttribute("href"));
//
//          }

}}
