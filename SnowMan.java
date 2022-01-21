import java.applet.Applet;
import java.awt.*;
//Max
//Pope
//2018/05/25
//This program draws a snowman

public class SnowMan extends Applet
{
	final int radius = 25;
	final int x1 = 20;
	final int y1 = 20;	//start
	
	final int x2 = 300;
	final int y2 = 150;	//end
	
	public void paint(Graphics gr)
	{
	//sky
		gr.setColor(Color.blue);
		gr.fillRect(0,0,300,90);
		//gr.setColor(Color.black);
				//x		//y		//Size
	//body
		gr.setColor(Color.white);
		gr.drawOval((300/2 - radius),(150/2 -radius), radius * 2, radius *2);
		//gr.setColor(Color.black);	
	//head
		gr.setColor(Color.white);
		gr.fillOval((315/2 - radius),(80 /2 -radius), radius +10 , radius + 10);
		//gr.setColor(Color.black);
	//legs
		gr.setColor(Color.white);
		gr.fillOval((290/2 - radius),(250/2 -radius), radius  + 40  , radius  + 40);
		gr.setColor(Color.black);
	//eye right
		gr.drawOval((360/2 - radius),(105 / 2 - radius), radius - 22, radius - 22); 
	//eye left
		gr.drawOval((330/2 - radius),(105 / 2 - radius), radius - 22, radius -22); 
	//left arm
		gr.drawLine((300 /2 - 25), (200 / 2 - 25), 65, 100);
	//right arm
		gr.drawLine((400 / 2 - 25), (200 / 2 - 25), 200, 30);
	//button 1
		gr.fillOval((345/2 - radius),(170/2 - radius), radius -20, radius - 20);
	//button 2
		gr.fillOval((345/2 - radius),(200/2 - radius), radius - 20, radius - 20);
	//button 3
		gr.fillOval((346/2 -radius),(230/2 - radius), radius - 20, radius - 20);
	//smile
		gr.drawArc (138,30,20,10,10,-180);

	//horizontal 1 
		gr.drawLine((300/2),(100),300,100);
	//horizontal 2
		gr.drawLine(0,100, 300,100);
	//Snow
		gr.drawOval(200,40, 3, 3);
		gr.drawOval(90,90, 3, 3);
		gr.drawOval(60,30, 3, 3);
		gr.drawOval(220,80, 3, 3);
		gr.drawOval(30,60, 3, 3);
		gr.drawOval(40,30, 3, 3);
		gr.drawOval(2860,40, 3, 3);
		gr.drawOval(280,90, 3, 3);
	//sun
		gr.setColor(Color.yellow);

		gr.fillOval(250,0, radius * 3, radius * 3);
	
		
	//drawArc(1int x, int y, 2int width, 3int length, 4int startAngle, 5int arcAngle)
		
		
	}
}