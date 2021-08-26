package com.mycompany.app.Webpagefinedname;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

    public class WebpageName {


        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\rahul\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS) ;
            driver.get("https://www.dropbox.com/sh/sxr5cbxwzpeg881/AAAmKpb4hIvdE8CyrjV4elr-a/ALL%20ASSETS%20ALPHA%20SORT?dl=0");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            List<WebElement> element = driver.findElements(By.cssSelector(".sl-grid-filename"));

            System.out.println(element.size());

            for (WebElement webElement : element) {
                String name = webElement.getText();
                System.out.println(name);
            }
            driver.quit();
        }}



