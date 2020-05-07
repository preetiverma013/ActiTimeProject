package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage 
{
//declaration	
 @FindBy (xpath="//div[.=\"Add New\"]")
 private WebElement addnewbtn;
 
 @FindBy (xpath="//div[.=\"+ New Customer\"]")
 private WebElement newcustomer;
 
 @FindBy (xpath="//div[.=\"+ New Project\"]")
 private WebElement newproject;
 
 @FindBy (xpath="//div[.=\"+ New Tasks\"]")
 private WebElement newtask;
 
 @FindBy (xpath="//div[.=\"Import Tasks from CSV\"]")
 private WebElement importtasks;

 //initialization
 public TaskPage(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 
 //utilization
 public void AddNewCustomer()
 {
	 addnewbtn.click();
	 newcustomer.click();
 }
 public void AddNewProject()
 {
	 addnewbtn.click();
	 newproject.click();
 }
 public void AddNewTask()
 {
	 addnewbtn.click();
	 newtask.click();
 }
 public void ImportTasksFromCSV()
 {
	 addnewbtn.click();
	 importtasks.click();
 }
}
