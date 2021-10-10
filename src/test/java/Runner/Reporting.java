package Runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void jvmReport(String jsonFile)
	{
		File reportDir=new File("C:\\Users\\thill\\eclipse-workspace\\Cucumber7AM\\src\\test\\resources\\Report");
		Configuration configuration=new Configuration(reportDir, "FaceBookAutomation");
		configuration.addClassifications("Browser","Chrome");
		configuration.addClassifications("BrowserVersion","95");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder=new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();
		
	}
	
}
