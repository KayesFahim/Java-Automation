
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
                "chromedriver.exe");
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
                        
                        
                        Thread.sleep(5000);                      
                        
                        driver.findElement(By.xpath("/html/body/app-root/div/app-login/section/div/div/mat-card/form/button")).click();
                        
                        Thread.sleep(8000);
                        driver.findElement(By.xpath("/html/body/app-root/div/app-dashboard/section/div/div[2]/button")).click();
                        
                        Thread.sleep(5000);
                        
                        
                        wait.until(ExpectedConditions.elementToBeClickable(By.id("mat-select-0"))).click();
                        driver.findElement(By.xpath("//*[@id=\"mat-option-0\"]/span")).click();
                        Thread.sleep(5000);
                        
                        wait.until(ExpectedConditions.elementToBeClickable(By.id("mat-select-value-3"))).click();
                        driver.findElement(By.xpath("//*[@id=\"mat-option-3\"]")).click();
                        
                        Thread.sleep(5000);
                        
                        driver.findElement(By.xpath("/html/body/app-root/div/app-eligibility-criteria/section/form/mat-card[2]/button")).click();

                        Thread.sleep(5000);
                        
                        //First Name*
                        driver.findElement(By.id("mat-input-2")).sendKeys("Kayes");
                        //Last Name*
                        driver.findElement(By.id("mat-input-3")).sendKeys("Fahim");
                        //Gender*
                        wait.until(ExpectedConditions.elementToBeClickable(By.id("mat-select-value-7"))).click();
                        driver.findElement(By.id("mat-option-6")).click();
                        
                        //date of Birth
                        driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]")).sendKeys("01111998");
                        
                        
                        //nationality
                        
                        wait.until(ExpectedConditions.elementToBeClickable(By.id("mat-select-value-9"))).click();
                        driver.findElement(By.id("mat-option-9")).click();
                        
                        
                        
                        //Passport Number
                        
                         driver.findElement(By.id("mat-input-4")).sendKeys("BN9770434");
                         
                         // Passport Date picker
                        driver.findElement(By.xpath("//*[@id=\"passportExpirtyDate\"]")).sendKeys("02012022");
                         
                         
                         //number code
                         
                         driver.findElement(By.id("mat-input-5")).sendKeys("44");
                         
                         //Mobile Number
                         driver.findElement(By.id("mat-input-6")).sendKeys("01685370456");
                         
                         //Email
                         driver.findElement(By.id("mat-input-7")).sendKeys("kiddy1kayes@gmail.com");
                         
                         //Address 1
                         driver.findElement(By.id("mat-input-8")).sendKeys("Road 1 Basundhara Dhaka");
                         
                         //Address 2
                         driver.findElement(By.id("mat-input-9")).sendKeys("House 12 Flat 34");
                         
                         //State
                         driver.findElement(By.id("mat-input-10")).sendKeys("Dhaka");
                         
                         //City
                         driver.findElement(By.id("mat-input-11")).sendKeys("Dhaka");
                         
                         //Postcode
                         driver.findElement(By.id("mat-input-12")).sendKeys("1220");
                         
                         
                        Thread.sleep(5000);
                        
                        driver.findElement(By.
                                xpath("/html/body/app-root/div/app-applicant-details/section/mat-card[2]/app-dynamic-form/div/div/app-dynamic-control/div/div/div[2]/button")).click();
                                   
                        Thread.sleep(5000);
                        
                        driver.findElement(By.
                                xpath("/html/body/app-root/div/app-applicant-details/section/mat-card[2]/div/div[2]/button")).click();
                        
                        Thread.sleep(5000);
                        
                        driver.findElement(By.
                                cssSelector("body > app-root > div > app-book-appointment > section > mat-card:nth-child(1) > div.ba-calender-card.card.shadow-sm > div > div > full-calendar > div.fc-view-harness.fc-view-harness-active > div > table > tbody > tr > td > div > div > div > table > tbody > tr:nth-child(5) > td.fc-daygrid-day.fc-day.fc-day-tue.fc-day-future.date-availiable")).click();
                        
                        Thread.sleep(5000);
                        
                        driver.findElement(By.
                                xpath("/html/body/app-root/div/app-book-appointment/section/mat-card[2]/div/div[2]/button")).click();
                        
                        Thread.sleep(3000);
                        
                        driver.findElement(By.id("STRadio1")).click();
                        
                        Thread.sleep(5000);
                        driver.findElement(By.xpath("/html/body/app-root/div/app-book-appointment/section/mat-card[2]/div/div[2]/button")).click();
                        
                        Thread.sleep(5000);
                        driver.findElement(By.xpath("/html/body/app-root/div/app-manage-service/section/mat-card[2]/div/div[2]/button")).click();
                        Thread.sleep(4000);
                        driver.findElement(By.xpath("//*[@id=\"mat-checkbox-1\"]/label/span[1]")).click();
                        driver.findElement(By.xpath("//*[@id=\"mat-checkbox-2\"]/label/span[1]")).click();
                        
                        Thread.sleep(5000);
                        driver.findElement(By.xpath("/html/body/app-root/div/app-review-and-payment/section/form/mat-card[2]/div/div[2]/button")).clear();
                        
                                
                                
                        
                        
                        
                         
                        
                        
                        
                        
                                                                     		
			
    }

}