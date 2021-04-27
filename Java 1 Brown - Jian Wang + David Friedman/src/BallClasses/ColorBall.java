package BallClasses;

import java.awt.Color;

public class ColorBall extends Bouncing{
	private Color[] list = new Color[] {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.CYAN,Color.BLUE,Color.PINK,Color.MAGENTA};
	private int i=0;
	private int count=1;
	
	public ColorBall(int startx, int starty, int startrad, int startxspeed, int startyspeed) {
		super(startx, starty, startrad, startxspeed, startyspeed, Color.BLACK);
		// TODO Auto-generated constructor stub
	}
	public void move() {
		super.move();
		if(count>=30) {
			count=0;
			setColor(list[i]);
			i++;
			if(i>=8) {
				i=0;
			}
		}
		count++;
		
	}
	
	

}
