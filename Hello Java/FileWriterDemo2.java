/*
*/

import java.io.*;
class FileWriterDemo2
{
	public static void main(String[] args) throws IOException{
		//true表示不覆盖，在原有文件末尾追加；
		FileWriter fw = new FileWriter("demo.txt",true);
		fw.write("\n你好 \n谢谢！");
		fw.close();
	}
}