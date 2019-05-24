import java.io.*;

//windows从里往外删 不可有隐藏文件


class RemoveDir
{
	public static void main(String[] args) {
		File dir = new File("");
		removeDir(dir);
	}

	public static void removeDir(File dir)
	{
		File[] files = dir.listFiles();
		for(int x=0;x<files.length;x++)
		{
			if(files[x].isDirectory())
				removeDir(files[x]);
			else
				System.out.println(files[x].toString()+":-file-"+files[x].delete());
		}
		System.out.println(dir+"::dir::"+dir.delete());
	}
}