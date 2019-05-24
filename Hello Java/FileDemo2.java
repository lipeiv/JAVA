import java.io.*;
class FileDemo2
{
	public static void main(String[] args) throws IOException{
		method1();
	}

	public static void method1() throws IOException{
		File f = new File("file.txt");
		System.out.println("创建了新文件："+f.createNewFile());
	}
}