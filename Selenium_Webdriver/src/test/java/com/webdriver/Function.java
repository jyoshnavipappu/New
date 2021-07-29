package com.webdriver;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import Log4j.BasicConfiguration;
public class Function {
	static Logger log = Logger.getLogger(Function.class);
	@Test
	public void basicconfig()
	{
		BasicConfigurator.configure("Selenium_Webdriver\\C:\\Users\\Hero\\Jyoshna.log");
		log.debug("Print debug message");
		log.info("Print info message");
		log.warn("Print warn message");
		log.error("Print error message");
		log.fatal("Print fatal message");
	}

}
