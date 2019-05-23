import java.io.*;

class CopyText
{
	public static void main(String[] args) throws IOException{
		copy_2();

	}

	public static void copy_2(){
		FileWriter fw =null;
		FileReader fr =null;
		try{
			fw = new FileWriter("demo_copy.txt");
			fr = new FileReader("demo.txt");

			char[] buf = new char[1024];
			int len = 0;
			while((len=fr.read(buf))!=-1)
			{
				fw.write(buf,0,len);
			}
		}
		catch(IOException e)
		{
			throw new RuntimeException("读写失败！");

		}
		finally{
			if(fr!=null)
			try{
				fw.close();
				fr.close();
			}
			catch (IOException e)
			{

			}
		}
	}

	public static void copy_1() throws IOException
	{
		FileWriter fw = new FileWriter("demo_copy.txt");
		FileReader fr = new FileReader("demo.txt");

		int ch = 0;
		while((ch=fr.read())!=-1)
		{
			fw.write(ch);
		}

		fw.close();
		fr.close();
	}
}