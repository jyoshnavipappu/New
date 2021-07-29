package Log4j;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class BasicConfiguration {
	static Logger log = Logger.getLogger(BasicConfiguration.class);
	@Test
	public void basicconfig()
	{
	BasicConfigurator.configure();
	log.debug("Print debug message");
	log.info("Print info message");
	log.warn("Print warn message");
	log.error("Print error message");
	log.fatal("Print fatal message");
	}

}
