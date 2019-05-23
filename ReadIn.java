import java.io.*;
class ReadIn{
	public static void main(String[] args) throws IOException{
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader bufr = new BufferedReader(isr);

		String line = null;

		while((line=bufr.readLine())!=null)
		{
			System.out.println(line.toUpperCase());
		}
		bufr.close();
	}
		
}