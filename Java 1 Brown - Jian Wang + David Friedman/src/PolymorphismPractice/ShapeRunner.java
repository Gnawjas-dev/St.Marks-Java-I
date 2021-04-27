package PolymorphismPractice;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class ShapeRunner {
	
	private Shape[] shapes;
	
	// this method should move all the shapes in the list
	public void moveShapes() {
		
		// your code here
		for (Shape s: shapes)
			s.move(5,5);
	}
	
	// fill in your shape list here
	public void setup() {
		
		// your code here
		//X,Y,W,H,SpeedX,SpeedY
		Shape round = new Circle (0,0,15,15);
		Shape blocky = new Square (20,40,20,20);
		Shape triangle = new Triangle (70,90);
		shapes =  new Shape[] {round,blocky,triangle};
	}
	
	// DON'T TOUCH BELOW CODE
	
	public void run() {
		while (true ) {
			moveShapes();
			frame.repaint();
			try {
				Thread.sleep(75);
			} catch (Exception ex) {}
		}
	}
	
	public static void main(String[] args) {
		new ShapeRunner(); 
	}
	private JFrame frame;
	public ShapeRunner() {
		setup();
		frame = new JFrame() {
			public void paint(Graphics g) {
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, 600, 600);
				
				for (Shape s: shapes)
					s.draw(g);
			}
		};
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		run();
	}
}