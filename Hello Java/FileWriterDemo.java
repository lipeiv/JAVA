import java.util.*;
import java.io.*;

class FileWriterDemo{
	public static void main(String[] args)  //必须抛出或者捕获异常
	{ 
		FileWriter fw =  null;
		
		try
		{
			fw = new FileWriter("demo.txt");
			fw.write("这是李培培的文件 哈哈O(∩_∩)O哈哈~；");
		}catch(IOException e)
		{
			System.out.println("catch:"+e.toString());
		}
		finally{
			try
			{
				if(fw !=null)
					fw.close();
			}
			catch(IOException e)
			{
				System.out.println(e.toString());
			}
		}
		
	}
}