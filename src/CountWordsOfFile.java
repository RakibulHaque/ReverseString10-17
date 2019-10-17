import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

// Java program to count the  
// number of charaters in a file

public class CountWordsOfFile {
	
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\user\\eclipse-workspace\\ReverseString\\src\\sampleFile.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);
		
		String line;
		
		//Initializing counters
		int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
        int paragraphCount = 1; 
        int whitespaceCount = 0; 
        
        
     // Reading line by line from the  
        // file until a null is returned 
        
        while((line = reader.readLine()) != null)
        {
        	if(line.equals(""))
        	{
        		paragraphCount++;
        		
        	}
        	if(!(line.equals("")))
        	{
        		characterCount += line.length();
        		String[] wordlist = line.split("\\s+");
        		
        		countWord += wordlist.length;
        		
        		whitespaceCount += countWord-1;
        		
        		  String[] sentenceList = line.split("[!?.:]+"); 
                  
                  sentenceCount += sentenceList.length; 
        	}
        }
		
        
        System.out.println("Total word count = " + countWord); 
        System.out.println("Total number of sentences = " + sentenceCount); 
        System.out.println("Total number of characters = " + characterCount); 
        System.out.println("Number of paragraphs = " + paragraphCount); 
        System.out.println("Total number of whitespaces = " + whitespaceCount); 
        
        
        
        
		
	}
	

}
