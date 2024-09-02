package google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleDemo {
	WebDriver driver;
	WebElement searchBox;
	@Given("browser window is open")
	public void browser_window_is_open() {
		System.setProperty("webdriver.chrome.driver","./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
	    
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	    
	}

	@When("user enters Automation Testing text in search box")
	public void user_enters_automation_testing_text_in_search_box() {
		
		 searchBox = driver.findElement(By.name("q"));
        // Type "automation testing" and press Enter
       
	}

	@When("hits enter")
	public void hits_enter() {
		 searchBox.sendKeys("software testing means");
	        searchBox.sendKeys(Keys.ENTER);	
	    
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		 WebElement firstResult = driver.findElement(By.xpath("//*[@id=\"Odp5De\"]/div/div[1]/div/div[1]/block-component/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div[1]/div/span/span")); // Adjust the XPath as needed
	        String resultText = firstResult.getText();

	        // Print the text of the first result
	        System.out.println("First result text: " + resultText);
	    
	}

	@Then("print the title of the browser and close browser")
	public void print_the_title_of_the_browser_and_close_browser() {
		 System.out.println("Browser of the Title: " + driver.getTitle());
		 driver.quit();
	    
	}




}