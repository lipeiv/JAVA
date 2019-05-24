import java.io.*;
/*
/函数自己调用自己，成为递归；
/注意递归次数，避免内存溢出；
*/

class FileDemo4
{
	public static void main(String[] args){
		
		File dir = new  File("/home/python/JAVA");
		showDir(dir,0);
		System.out.println(getSum(1000));
	}

	public static String getLevel(int level)
	{
		StringBuilder sb = new StringBuilder();
		for(int x=0;x<level;x++)
		{
			// sb.append("|--");
			sb.insert(0,"|	");
		}
		return sb.toString();
	}

	public static void showDir(File dir,int level)
	{
		System.out.println(getLevel(level)+dir.getName());
		level ++;
		File[] files = dir.listFiles();
		for(int x=0;x<files.length;x++)
		{

			if(files[x].isDirectory())
				showDir(files[x],level);
			else
				System.out.println(files[x]);

		}
	}

	public static int getSum(int n)
	{
		if(n==1)
			return 1;
		return n+getSum(n-1);
	}
}