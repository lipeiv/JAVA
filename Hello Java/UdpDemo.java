import java.net.*;

//1.建立udp socket服务；
//2.封装数据包
//3.发送
//4.关闭；


class UdpDemo
{
	public static void main(String[] args) throws Exception{
		
		//1.建立udp socket服务；
		DatagramSocket ds = new DatagramSocket();

	//2.封装数据包
		byte[] buf = "这是用UDP发送的数据！".getBytes();
		DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.174.128."),10000);

	//3.发送
		ds.send(dp);

	//4.关闭；
		ds.close();

	}
}

//定义一个端口，用于接收数据；
//1.定义udpsocket服务；
//2.定义一个数据包接收数据
//3.通过socket的recei方法将接收到的数据存入到数据包中；
//4.从数据包中取出数据；
//5.关闭资源。

class UdpRece
{
	public static void main(String[] args) throws Exception{
		//1.定义udpsocket服务；
		DatagramSocket ds = new DatagramSocket(10000);

	//2.定义一个数据包接收数据
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);

	//3.通过socket的recei方法将接收到的数据存入到数据包中；
		ds.receive(dp);

	//4.从数据包中取出数据；
		String ip = dp.getAddress().getHostAddress();
		String data = new String(dp.getData(),0,dp.getLength());
		int port = dp.getPort();
		System.out.println(ip+"::"+data+"::"+port);

	//5.关闭资源。
		ds.close();

	}
}