package mavenUtility;

import org.testng.asserts.SoftAssert;

public class AssertCustomized {
	//boolean valueassertout;
	
		public static void softAssert(String tooltiptext,String windowtext)
		{
			 SoftAssert softAssertion= new SoftAssert();
			 
			 
			 softAssertion.assertEquals(tooltiptext, windowtext);
			 
		}



}
