import java.io.*;
import java.util.*;
public class dir{
	public static void main(String argv[]) {
		File fdir;
		File[] AllFile;
		String name;
		String dirFlag;
		long size;
		Date date;
		if (argv.length<1)
			fdir = new File(".");
		else
			fdir = new File(argv[0]);
		AllFile = fdir.listFiles();
		for (int i = 0;i<AllFile.length; ++i){
			name = AllFile[i].getName();
			if (AllFile[i].isFile()){
				dirFlag = "    ";
				size=AllFile[i].length();
			}else {
				dirFlag = "		<dir>		";
				size= 0;
			}
			date=new Date(AllFile[i].lastModified());
			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// System.out.print(sdf.format(date));
			System.out.print(dirFlag);
			if (size>0)
				System.out.printf("%10d",size);
			else
				System.out.print("			");
			System.out.println("	"+name);
		}
	System.out.println("all" + AllFile.length+" file");
	}
}