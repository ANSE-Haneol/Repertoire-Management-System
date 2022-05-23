package ClassProject;

import java.io.*;
import java.util.*;
import java.util.logging.*;

public class EventLogger {

   FileHandler filehandler;
   LogManager logmanager;
   Logger logger;

   public EventLogger(String fileName) {
      try {
         logmanager = LogManager.getLogManager();
         logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
         filehandler = new FileHandler(fileName);
         filehandler.setFormatter(new SimpleFormatter());
         logger.addHandler(filehandler);

      } catch (IOException e) {
         e.printStackTrace();
      }
   }
     
   public void log(String logMessage) {
      logger.info(logMessage);
   }
}
