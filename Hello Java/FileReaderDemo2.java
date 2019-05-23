import java.io.*;

class FileReaderDemo2
{
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("FileReaderDemo2.java");
		char[] buf = new char[1024];
		int num =0;
		while((num=fr.read(buf))!=-1)
		{

			System.out.println(new String(buf,0,num));
		}

		/*
		int num = fr.read(buf);
		System.out.println("num="+num+"..."+ new String(buf));

		int num2 = fr.read(buf);
		System.out.println("num="+num2+"..."+ new String(buf));

		int num3 = fr.read(buf);
		System.out.println("num="+num3+"..."+ new String(buf));
*/

		fr.close();
		
	}
}