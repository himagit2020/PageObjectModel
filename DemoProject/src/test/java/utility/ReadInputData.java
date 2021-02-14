package utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadInputData {
	
	public String getData() throws IOException {
		
		String path=  "C:\\Users\\anand\\Desktop\\input.txt";
		
		// Read notepad data 
		
		BufferedReader reader = new BufferedReader(new FileReader(path));
		//reader.readLine();
		
		String line;
		  //as long as there are lines in the file, print them
		  while((line = reader.readLine()) != null){ 
		   // System.out.println(line);
		   break;
		  }
		
		return line;
		
	}

}
