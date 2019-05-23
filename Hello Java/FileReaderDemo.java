import java.io.*;

class FileReaderDemo
{
	public static void main(String[] args) throws IOException{

		FileReader fr = new FileReader("demo.txt");
		
		int ch = 0;
		
		//read会返回int，-1表示到了文件末尾；
		while((ch=fr.read())!=-1)
		
		{
		
			System.out.println((char)ch);
		
		}
		
		/*
		int ch1 = fr.read();
		System.out.println((char)ch1);

		int ch2 = fr.read();
		System.out.println((char)ch2);

		int ch3 = fr.read();
		System.out.println((char)ch3);	
		fr.close();
		*/
	}
}