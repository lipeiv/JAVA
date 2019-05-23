import java.io.*;

class BufferedWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("Demo2.txt");

		BufferedWriter bufw = new BufferedWriter(fw);

		bufw.write("这是用缓冲区写入");

		//只要用到缓冲区就得刷新；
		bufw.flush();

		//关闭缓冲区就是关闭流对象；
		bufw.close();
		//fw.close();
	}
}