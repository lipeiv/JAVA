import java.io.*;
class MyFileOutput{
	public static void main(String[] args) {
		FileInputStream fin;
		FileOutputStream fout;
		int ch;
		try{
			fin = new FileInputStream(FileDescriptor.in);
			// BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			fout = new FileOutputStream("output.txt");
			System.out.println("请输入：");
			while ((ch=fin.read())!='\n')
				fout.write(ch);
			fin.close();
			fout.close();
			System.out.println("Succeed!");
			
			}catch(FileNotFoundException e){
				System.out.println("create");
			}catch(IOException e){
				System.out.println("input");
			}
		}
	}
