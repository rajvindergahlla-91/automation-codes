package theinternetherokutest;

import org.testng.annotations.DataProvider;

public class TestData {
	@DataProvider(name = "invalidLoginData")
	public Object[][] getData() {
		return new Object[][] {

				{ "raj", "SuperSecretPassword!" }, { "tomsmith", "raj123" }, { "minarv", "12345" }

		};
	}

}
