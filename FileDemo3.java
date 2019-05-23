import java.io.*;

class FileDemo3
{
	public static void main(String[] args) {
		
		listDemo();
		// listRootsDemo();

	}

	public static void listDemo()
	{
		File f = new File ("/home/python");
		String[] names = f.list();
		for(String name:names)
		{
			System.out.println(name);
		}
	}

	public static void listRootsDemo()
	{
		File[] files = File.listRoots();
		for(File f : files)
		{
			System.out.println(f);
		}
	}

}