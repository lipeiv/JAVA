import java.awt.*;
import java.awt.event.*;

class FarmeDemo
{
	private Frame f;
	private Button but;

	FarmeDemo()
	{
		init();
	}

	public void init(){
		f = new Frame("My Frame");
		f.setBounds(300,100,500,400);
		f.setLayout(new FlowLayout());

		but = new Button("My Button");

		f.add(but);

		myEvent();

		f.setVisible(true);
	}

	public void myEvent()
	{
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) 
	{
		new FarmeDemo();	
	} 



}