import java.util.Scanner;

public class scanner{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Next:");

		if (scan.hasNext()) {
			String str1 = scan.next();
			System.out.println("data:" + str1);
		}
		scan.close();
	}
}