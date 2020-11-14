// filler code for pong provided by Mr. David

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoopGraphicsFiller extends JPanel {
	
	// constants that are predefined and won't change as the program runs
	private final int WIDTH = 1000, HEIGHT = 590;

public void drawCircles30(Graphics g, int n) {
		
		g.setColor(Color.red);
		
		for (int i=0; i<n; i++) {
			g.fillOval(i*20, 400, 20, 20);
		}
		
	}
	
public void largeShrink(Graphics g) {
	int size = 20;
	boolean reduce = false;
	g.setColor(Color.red);
	for (int i=0; i<15; i++) {
		g.fillOval(i*70, 220, size, size);
		if(size >= 60)
			reduce=true;
		if(reduce) {
			size-=20;
		}
		if(size <=10) {
			reduce = false;
		}
		size+=10;
	}
}

	public void drawCircles10by10(Graphics g) {
		
		g.setColor(Color.cyan);
		
		for (int i=0; i<10; i++) {
			for(int j=0;j<10;j++) {
			g.fillOval(i*20+400, j*20, 20, 20);
		}
		}
	}
public void circlesColors (Graphics g) {
	int red = 0;
	for(int i=0; i<50; i++) {
		g.setColor(new Color(red, 0,0));
		if (red >= 255) {
			red = 0;
		}
			red += 15;
		
		g.fillOval(i*20, 300, 20, 20);
	}
}

public void triangleformation(Graphics g) {
	for(int i=0; i < 10; i++) {
		for(int j=0; j <= i; j++) {
			g.fillOval(j*20, i*20, 20, 20);
		}
	}
		
}
	
	// defines what we want to happen anytime we draw the graphics
	public void paint(Graphics g) {
		
		// background color is gray
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		// call your methods here
		drawCircles10by10(g);
		circlesColors(g);
		triangleformation(g);
		drawCircles30(g, 30);
		largeShrink(g);
	}
	
	//////////////////////////////////////
	//////////////////////////////////////
	
	// DON'T TOUCH THE BELOW CODE
	
	
	// this method runs the actual program.
	public void run() {

		// while(true) should rarely be used to avoid infinite loops, but here it is ok because
		// closing the graphics window will end the program
		while (true) {
	
			// draws
			//repaint();
			
			//rests for a hundredth of a second
			try {
				Thread.sleep(10);
			} catch (Exception ex) {}
		}
	}
	
	// very simple main method to get the game going
	public static void main(String[] args) {
		new LoopGraphicsFiller();
	}
 
	// does complicated stuff to initialize the graphics and key listeners
	// DO NOT CHANGE THIS CODE UNLESS YOU ARE EXPERIENCED WITH JAVA
	// GRAPHICS!
	public LoopGraphicsFiller() {
		JFrame frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		this.setFocusable(true);
		
		run();
	}
}