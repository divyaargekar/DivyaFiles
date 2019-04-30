package mavenUtility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Csvutility {
	public static String SessionValue;
	
public static String getSessionstooltip(String path,String DateValue) throws IOException
{
		
         
	  FileReader fr=new FileReader(path);    

	
	HashMap <String,String> mapofsessions=new HashMap<String, String>();

   
      CSVParser csvParser = new CSVParser(fr, CSVFormat.DEFAULT.withHeader("dayindez","User","Sessions").withIgnoreHeaderCase().withTrim());
      for (CSVRecord csvRecord: csvParser) {
          // Accessing Values by Column Index
          String DayIndex = csvRecord.get(0);
          //Accessing the values by column header name
     
        String Sessions = csvRecord.get("Sessions");
        mapofsessions.put(DayIndex,Sessions);

  
  }
      SessionValue=          mapofsessions.get(DateValue);
	  //  System.out.println(SessionValue);
	    return SessionValue;
	// TODO Auto-generated method stub

}

}
