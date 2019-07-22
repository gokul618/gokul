package Testing.Testing;


import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	public static WebDriver d;
	@Given("I want to register new user")
	public void i_want_to_register_new_user() {
	  System.out.println("Register New User");
	    
	}

	@When("I open the TestMeApp URL")
	public void i_open_the_TestMeApp_URL() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\gokul\\chromedriver.exe");
		d = new ChromeDriver();	
         
         d.get("http://192.168.40.4:8083/TestMeApp1/fetchcat.htm");
         d.manage().window().maximize();
         d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@When("click on register\\/Signup")
	public void click_on_register_Signup() {
	    d.findElement(By.linkText("SignUp")).click();
	  
	}

	@Then("i enter my data")
	public void i_enter_my_data(io.cucumber.datatable.DataTable dataTable) {
	   
		 List<Map<String, String>>list =dataTable.asMaps(String.class, String.class);
		    
		    	d.findElement(By.id("userName")).sendKeys(list.get(0).get("username"));
		    	d.findElement(By.id("firstName")).sendKeys(list.get(0).get("Firstname"));
		    	d.findElement(By.id("lastName")).sendKeys(list.get(0).get("Lastname"));
		    	d.findElement(By.id("password")).sendKeys(list.get(0).get("Password"));
		    	d.findElement(By.id("pass_confirmation")).sendKeys(list.get(0).get("ConfirmPassword"));
                d.findElement(By.xpath(".//span[contains(text(),'Male')]")).click();
                d.findElement(By.id("emailAddress")).sendKeys(list.get(0).get("Email"));
                d.findElement(By.id("mobileNumber")).sendKeys(list.get(0).get("Mobile no"));
                d.findElement(By.id("dob")).sendKeys(list.get(0).get("DOB"));
                d.findElement(By.id("address")).sendKeys(list.get(0).get("Address"));
                Select s=new Select(d.findElement(By.id("securityQuestion")));
                s.selectByIndex(2);
                d.findElement(By.id("answer")).sendKeys(list.get(0).get("Answer"));
               
		    
	}

	@Then("The user click on register")
	public void the_user_click_on_register() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.name("Submit")).click();
	}

}
