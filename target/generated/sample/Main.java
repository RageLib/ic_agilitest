package sample;

//---------------------------------------------------------------------------------------
//	    _  _____ ____     ____                           _             
//	   / \|_   _/ ___|   / ___| ___ _ __   ___ _ __ __ _| |_ ___  _ __ 
//	  / _ \ | | \___ \  | |  _ / _ \ '_ \ / _ \ '__/ _` | __/ _ \| '__|
//	 / ___ \| |  ___) | | |_| |  __/ | | |  __/ | | (_| | || (_) | |   
//	/_/   \_\_| |____/   \____|\___|_| |_|\___|_|  \__,_|\__\___/|_|   
//
//---------------------------------------------------------------------------------------
//	/!\ Warning /!\
//	This class has been automatically generated by ATS Script Generator (ver. 1.7.5)
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

public class Main extends ActionTestScript{

	/**
	* Test Name : <b>sample.Main</b>
	* Generated at : <b>21 juil. 2020 à 11:10:12</b>
	*/

	public Main(){super();}
	public Main(com.ats.executor.ActionTestScript sc){super(sc);}

	@Override
	public final String gav(){return "com.functional.ats-icAgilitest(0.0.1)";}

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


		//   ---< Actions >---   //

		exec(0,new ActionCallscript(this, clv("sample.Subscript"), prm(clv(env("browser")))));
	}
}