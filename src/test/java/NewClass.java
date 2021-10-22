
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class NewClass {
   
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
                        NgWebDriver ngWebDriver = new NgWebDriver(driver);
                        ngWebDriver.waitForAngularRequestsToFinish();
			driver.get("https://visa.vfsglobal.com/gbr/en/mlt/login");
                        driver.manage().window().maximize();
                        WebDriverWait wait = new WebDriverWait(driver, 30);
                        wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler"))).click();
                        
                        // Login
                        
                        
                        
                        driver.findElement(By.id("mat-input-0")).sendKeys("kiddykayes@gmail.com");
                        driver.findElement(By.id("mat-input-1")).sendKeys("@Fahim123");
                        
                        
                        driver.findElement(By.xpath("/html/body/app-root/div/app-login/section/div/div/mat-card/form/button")).click();
                        
                        Thread.sleep(5000);
                        driver.findElement(By.xpath("/html/body/app-root/div/app-dashboard/section/div/div[2]/button")).click();
                        
                        Thread.sleep(5000);
                        
                        
                        wait.until(ExpectedConditions.elementToBeClickable(By.id("mat-select-0"))).click();
                        driver.findElement(By.xpath("//*[@id=\"mat-option-0\"]/span")).click();
                        Thread.sleep(5000);
                        
                        wait.until(ExpectedConditions.elementToBeClickable(By.id("mat-select-value-3"))).click();
                        driver.findElement(By.xpath("//*[@id=\"mat-option-3\"]")).click();
                        
                        Thread.sleep(20000);
                        
                        driver.findElement(By.xpath("/html/body/app-root/div/app-eligibility-criteria/section/form/mat-card[2]/button")).click();

                        
                        
                        
                        
                        
                                                                     		
			
    }

}