package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.rmi.Remote;

public class BasicNavigation {
    public static void main(String[] args) throws Exception {
        //to start selenium script we need;
        //setup webdriver (browser driver ) and create webdriver object

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver= new ChromeDriver();
        // in selenium everything starts from WebDriver interface
       /*
        RemoteWebDriver a=new SafariDriver();
        RemoteWebDriver b=new FirefoxDriver();
        RemoteWebDriver is parent, and above is polymorphism
        */

       driver.get("http://google.com");// to open a website
        Thread.sleep(3000);// for demo, wait 3 seconds
        String expectedTitle="Google";
        String title = driver.getTitle();
        System.out.println("title = " + title);
        if (expectedTitle.equals(title)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        driver.close();
    }
}
