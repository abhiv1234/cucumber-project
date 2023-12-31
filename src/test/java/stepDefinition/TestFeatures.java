package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import cucumber.api.java8.En;

public class TestFeatures implements En {

	private WebDriver driver;

	public TestFeatures() {
		Given("I want to open {string}", (String browserName) -> {
			switch (browserName) {
				case "Safari":
					this.driver = new SafariDriver();
					break;
				case "Edge":
					this.driver = new EdgeDriver();
					break;
				case "Chrome":
					this.driver = new ChromeDriver();
					break;
				default:
					// do nothing
			}
		});

		Then("I navigate to {string} URL", (String pageURL) -> {
			this.driver.get(pageURL);
			this.driver.manage().window().maximize();
			this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));
			this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		});
	}

}
