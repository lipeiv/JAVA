import java.io.*;
import java.util.*;

class PropertiesDemo
{
	public static void main(String[] args) {
		setAndGet();
	}

	public static void setAndGet()
	{
		Properties prop = new Properties();

	  prop.setProperty("张三","30");
	  prop.setProperty("李四","39");

	  System.out.println(prop);
	}
}