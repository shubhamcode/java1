

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileNameRepeat {
	
	public static void main(String[] ssss) throws IOException
	{
		String filepath1="D:\\\\filehandling\\\\list_one.txt";
		String filepath2="D:\\\\filehandling\\\\list_two.txt";
		File f1=new File(filepath1);
		File f2=new File(filepath2);
		
		Scanner scfile1=new Scanner(f1);
		Scanner scfile2=new Scanner(f2);
		
		ArrayList<String> file_name2=new ArrayList();
		
		while(scfile2.hasNext())
		{	
			file_name2.add(scfile2.next());
			
		}

		while(scfile1.hasNext())
		{
			String fname=scfile1.next();
			if(!file_name2.contains(fname))
				System.out.println(fname);
		}
	}

}
