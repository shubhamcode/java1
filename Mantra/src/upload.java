

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class upload {

	public static void main(String[] sss)
	{
		String filename="C:\\Users\\shubh\\Downloads\\Sacramentorealestatetransactions.csv";
		File file=new File(filename);
		int i=0,sum=0;
		try {
			Scanner sc=new Scanner(file);
			
			String[] colname=sc.nextLine().split(",");
			
			for(String item:colname)
			{
				if(!item.equals("price"))
					i++;
				else
					break;
			}
			
			while(sc.hasNext())
			{
				String[] rowdata=sc.nextLine().split(",");
				sum+=Integer.parseInt(rowdata[i]);
				
				System.out.println(rowdata[i]);
			}
			
			sc.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
