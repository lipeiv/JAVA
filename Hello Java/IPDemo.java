import java.net.*;

class IPDemo
{
	public static void main(String[] args) throws Exception{
		InetAddress i = InetAddress.getLocalHost();

		System.out.println(i.toString());
		System.out.println("IP地址:"+i.getHostAddress());
		System.out.println("主机名:"+i.getHostName());


		InetAddress ia = InetAddress.getByName("www.baidu.com");
		System.out.println("IP地址:"+ia.getHostAddress());
		System.out.println("主机名："+ia.getHostName());
	}
}