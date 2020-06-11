import java.net.*;
import java.io.*;

class SocketServer{
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(11000);

		Socket s = ss.accept();

		System.out.println(s.getInetAddress().getHostAddress());

		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		out.println("Client,Hello!");
		s.close();
		ss.close();
	}
}