package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomerPage
{
@FindBy (xpath="//input[@class=\"inputFieldWithPlaceholder newNameField inputNameField\"]")
private WebElement cnameTF;

@FindBy (xpath="//textarea[@placeholder=\"Enter Customer Description\"]")
private WebElement descTF;

@FindBy (xpath="//div[text()=\"Create Customer\"]")
private WebElement creatBTN;

@FindBy (xpath="//span[text()=\"ASSIGNED USERS (3)\"]")
private WebElement assignedusers;

@FindBy (xpath="//span[text()=\"MANAGERS (3)\"]")
private WebElement managers;

 public CreateNewCustomerPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void creatnewcustomer(String custname)
 {
	 cnameTF.sendKeys(custname);
	 creatBTN.click();
 }
 
 public void creatnewcustomer(String custname,String description)
 {
	 cnameTF.sendKeys(custname);
	 descTF.sendKeys(description);
	 creatBTN.click();
 }
}
