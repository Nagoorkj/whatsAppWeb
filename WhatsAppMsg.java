package com.java.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; 

public class WhatsAppMsg {
	

    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {  
      
           // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "F:\\nagoor\\Driver\\chromedriver.exe");  
        
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress","localhost:9014");
          
             // Instantiate a ChromeDriver class.   
        
        WebDriver driver= new ChromeDriver(options);
       // WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        String URL, MobileNumber,Message;
        	int CountryCode;
        	
        	
        	
        	Message="Hi ,Good Day!!"
        			+ "/n this is an Automated Message for Testing"
        			+ "Regards,"
        			+ "Techtra ";
        CountryCode=+91;
        MobileNumber="9094326889";
        
        		//entering mobile number:
        		String Web="https://api.whatsapp.com/send?phone=+"+CountryCode+MobileNumber+"";
        		//String Web="https://api.whatsapp.com/send?phone=+"+CountryCode+MobileNumber+"?text="text+";
        
        
        driver.navigate().to(Web);  
          
         //Maximize the browser  
       
        
          driver.manage().window().maximize();  
          
          WebDriverWait wait = new WebDriverWait(driver, 10);
          WebElement element = wait.until(
                  ExpectedConditions.visibilityOfElementLocated(By.id("action-button")));
         // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
         // driver.findElement(By.cssSelector("[data-id='chat']"));
       driver.findElement(By.id("action-button")).click();
       Thread.sleep(300);
      // driver.findElement(By.xpath("//a[@class='_36or chromexPathFinder2']")).click();
      // driver.findElement(By.linkText("use WhatsApp Web")).click();
      //driver.findElement(By.xpath("(//a[@class='_36or'])[2]")).click();
      // driver.findElement(By.linkText("use WhatsApp Web")).click();
       //driver.findElement(By.linkText("use WhatsApp Web")).click();
       
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       // WebElement pwd = driver.findElement(By.name("Passwd"));
        WebElement ClickChat =  driver.findElement(By.xpath("(//a[@class='_36or'])[2]"));

        ClickChat.click();
        
        driver.findElement(By.xpath("(//div[contains(@class,'_13NKt copyable-text')])[2]")).sendKeys(Message);
        driver.findElement(By.xpath("//span[@data-icon='send']")).click();
     //   ClickChat.click();
        //  driver.findElementByClassName("card").click();
          Thread.sleep(500);
          //driver.findElement(By.cssSelector("#side > header > div.sbcXq > div > span > div:nth-child(2)")).click();
       
          //driver.findElement(By.cssSelector(".input.input-search"));
         // driver.findElement(By.className("_13NKt copyable-text selectable-text")).click();
          //Scroll down the webpage by 5000 pixels  
       // JavascriptExecutor js = (JavascriptExecutor)driver;  
        //js.executeScript("scrollBy(0, 5000)");   
          
         // Click on the Search button  
       // driver.findElement(By.linkText("Core Java")).click();     
  //driver.quit();
    }  

}
