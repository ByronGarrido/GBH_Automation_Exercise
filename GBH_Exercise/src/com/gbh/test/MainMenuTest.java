package com.gbh.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.gbh.pageObjects.GBH_PageObjects;

public class MainMenuTest {
	
	private static WebDriver driver;

	
  @Test
  public void mainTest() throws InterruptedException {
	  	
	  	System.out.println("Hovering over 'Servicios' Menu");
	  	hoverMenu(GBH_PageObjects.getMenuServicios(driver));
		
	  	System.out.println("Clicking a child from menu 'Servicios'");
		GBH_PageObjects.getMenuServiciosChild(driver).click();
		
		System.out.println("Clicking over 'Portafolio' Menu");
		GBH_PageObjects.getMenuPortafolio(driver).click();
		
		System.out.println("Clicking over 'Conocenos' Menu");
		GBH_PageObjects.getMenuConocenos(driver).click();
		
		System.out.println("Clicking over 'Empleos' Menu");
		GBH_PageObjects.getMenuEmpleos(driver).click();
		
		System.out.println("Clicking over 'Blog' Menu");
		GBH_PageObjects.getMenuBlog(driver).click();
		
		System.out.println("Clicking over 'Inicio' Menu");
		GBH_PageObjects.getMenuInicio(driver).click();
		
		Thread.sleep(5000);	
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Opening FireFox Driver");
	  System.setProperty("webdriver.gecko.driver", "./resources/geckodriver.exe");
		
	  driver = new FirefoxDriver();
	
	  System.out.println("Opening GBH URL");
	  driver.get("http://gbh.com.do/");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Closing Driver");
	  driver.close();
  }
  
  /**
   * This method is to hover over the 'Servicios' Menu
   * since we can't open the menu with a simple click.
   * 
   * @param element gets a WebElement to hover as a parameter.
   * 
   * */
  private static void hoverMenu(WebElement element) throws InterruptedException {
		Actions action = new Actions(driver);
		
		action.moveToElement(element);
		action.perform();
		Thread.sleep(3000);
	}

}
