package PolymorphismPractice;
import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape{
	private int width, height;
	public Circle(int startx, int starty, int width, int height) {
		// TODO Auto-generated constructor stub
		super(startx,starty);
		this.width=width;
		this.height=height;
		
	}
	
	public void draw(Graphics g) {
		super.draw(g);;
		g.drawOval(getX(), getY(), width, height);
	}


}
