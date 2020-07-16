import org.testng.annotations.Test;
import java.nio.charset.Charset;
import org.openqa.selenium.Keys;
import com.ats.executor.ActionTestScript;
import com.ats.script.actions.*;
import com.ats.generator.objects.Cartesian;
import com.ats.generator.objects.mouse.Mouse;
import com.ats.tools.Operators;
import com.ats.generator.variables.Variable;

public class CodeJava extends ActionTestScript
{
	/**
	 * Test Name : <b>CodeJava</b>
	 * Test Author : <b>LAPTOP-LT8QHS42\Agilitest</b>
	 * Test Description : <i></i>
	 * Test Prerequisites : <i></i>
	 */

	@Test
	public void testMain()
	{
		// -----------------------------------------------
		// Get parameters passed by the calling script :
		// getParameter(int index)
		// -----------------------------------------------
		// String param0 = getParameter(0).toString();
		// int param0 = getParameter(0).toInt();
		// double param0 = getParameter(0).toDouble();
		// boolean param0 = getParameter(0).toBoolean();
		// -----------------------------------------------
		// int it = getIteration(); -> return current iteration loop
		// String path = getCsvFilePath(); -> return csv file path sent as parameter to call current script
		// File file = getCsvFile(); -> return csv file sent as parameter to call current script
		// File file = getAssetsFile("[relative path string]"); -> return a file in the project's 'assets' folder
		// String url = getAssetsUrl("[relative path string]"); -> return url path of a file in the project's 'assets' folder
		
		
		String param0 = getParameter(0).toString();
		String resultatFinal = "";
		String resultat = "";

		switch(param0) {
			case "L":
				returnValues("Locataire");
				break;
			case "V":
				resultat = "Logé par la famille";
				resultatFinal = new String(resultat.getBytes(),Charset.forName("UTF-8")); 
				returnValues("resultatFinal");
				break;
			case "E":
				resultat = "Logé par l'employeur";
				resultatFinal = new String(resultat.getBytes(),Charset.forName("UTF-8")); 
				returnValues("resultatFinal");
				break;
			case "A":
				resultat = "Propriétaire (crédit en cours)";
				resultatFinal = new String(resultat.getBytes(),Charset.forName("UTF-8")); 
				returnValues("resultatFinal");
				break;
			case "P":
				resultat = "Propriétaire(pas de crédit en cours)";
				resultatFinal = new String(resultat.getBytes(),Charset.forName("UTF-8")); 
				returnValues("resultatFinal");
				break;
			case "Z":
				returnValues("Autre");
				break;
		}
		
		// -----------------------------------------------
		// Return string values to calling script :
		// returnValues(String ...)
		// -----------------------------------------------
		// returnValues("value", stringVariable);
	}
}