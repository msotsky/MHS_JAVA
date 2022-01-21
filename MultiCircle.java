import java.applet.Applet;
import java.awt.*;

public class MultiCircle extends Applet
{
	final int radius = 25;
	public void paint(Graphics gr)
	{
		gr.setColor(Color.red);
		gr.drawOval((300/2 - radius),(150/2 -radius), radius * 2, radius * 2);
		gr.setColor(Color.yellow);
		gr.drawOval((275/2 - radius),(125 /2 - radius), radius * 3, radius * 3);
		gr.setColor(Color.green);
		gr.drawOval((250/2 - radius), (100/2 - radius), radius * 4,radius * 4);
	}

}