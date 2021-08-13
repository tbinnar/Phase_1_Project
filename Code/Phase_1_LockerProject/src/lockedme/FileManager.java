package lockedme;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileManager 
{
	/**
	 * This method will return file names list from the folder
	 * @param folderpath
	 * @return
	 */
	public static List<String> getAllFileNames(String folderpath)
	{
		//File Object Creation
		File fl = new File(folderpath);
		
		//Getting all the files into FileArray
		File[] listofFiles = fl.listFiles();
		
		//List Declaration to store file names
		List<String> fileNames = new ArrayList<String>();
		
		//ForEach loop to add file names in Array List
		for(File f:listofFiles)
			fileNames.add(f.getName());
		
		// Sorting ArrayList in ascending Order
        // using Collection.sort() method
        Collections.sort(fileNames);
		
		//Return the List
		return fileNames;
	}
	
	
	
	/**
	 * This method will create file & write content in the file
	 * @param folderpath
	 * @param fileName
	 * @param Content
	 * @return
	 */
	public static boolean addFiles(String folderpath,String fileName,List<String> Content)
	{
		try
		{
			//File Object Creation
			File fl = new File(folderpath, fileName);
			
			//File Writer object Creation
			FileWriter fw = new FileWriter(fl);
			
			//Write into file
			for(String c:Content)
			{
				fw.write(c+"\n");
			}
			
			//Close File Writer Object
			fw.close();
			
			return true;
		}
		catch (Exception Ex)
		{
			return false;
		}
	}
}
