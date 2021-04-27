package BallClasses;

import java.awt.Color;

public class Bouncing extends Ball {

	public Bouncing(int startx, int starty, int startrad, int startxspeed, int startyspeed, Color startcolor) {
		super(startx, starty, startrad, startxspeed, startyspeed, startcolor);
	}
	
	public void move() {
		super.move();
		if(getX()<0||getX()+getRad()>HEIGHT) {
			setXSpeed(-getXSpeed());
		}
		if(getY()<0||getY()+getRad()>WIDTH) {
			setYSpeed(-getYSpeed());
		}
	}
	
	public void Walls() {
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
