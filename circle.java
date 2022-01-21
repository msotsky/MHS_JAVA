import java.applet.Applet;
import java.awt.*;

public class circle extends Applet
{
	final int radius = 25;
	public void paint(Graphics gr)
	{
		gr.drawOval((300/2 - radius),(150/2 -radius), radius * 2, radius * 2);
		gr.drawString("Max",(140),(80));
	}

}


