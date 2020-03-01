package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.rmi.Remote;

public class BasicNavigation {
    public static void main(String[] args) {
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
    }
}
