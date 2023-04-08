import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class WebTest {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        String currentDir = System.getProperty("user.dir");
        System.out.println(currentDir);
        String path = currentDir + "\\resources\\chromedriver.exe";
        System.out.println(path);
        System.setProperty("webdriver.chrome.driver",path);

        ChromeOptions options = new ChromeOptions();
        Map<String,Object> pref = new HashMap<String,Object>();
        Map <String,Object> profile = new HashMap<String,Object>();
        Map <String,Integer> contentSettings = new HashMap<String,Integer>();

        contentSettings.put("notifications",2);
        contentSettings.put("geolocation",2);
        profile.put("managed_default_content_settings", contentSettings);
        pref.put("profile",profile);
        options.setExperimentalOption("prefs",pref);


        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://chaldal.com/");
        Thread.sleep(2000); // only one click wait method
        driver.manage().window().maximize();



        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/div/div/div[2]/h5")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/div/div/div[3]/h5")).click();
//        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/form/div/div[1]/input")).sendKeys("Egg");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/form/div/div[1]/input")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/section/div/div/div/div/section/div[3]/div[2]/div[1]/div/section")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/section/div/div/div/div/section/div[3]/div[2]/div[1]/div/div[2]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/section/div/div/div/div/section/div[3]/div[2]/div[1]/div/div[2]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/section/div/div/div/div/section/div[3]/div[2]/div[1]/div/div[2]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/section/div/div/div/div/section/div[3]/div[2]/div[1]/div/div[2]/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/section")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/div/button/span[1]")).click();



    }

}
