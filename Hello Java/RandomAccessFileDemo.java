import java.io.*;

class RandomAccessFileDemo
{
	public static void main(String[] args) throws IOException{
			writeFile();
		}	

	public static void writeFile()throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("ran.txt","rw");
		raf.write("李四".getBytes());
		raf.writeInt(97);
		raf.write("王五".getBytes());
		raf.writeInt(99);

		raf.close();
	}
}