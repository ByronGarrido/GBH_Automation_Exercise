package com.gbh.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GBH_PageObjects {
	
	private static WebElement element;
	
	public static WebElement getMenuInicio(WebDriver driver) {
		String xpath = "//*[@id=\"menu-item-21\"]/a";
		element = driver.findElement(By.xpath(xpath));
		
		return element;
	}
	
	public static WebElement getMenuServicios(WebDriver driver) {
		String xpath = "//*[@id=\"menu-item-209\"]/a";
		element = driver.findElement(By.xpath(xpath));
		
		return element;
	}
	
	public static WebElement getMenuServiciosChild(WebDriver driver) {
		String xpath = "//*[@id=\"menu-item-226\"]/a";
		element = driver.findElement(By.xpath(xpath));
		
		return element;
	}
	
	public static WebElement getMenuPortafolio(WebDriver driver) {
		String xpath = "//*[@id=\"menu-item-62\"]/a";
		element = driver.findElement(By.xpath(xpath));
		
		return element;
	}
	
	public static WebElement getMenuConocenos(WebDriver driver) {		
		String xpath = "//*[@id=\"menu-item-65\"]/a";
		element = driver.findElement(By.xpath(xpath));
		
		return element;
	}
	
	public static WebElement getMenuEmpleos(WebDriver driver ) {
		String xpath = "//*[@id=\"menu-item-126\"]/a";
		element = driver.findElement(By.xpath(xpath));
		
		return element;
	}
	
	
	public static WebElement getMenuBlog(WebDriver driver) {
		String xpath = "//*[@id=\"menu-item-20\"]/a";
		element = driver.findElement(By.xpath(xpath));
		
		return element;
	}

}
