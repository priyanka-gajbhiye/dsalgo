package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Loggerload {
	
		private static Logger logger = (Logger) LogManager.getLogger();
		
		public static void info(String message) {
			logger.info("Info :" +message);
		}
		public static void info(int num) {
			logger.info("Info :" +num);
		}
		public static void warn(String message) {
			logger.warn("Warning:"+message);
		}
		public static void error(String message) {
			logger.error("Error:"+message);
		}
		public static void debug(String message) {
			logger.debug("Debug:"+message);
		}

}
