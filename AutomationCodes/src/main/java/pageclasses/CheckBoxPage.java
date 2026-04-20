package pageclasses;

import org.openqa.selenium.By;

import utils.UTActionsUtils;

public class CheckBoxPage {
	
	private By checkBox1 = By.xpath("//input[@type='checkbox'][1]");
	private By checkBox2= By.xpath("//input[@type='checkbox' and @checked][2]");
	
	public void clickOnCheckBox1()
	{
		UTActionsUtils.click(checkBox1,"CheckBox1");
	}
	
	public void clickOnCheckBox2()
	{
		UTActionsUtils.click(checkBox2, "Checkbox2");
	}

}
