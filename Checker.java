import java.applet.Applet;
import java.awt.*;
//Max
//Pope
//2018/05/25
//This program draws a checkerboard pattern
//800 x 800

public class Checker extends Applet
{
	int x = 0;
	int y = 0;
	int xsize = 20;
	int ysize = 20;
	int counter = 0;
	int condition = 4;
	
	public void init()
	{
		setBackground(Color.black);
	}

	public void paint(Graphics gr)
	{
		gr.setColor(Color.red);
		
		do{
			System.out.println(x + "  " +y);
                        gr.fillRect(x, y,xsize,ysize);
			x += 40;
			counter += 1;
			if (counter == condition)
			{
				y += 20;
				x = 20;
				condition += 4;
			}
			if (counter == 8 || counter == 16 || counter == 24 || counter == 32)
				x = 0;
			else if (counter == 20 || counter == 28)
				x = 20;
		}while(counter < 32);
	}
}