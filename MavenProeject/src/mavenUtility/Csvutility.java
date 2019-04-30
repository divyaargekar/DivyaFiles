package mavenUtility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Csvutility {
	static String SessionValue;
	
public static String getSessionstooltip(String path,String DateValue) throws IOException
{
		
          HashMap<String,String>  allsessionsvalues=new HashMap();
	  FileReader fr=new FileReader(path);    
     CSVParser csvParser = new CSVParser(fr, CSVFormat.DEFAULT.withHeader("DayIndex", "Sessions").withIgnoreHeaderCase().withTrim());
     for (CSVRecord csvRecord: csvParser) {
         // Accessing Values by Column Index
         String DayIndex = csvRecord.get(0);
         //Accessing the values by column header name
         String Sessions = csvRecord.get("Sessions");
         allsessionsvalues.put(DayIndex, Sessions);
         //Printing the record 
         System.out.println("Record Number - " + csvRecord.getRecordNumber());
         System.out.println("DayIndex : " + DayIndex);
         System.out.println("Sessions : " + Sessions);
         System.out.println("\n\n");
     }
    SessionValue= allsessionsvalues.get(DateValue);
     return  SessionValue;

}
}
