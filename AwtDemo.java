import java.awt.*;
import java.awt.event.*;

class AwtDemo
{
	public static void main(String[] args) {
		Frame f = new Frame("my awt");
		f.setSize(500,400);
		f.setLocation(300,200);
		f.setLayout(new FlowLayout());

		Button b = new Button("Button");
		f.add(b);
		f.addWindowListener(new MyWin());
		f.setVisible(true);
		// System.out.println("Hello GUI AwtDemo!!");
	}
}

class MyWin extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.out.println("window closed");
	}
}