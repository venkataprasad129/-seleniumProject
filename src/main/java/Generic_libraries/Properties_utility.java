package Generic_libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Properties_utility {
	private Properties property;

	public String readFromProperties(String filepath) 
	{
		FileInputStream fis=null;
		try 
		{
			fis =new FileInputStream(filepath);
		}
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		property = new Properties();
		try {
			property.load(fis);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return property.getProperty(filepath);
	}
	
}
