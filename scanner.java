import java.util.Scanner;

public class scanner{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please input your name:");
		String name = scan.nextLine();
		System.out.print("Please input your age:");
		int age = scan.nextInt();
		System.out.print("Please input your height:");
		double height = scan.nextDouble();

		System.out.printf("name:\t"+name+"\nage:\t"+age+"\nheight:\t"+height);
	}
}