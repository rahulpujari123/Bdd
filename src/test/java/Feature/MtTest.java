package Feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MtTest {
	WebDriver driver;

	@Given("Open Application and enter url and click on signin")
	public void open_application_and_enter_url_and_click_on_signin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chrome Driver\\Chromedriver.exe");

		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(22, TimeUnit.MILLISECONDS);

		driver.get("https://www.ijmeet.com");
		driver.findElement(By.xpath("//a[text()=' Sign In ']")).click();

		Thread.sleep(444);
	}

	@When("enter username")
	public void enter_username() {
		driver.findElement(By.cssSelector("#email")).sendKeys("pujari.rahul21@gmail.com");

	}

	@When("enter password")
	public void enter_password() {
		driver.findElement(By.cssSelector("#password")).sendKeys("Rahul@123");
	}

	@Then("verfey Msg")
	public void verfey_msg() {
		driver.findElement(By.cssSelector("button.btn")).click();
		driver.close();
	}

@Given("navigate to google search")
public void navigate_to_google_search() {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chrome Driver\\Chromedriver.exe");

	driver = new ChromeDriver();
	// driver.manage().window().maximize();
	// driver.manage().timeouts().implicitlyWait(22, TimeUnit.MILLISECONDS);

	driver.get("https://www.google.com");
	driver.close();
}
}