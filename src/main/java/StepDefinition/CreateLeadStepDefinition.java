package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import runner.testRun;

public class CreateLeadStepDefinition extends BaseClass {

	@And("Enter username as {string}")
	public void enterUserName(String username) {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(username);
	}

	@And("Enter Password as {string}")
	public void enterPassword(String password) {
		WebElement password1 = driver.findElement(By.id("password"));
		password1.sendKeys(password);
	}

	@And("click submit")
	public void clickSubmit() {
		WebElement clickSubmit = driver.findElement(By.className("decorativeSubmit"));
		clickSubmit.click();

	}

	@And("click CRMSFA hyperlink")
	public void clickCRMSFA() {
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	}

	@And("click on leads")
	public void clickLead() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}

	@And("click on create lead")
	public void clickcreateLeadLink() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	}

	@When("add companyName as {string}")
	public void companyName(String companyname) {
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(companyname);
	}

	@And("add firstName as {string}")
	public void firstName(String firstname) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstname);
	}

	@And("add lastName as {string}")
	public void lastName(String lastname) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys(lastname);
	}

	@And("click createLead")
	public void createLead() {
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	}

	@Then("verify whether lead created successfully")
	public void matchTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

}
