// filler code for pong provided by Mr. David
//Filled by Jason Wang and edited
//Function activates "h", deactivate "g"
//Function makes Paddles and Ball move at 2x speed, and the ball is now 2x bigger and Black instead of Blue, Paddles are also enlarged
//Single player moves both paddles at the same time, and the player is trying to juggle the ball instead between the two paddles

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

public class Pong extends JPanel implements KeyListener {
	
	// constants that are predefined and won't change as the program runs
	//ball size
	private final int WIDTH = 600, HEIGHT = 600, WINDOW_HEIGHT = 650;
	//paddle size
	private final int PADDLE_WIDTH = 20, DIAM = 8, PADDLE_HEIGHT = 100;
	//paddle speed
	private final int PADDLE_SPEED = 6;
	//paddle x is set
	private final int PADDLE_X1 = PADDLE_WIDTH;
	private final int PADDLE_X2 = WIDTH - (2*PADDLE_WIDTH);
	
	// your instance variables here, I've given you a few 
	private boolean up1, down1, up2, down2; 		// booleans to keep track of paddle movement
	private boolean solo = false;
	private boolean function = false;
	private int x = WIDTH/2, y = HEIGHT/2, speedx = 4, speedy = 3, paddle_y1 = HEIGHT/2, paddle_y2 = HEIGHT/2;
	private int score = 0, score2 = 0;
	
	
	// this method moves the ball at each timestep
	public void move_ball() {

		// your code here //
		if (function == false) {
			x += speedx;
			y += speedy;
		}
		if (function) {
			x += 2*speedx;
			y += 2*speedy;
		}
	}
	
	// this method moves the paddles at each timestep
	public void move_paddles() {
		
		// your code here // 
		if (function == false) {
			if (solo == false) {
				if (up1 == true && paddle_y1>=0) {
					paddle_y1 -= PADDLE_SPEED;
				}
				if (down1 == true && (paddle_y1+PADDLE_HEIGHT)<=HEIGHT) {
					paddle_y1 += PADDLE_SPEED;
				}
				if (up2 == true && paddle_y2>=0) {
					paddle_y2 -= PADDLE_SPEED;
				}
				if (down2 == true && (paddle_y2+PADDLE_HEIGHT)<=HEIGHT) {
					paddle_y2 += PADDLE_SPEED;
				}
			}
			if (solo) {
				if (up1 == true && paddle_y1>=0) {
					paddle_y1 -= PADDLE_SPEED;
				}
				if (down1 == true && (paddle_y1+PADDLE_HEIGHT)<=HEIGHT) {
					paddle_y1 += PADDLE_SPEED;
				}
				while (paddle_y2 >= paddle_y1) {
					paddle_y2 -= PADDLE_SPEED;
					if(paddle_y2 < paddle_y1) {
						break;
					}
				}
				while (paddle_y2 <= paddle_y1) {
					paddle_y2 += PADDLE_SPEED;
					if(paddle_y2 > paddle_y1) {
						break;
					}
				}
			}
		}
		if (function) {
			if (solo == false) {
				if (up1 == true && paddle_y1>=0) {
					paddle_y1 -= PADDLE_SPEED*2;
				}
				if (down1 == true && (paddle_y1+PADDLE_HEIGHT)<=HEIGHT) {
					paddle_y1 += PADDLE_SPEED*2;
				}
				if (up2 == true && paddle_y2>=0) {
					paddle_y2 -= PADDLE_SPEED*2;
				}
				if (down2 == true && (paddle_y2+PADDLE_HEIGHT)<=HEIGHT) {
					paddle_y2 += PADDLE_SPEED*2;
				}
			}
			if (solo) {
				if (up1 == true && paddle_y1>=0) {
					paddle_y1 -= PADDLE_SPEED*2;
				}
				if (down1 == true && (paddle_y1+PADDLE_HEIGHT)<=HEIGHT) {
					paddle_y1 += PADDLE_SPEED*2;
				}
				while (paddle_y2 >= paddle_y1) {
					paddle_y2 -= PADDLE_SPEED*2;
					if(paddle_y2 < paddle_y1) {
						break;
					}
				}
				while (paddle_y2 <= paddle_y1) {
					paddle_y2 += PADDLE_SPEED*2;
					if(paddle_y2 > paddle_y1) {
						break;
					}
				}
			}
		}
	}
	// this method checks if there are any bounces to take care of,
	// and if the ball has reached a left/right wall it adds to 
	// the corresponding player's score
	public void check_collisions() {
		
		// your code here
		//wall only
		if (x >= WIDTH-DIAM) {
			//go back
			speedx = -speedx;
			score++;
		}
		if (x <= 0) {
			speedx = -speedx;
			score2++;
		}
		if (y >= HEIGHT-DIAM || y <= 0) {
			//go back
			speedy = -speedy;
		}
		//add paddle collision here
		if (x <= PADDLE_X1 + PADDLE_WIDTH && y >= paddle_y1 && x <= paddle_y1) {
			//go back
			speedx = -speedx;
		}
		if (x >= PADDLE_X2 && y >= paddle_y2 && y <= paddle_y2 + PADDLE_HEIGHT) {
			//go back
			speedx = -speedx;
		}
	}
	

