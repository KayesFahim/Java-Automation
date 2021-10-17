
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

public class NewClass {
   
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
                        NgWebDriver ngWebDriver = new NgWebDriver(driver);
                        ngWebDriver.waitForAngularRequestsToFinish();
			driver.get("https://visa.vfsglobal.com/ind/en/deu/login");
                        driver.manage().window().maximize();
                        WebDriverWait wait = new WebDriverWait(driver, 30);
                        wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler"))).click();
                        
                        // Login
                        
                        driver.findElement(By.id("mat-input-0")).sendKeys("kiddykayes@gmail.com");
                        driver.findElement(By.id("mat-input-1")).sendKeys("@Kayes321");
                        driver.findElement(By.xpath("/html/body/app-root/div/app-login/section/div/div/mat-card/form/button")).click();
                        
                      
                        
                        
                        		
			
    }
    
}
