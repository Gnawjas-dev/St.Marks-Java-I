package PolymorphismPractice;
import java.awt.Color;
import java.awt.Graphics;
public class Triangle extends Shape{
	
	private int[] xpos, ypos;

	
	public Triangle(int startx, int starty) {
		super(startx,starty);
		// TODO Auto-generated constructor stub
	}
	public void draw(Graphics g) {
		super.draw(g);
		int[] xpos = new int[] {getX(), getX()-20, getX()+20};
		int[] ypos = new int[] {getY(), getY()+20, getY()+20};
		g.drawPolygon(xpos, ypos, 3);
	}

	



}
