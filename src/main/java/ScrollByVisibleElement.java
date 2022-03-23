import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ScrollByVisibleElement {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        //cap.setBrowserName(BrowserType.CHROME);
        cap.setBrowserName(BrowserType.FIREFOX);
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);

        driver.get("https://www.springest.nl/");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        driver.findElement(By.linkText("Selenium: 30 trainingen met 50 ervaringen")).click();
        driver.findElement(By.xpath("//*[@title='STAP-budget erkend - 3']")).click();
        System.out.println(driver.findElement(By.xpath("//*[@class='subject__title']")).getText());

        driver.quit();

    }
}