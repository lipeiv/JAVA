import java.util.*;
import java.text.*;

class DateDemo{
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		String time = sdf.format(sdf);
		System.out.println("time="+time);
	}
}