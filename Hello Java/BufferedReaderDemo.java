import java.io.*;

//readLine()方法只返回回车之前的内容；
class BufferedReaderDemo
{
	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("demo.txt");

		BufferedReader bufr = new BufferedReader(fr);

		String line = null;

		while ((line=bufr.readLine())!=null)
		{
			System.out.println(line);
		}

		bufr.close();
	}
}