import java.awt.*;
class AwtDemo
{
	public static void main(String[] args) {
		Frame f = new Frame("my awt");
		f.setSize(500,400);
		f.setLocation(300,200);
		f.setLayout(new FlowLayout());

		Button b = new Button("按钮");
		f.add(b);
		f.setVisible(true);
		// System.out.println("Hello GUI AwtDemo!!");
	}
}