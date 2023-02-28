
import resources.Script1Helper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author MKMT193
 */
public class Script1 extends Script1Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>Feb 28, 2023 5:10:13 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 22621 ()
	 * 
	 * @since  2023/02/28
	 * @author MKMT193
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		classicsCD().move(atPoint(106,99));
		tree2().click(atPath("Composers->Schubert->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Schubert->String Quartets Nos. 4 & 14"));
		placeOrder().click();
		
		// Frame: Member Logon
		ok().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(65,15));
		placeAnOrder().inputChars("1234");
		expirationDate().click(atPoint(22,23));
		placeAnOrder().inputChars("23");
		placeOrder2().click();
		
		// 
		ok2().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
	}
}