	// defines what we want to happen anytime we draw the game
	// you simply need to fill in a few parameters here
	public void paint(Graphics g) {
		
		// background color is gray
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		// draw your rectangles and circles here
		// .......
		if (function == false) {
		// draw the ball - where do we want to draw it??
				//g.setColor(Color.blue);
				g.setColor(new Color(50,100,200));
				g.fillOval(x, y, DIAM, DIAM);
				
				//green paddle left, normal size
				g.setColor(new Color(50,200,100));
				g.fillRect(PADDLE_X1, paddle_y1, PADDLE_WIDTH, PADDLE_HEIGHT);
				//brown paddle right, normal size
				g.setColor(new Color(200,100,50));
				g.fillRect(PADDLE_X2, paddle_y2, PADDLE_WIDTH, PADDLE_HEIGHT);
				}
		if (function == true) {
				//black ball 5x size
				g.setColor(new Color(0,0,0));
				g.fillOval(x, y, DIAM*5, DIAM*5);
				//same color, bigger size
				g.setColor(new Color(50,200,100));
				g.fillRect(PADDLE_X1, paddle_y1, PADDLE_WIDTH, (PADDLE_HEIGHT*2-PADDLE_HEIGHT/2));
				//same color, bigger size
				g.setColor(new Color(200,100,50));
				g.fillRect(PADDLE_X2, paddle_y2, PADDLE_WIDTH, (PADDLE_HEIGHT*2-PADDLE_HEIGHT/2));	
		}
		
		// writes the score of the game - you just need to fill the scores in
		Font f = new Font("Arial", Font.BOLD, 14);
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("P1 Score: " + score, WIDTH/5, 20);
		g.drawString("P2 Score: " + score2, WIDTH*3/5, 20);
	}

	// defines what we want to happen if a keyboard button has 
	// been pressed - you need to complete this
	public void keyPressed(KeyEvent e) {
		
		int keyCode = e.getKeyCode();
		
		// changes paddle direction based on what button is pressed
		if (solo == false) {
			if (keyCode == KeyEvent.VK_DOWN) { 
				// fill this in
				down2 = true;
			}
			if (keyCode == KeyEvent.VK_UP) {
				// fill this in
				up2 = true;
			}
			if (e.getKeyChar() == 'w') {
				// move paddle down
				up1 = true;
			}
			if (e.getKeyChar() =='s') {
				// fill this in
				down1 = true;
			}
		}
		if (solo == true) {
			if (e.getKeyChar() == 'w') {
				// move paddle down
				up1 = true;
			}
			if (e.getKeyChar() =='s') {
				// fill this in
				down1 = true;
			}
		}
		// turn 1-player mode on
		if (e.getKeyChar() == '1') {
//			// fill this in
			solo = true; 
			score = score2 = 0;
			}
		
		// turn 2-player mode on
		if (e.getKeyChar() == '2')
			solo = false;
			score = score2 = 0;
			// fill this in
		if (e.getKeyChar() == 'h') {
//			// fill this in
			function = true; 
			}
		if (e.getKeyChar() == 'g') {
//			// fill this in
			function = false; 
			}
	}

	// defines what we want to happen if a keyboard button
	// has been released - you need to complete this
	public void keyReleased(KeyEvent e) {
		
		int keyCode = e.getKeyCode();
		
		// stops paddle motion based on which button is released
		if (solo == false) {
			if (keyCode == KeyEvent.VK_UP) {
				// fill this in
				down2 = false;
			}
			if (keyCode == KeyEvent.VK_DOWN) {
				// fill this in
				up2 = false;
			}
			if(e.getKeyChar() == 'w') {
				// fill this in
				down1 = false;
			}
			if (e.getKeyChar() == 's') {
				// fill this in
				up1 = false;
			}
		}
		if (solo) {
			if(e.getKeyChar() == 'w') {
				// fill this in
				down1 = false;
			}
			if (e.getKeyChar() == 's') {
				// fill this in
				up1 = false;
			}
		}
	}
	
	// restarts the game, including scores
	public void restart() {
		solo = false;
		function = false;
		x = WIDTH/2;
		y = HEIGHT/2;
		speedx = 4;
		speedy = 3;
		paddle_y1 = HEIGHT/2;
		paddle_y2 = HEIGHT/2;
		score = score2 = 0;
		// your code here
	}

	//////////////////////////////////////
	//////////////////////////////////////
	
	// DON'T TOUCH THE BELOW CODE
	
	
	// this method runs the actual game.
	public void run() {

		// while(true) should rarely be used to avoid infinite loops, but here it is ok because
		// closing the graphics window will end the program
		while (true) {
	
			// draws the game
			repaint();
			
			// we move the ball, paddle, and check for collisions
			// every hundredth of a second
			move_ball();
			move_paddles();
			check_collisions();
			
			//rests for a hundredth of a second
			try {
				Thread.sleep(10);
			} catch (Exception ex) {}
		}
	}
	
	// very simple main method to get the game going
	public static void main(String[] args) {
		new Pong();
	}
 
	// does complicated stuff to initialize the graphics and key listeners
	// DO NOT CHANGE THIS CODE UNLESS YOU ARE EXPERIENCED WITH JAVA
	// GRAPHICS!
	public Pong() {
		JFrame frame = new JFrame();
		JButton button = new JButton("restart");
		frame.setSize(WIDTH, WINDOW_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.add(button, BorderLayout.SOUTH);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				restart();
				Pong.this.requestFocus();
			}
		});
		this.addKeyListener(this);
		this.setFocusable(true);
		
		run();
	}
	
	// method does nothing
	public void keyTyped(KeyEvent e) {}
}