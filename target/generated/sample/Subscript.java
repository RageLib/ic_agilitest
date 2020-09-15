package samplecom.functional.icAgilitest;

//---------------------------------------------------------------------------------------
//	    _  _____ ____     ____                           _             
//	   / \|_   _/ ___|   / ___| ___ _ __   ___ _ __ __ _| |_ ___  _ __ 
//	  / _ \ | | \___ \  | |  _ / _ \ '_ \ / _ \ '__/ _` | __/ _ \| '__|
//	 / ___ \| |  ___) | | |_| |  __/ | | |  __/ | | (_| | || (_) | |   
//	/_/   \_\_| |____/   \____|\___|_| |_|\___|_|  \__,_|\__\___/|_|   
//
//---------------------------------------------------------------------------------------
//	/!\ Warning /!\
//	This class has been automatically generated by ATS Script Generator (ver. 1.8.0)
//	You may loose modifications if you edit this file manually !
//---------------------------------------------------------------------------------------

import org.testng.annotations.Test;
import com.ats.script.*;
import com.ats.script.actions.*;
import com.ats.script.actions.neoload.*;
import com.ats.script.actions.performance.*;
import com.ats.script.actions.performance.octoperf.*;
import com.ats.executor.ActionTestScript;
import com.ats.generator.objects.Cartesian;
import com.ats.generator.objects.mouse.Mouse;
import com.ats.generator.variables.Variable;
import com.ats.generator.variables.ConditionalValue;
import com.ats.tools.Operators;

public class Subscript extends ActionTestScript{

	/**
	* Test Name : <b>sample.Subscript</b>
	* Generated at : <b>15 sept. 2020 à 17:21:40</b>
	*/

	public Subscript(){super();}
	public Subscript(com.ats.executor.ActionTestScript sc){super(sc);}

	@Override
	public final String gav(){return "com.functional.icAgilitest(0.0.1)";}

	@Override
	protected ScriptHeader getHeader(){
		return new ScriptHeader(
			"",
			"agilitest",
			"",
			"",
			"");
	}

	@Test
	public void testMain(){

		//   ---< Variables >---   //

		Variable rangeValue = var("rangeValue");

		//   ---< Actions >---   //

		exec(0,new ActionChannelStart(this, "newChannel", clv(prm(0, "chrome")), new String[]{}));
		exec(2,new ActionGotoUrl(this, true, clv("http://www.agilitest.com/fichiers/test.html")));
		exec(3,new ActionMouseKey(this, true, 0, 0, el(0, "INPUT", prp(false, "type", clv("button")), prp(false, "value", clv("7"))), ms(Mouse.CLICK)));
		exec(4,new ActionMouseKey(this, true, 0, 0, el(0, "INPUT", prp(false, "value", clv("x")), prp(false, "type", clv("button"))), ms(Mouse.CLICK)));
		exec(5,new ActionMouseKey(this, true, 0, 0, el(0, "INPUT", prp(false, "value", clv("8")), prp(false, "type", clv("button"))), ms(Mouse.CLICK)));
		exec(6,new ActionMouseKey(this, true, 0, 0, el(0, "INPUT", prp(false, "value", clv("=")), prp(false, "type", clv("button"))), ms(Mouse.CLICK)));
		exec(7,new ActionText(this, true, 0, 0, el(0, "INPUT", prp(false, "name", clv("fname"))), clv("Bill")));
		exec(8,new ActionText(this, true, 0, 0, el(0, "INPUT", prp(false, "name", clv("lname"))), clv("Gates")));
		exec(9,new ActionMouseScroll(this, true, 0, 0, null, ms(450)));
		exec(10,new ActionSelect(this, true, 0, 0, el(1, "SELECT", prp(true, "text", clv("Volvo\\s*Saab\\s*Mercedes\\s*Audi"))), prp(false, "text", clv("Mercedes"))));
		exec(11,new ActionProperty(this, true, 0, 0, el(0, "INPUT", prp(false, "name", clv("range"))), "value", rangeValue));
		exec(12,new ActionScripting(this, true, 0, 0, el(0, "INPUT", prp(false, "name", clv("range"))), clv("value=10"), null));
		exec(13,new ActionChannelClose(this, "newChannel", false));
	}
}