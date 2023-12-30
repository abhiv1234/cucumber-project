package runner;

import org.testng.annotations.BeforeClass;
import com.report.CucumberExtentOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources", glue = { "stepDefinition" }, tags = {
		"@testGoogle" }, monochrome = true, plugin = {
				"com.report.CucumberExtent:target/cucumber-extent-reports/report.html" })

public class TestNGRunner extends AbstractTestNGCucumberTests {
	/*
	 * @Override
	 * 
	 * @DataProvider(parallel = true)
	 * public Object[][] scenarios() {
	 * return super.scenarios();
	 * }
	 */
	@BeforeClass
	public void beforeMethod() {
		CucumberExtentOptions.getInstance().setDocumentTitle("Gaurav document title");
		// CucumberExtentOptions.getInstance().setReportLevel("Feature");
		CucumberExtentOptions.getInstance().setReportName("Gaurav report name");
	}
}
