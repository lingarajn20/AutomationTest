package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class configurationReader {
	
	public static Properties p;
	
	public configurationReader() throws Throwable {
		File f = new File("C:\\Users\\LINGARAJ\\eclipse-workspace\\test\\src\\test\\java\\com\\property\\amazon.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	
}
