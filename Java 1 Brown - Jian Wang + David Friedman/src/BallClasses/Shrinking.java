package BallClasses;

import java.awt.Color;

public class Shrinking extends Bouncing{

	private int count = 0;
	private int record = getRad();

	public Shrinking(int startx, int starty, int startrad, int startxspeed, int startyspeed, Color startcolor) {
		super(startx, starty, startrad, startxspeed, startyspeed, startcolor);
		// TODO Auto-generated constructor stub
	}
	
	public void move() {
		super.move();
		count++;
		if(count>=15) {
			count=0;
			if(getRad()<10) {
				setRad(record);
			}
			else if(getRad()>0) {
				setRad(getRad()-3);
			}
		}



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
