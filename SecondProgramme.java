package labAdvanceJava;
import java.awt.*;
import java.applet.*;

public class SecondProgramme extends Applet{

	public void init(){
	setSize(300,300);
	}
	public void paint(Graphics g){
	
    g.setColor(Color.ORANGE);
	g.fillOval(30, 30, 200,200);
	g.setColor(Color.WHITE);
	g.fillOval(75, 80, 30, 35);
	g.fillOval(155, 80, 30, 35);
	g.setColor(Color.BLACK);
	g.fillOval(81,80,22,24);
	g.fillOval(161,80,22,24);
	g.setColor(Color.white);
	g.fillOval(95, 150,70,12);
	 g.setColor(Color.ORANGE);
	g.fillRect(120, 150,8,8);
	g.fillRect(133, 150,8,8);
	
	
	}
}
