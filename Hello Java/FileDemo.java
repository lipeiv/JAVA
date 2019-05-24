import java.io.*;

class FileDemo
{
	public static void main(String[] args) {
		consMethod();
		
	}

	public static void consMethod()
	{
		File f1 = new File("sysinfo.txt");

		File f2 = new File("/home/python/JAVA","sysinfo.txt");

		sop(f1);
		sop(f2);

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}