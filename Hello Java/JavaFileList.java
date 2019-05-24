import java.io.*;
import java.util.*;

class JavaFileList
{
	public static void main(String[] args) throws IOException{
		File dir = new  File("/home/python/Desktop/JAVA");
		List<File> list = new ArrayList<File>();
		fileToList(dir,list);
		System.out.println(list.size());
		File file = new File(dir,"javalist.txt");
		writeToFile(list,file.toString());

	}

	public static void fileToList(File dir, List<File> list)
	{
		File[] files = dir.listFiles();

		for(File file:files)
		{
			if(file.isDirectory())
				fileToList(file,list);
			else
			{
				if(file.getName().endsWith(".java"))
					list.add(file);
			}
		}
	}

	public static void writeToFile(List<File> list,String JavaListFile) throws IOException
	{
		BufferedWriter bufw = null;
		try
		{
			bufw = new BufferedWriter(new FileWriter(JavaListFile));
			for (File f:list)
			{
				String path = f.getAbsolutePath();
				bufw.write(path);
				bufw.newLine();
				bufw.flush();
			}
		}
		catch (IOException e)
		{
			throw e;
		}
		finally
		{
			try
			{
				if(bufw!=null)
					bufw.close();
			}
			catch(IOException e)
			{
				throw e;
			}
		}
	}
}