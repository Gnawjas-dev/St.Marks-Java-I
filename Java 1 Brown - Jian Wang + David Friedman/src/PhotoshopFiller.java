
// Photoshop program that can run several manipulations on 
// an image
// filler code by Mr. David

import java.awt.Color;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class PhotoshopFiller extends Component {

	// the name of the output file. will be determined by which methods are called
    private String outputName;
    
    // the 2d array of colors representing the image
    private Color[][] pixels;
    
    // the width and height of the image 
    private int w,h;
    

    // this method increases each color's rgb value by a given amount.
    // don't forget that rgb values are limited to the range [0,255]
    public void brighten(int amount) {
        outputName = "brightened_" + outputName;
        
        // your code here
        for(int i=0; i<pixels.length;i++) {
        	for(int j=0; j<pixels[i].length;j++) {//running through each pixel in the array
        		
        		Color c = pixels[i][j];
        		int r = c.getRed() + amount;
        		int g = c.getGreen() + amount;
        		int b = c.getBlue() + amount;//adding a certain amount to the rgb values to the pixel
        		
        		//checking the range/limits to not break the rgb color system (capping)
        		if(r>255)
        			r=255;
        		if(r<0)
        			r=0;
        		if(g>255)
        			g=255;
        		if(g<0)
        			g=0;
        		if(b>255)
        			b=255;
        		if(b<0)
        			b=0;
        		
        		
        		pixels[i][j] = new Color(r,g,b);//setting the pixel to the brightened values
        		
        	}
        }
    }
    
    // flip an image either horizontally or vertically.
    public void flip(boolean horizontally) {
        outputName = (horizontally?"h":"v") + "_flipped_" + outputName;
        
        // your code here
        
        if(horizontally) {//check for horizontal
	        for(int row = 0; row<pixels.length;row++) {//runs through half horizontally and fully vertically
	        	for(int column = 0; column<pixels[row].length/2;column++) {
	        		Color temp1 =pixels[row][column];
	        		Color temp2 =pixels[row][pixels[row].length-1-column];//switching front and back to "flip"
	        		pixels[row][column]=temp2;
	        		pixels[row][pixels[row].length-1-column] = temp1;
	        		
	        	}
	        }
        }
        
        else {//check for vertical
        	for(int row = 0; row<pixels.length/2;row++) {
	        	for(int column = 0; column<pixels[row].length;column++) {//runs through half vertically and fully horizontally
	        		//switch front and back
	        		Color temp1 =pixels[row][column];
	        		Color temp2 =pixels[pixels.length-1-row][column];
	        		pixels[row][column]=temp2;
	        		pixels[pixels.length-1-row][column] = temp1;
	        		
	        	}
	        }
        }

    }
    
    // negates an image
    // to do this: subtract each pixel's rgb value from 255 
    // and use this as the new value
    public void negate() {
        outputName = "negated_" + outputName;
        
        // your code here
        for (int row=0;row<pixels.length;row++) {
        	for (int column=0;column<pixels[row].length;column++) {//running through each pixel
        		Color c = pixels[row][column];
        		//negating w/ calculations
        		int r = 255 - c.getRed();
        		int g = 255 - c.getGreen();
        		int b = 255 - c.getBlue();
        		
        		//check limits/range
        		if(r<0)
        			r=0;
        		
        		if(g<0)
        			g=0;
        		
        		if(b<0)
        			b=0;
        		
        		
        		pixels[row][column] = new Color(r,g,b);//resetting the pixel into the calculated (negated) color
        	}
        }
    }
    
    // this makes the image 'simpler' by redrawing it using only a few colors
    // to do this: for each pixel, find the color in the list that is closest to
    // the pixel's rgb value. 
    // use this predefined color as the rgb value for the changed image.
    public void simplify() {
    
    		// the list of colors to compare to. Feel free to change/add colors
    		Color[] colorList = {Color.BLUE, Color.RED,Color.ORANGE, Color.MAGENTA,
                Color.BLACK, Color.WHITE, Color.GREEN, Color.YELLOW, Color.CYAN};
        outputName = "simplified_" + outputName;
        
        // your code here
        for (int i=0; i<pixels.length; i++) {
        	for (int j=0; j<pixels[i].length; j++) {//runs through all pixels
        		
        		
        		double min = Integer.MAX_VALUE; //maximum for comparison
        		int loc = 0; //remembers the color that is the closest
        		
        		for (int color=0;color<colorList.length;color++) {
        			double distance=distance(pixels[i][j],colorList[color]);
        			if(distance<min) {//if statement to find the closest color to the pixel
        				min=distance;
        				loc = color;
        			}
        			
        		}
        		pixels[i][j]=colorList[loc];//turning the pixel color into the "closest color to the pixel" after comparison
        	}
        }
        
    }
    
    // optional helper method (recommended) that finds the 'distance' 
    // between two colors.
    // use the 3d distance formula to calculate
    public double distance(Color c1, Color c2) {
    	//find all rgb values for the 2 inputs (c1's r g b and c2's r g b
    	int r1 = c1.getRed(); int r2 = c2.getRed(); int b1 = c1.getBlue(); int b2 = c2.getBlue(); int g1 = c1.getGreen(); int g2 = c2.getGreen();
    	//distance formula applied for 3 pairs of values
    	double distance = Math.sqrt(Math.pow(r1-r2,2)+Math.pow(b1-b2,2)+Math.pow(g1-g2,2));
    	//turn back to check if it's close enough to the said color
    		return distance;	// fix this //fixed
    }
    
    // this blurs the image
    // to do this: at each pixel, sum the 8 surrounding pixels' rgb values 
    // with the current pixel's own rgb value. 
    // divide this sum by 9, and set it as the rgb value for the blurred image
    public void blur() {
		outputName = "blurred_" + outputName;
		
		// your code here
		Color[][]temp=new Color [pixels.length][pixels[0].length];
		for(int row = 5; row<pixels.length-5;row++) {			//row of image
			for(int col = 5; col<pixels[row].length-5;col++) {  //column of image
				//make the box
				//initializing the rgb val for calc
				int red = 0;
				int blue = 0;
				int green = 0;
				for (int trow = row-5; trow<=row+5; trow++) {	//row of 8surrounding grid
					for (int tcol = col-5; tcol<=col+5; tcol++) {//column of 8surrounding grid
						//calculating the rgb vals: summing
						red+=pixels[trow][tcol].getRed();
						blue+=pixels[trow][tcol].getBlue();
						green+=pixels[trow][tcol].getGreen();
					}
				}
				//averaging the values with the rest of its types in the 11x11 grid
				red = red/121; blue = blue/121; green = green/121; //trying 11x11 grid
				
					temp[row][col] = new Color (red, green, blue);//new pixel 2d array to not alter with subsequent forloop runs
					}
				}
		for(int row = 5; row<pixels.length-5;row++) {//copies it back to original file to turn in
			for(int col = 5; col<pixels[row].length-5;col++) {
				pixels[row][col]=temp[row][col];
			}
		}
	}
    
    // this highlights the edges in the image, turning everything else black. 
    // to do this: at each pixel, sum the 8 surrounding pixels' rgb values. 
    // now, multiply the current pixel's rgb value by 8, then subtract the sum.
    // this value is the rgb value for the 'edged' image
    public void edge() {
        outputName = "edged_" + outputName;

        // your code here
        Color[][]tempColors=new Color [pixels.length][pixels[0].length]; //create a separate blank image to transcribe to
        
        for(int row = 1; row<pixels.length-1;row++) {			//row and column for the actual image
			for(int col = 1; col<pixels[row].length-1;col++) {
				
				//make the box
				//calculate the rgb val. for the pixels
				int red = 0;
				int blue = 0;
				int green = 0;
				
				for (int trow = row-1; trow<=row+1; trow++) {	//row+column for the 8 surrounding grid
					for (int tcol = col-1; tcol<=col+1; tcol++) {
						
						if(trow==row&&tcol==col)	//skips the middle pixels
							continue;
						red+=pixels[trow][tcol].getRed();	//summing the rgb vals
						blue+=pixels[trow][tcol].getBlue();
						green+=pixels[trow][tcol].getGreen();
						
					}
				}
				//calculations + limitations (so the rgb doesn't break)
				int r = pixels[row][col].getRed()*8-red; 
				if(r>255)
					r=255;
				if(r<0)
					r=0;
				int b = pixels[row][col].getBlue()*8-blue; 
				if(b>255)
					b=255;
				if(b<0)
					b=0;
				int g = pixels[row][col].getGreen()*8-green;
				if(g>255)
					g=255;
				if(g<0)
					g=0;
				//copy to new pixel 2d array, avoids altering the pixels of the original pixel 2d array
				tempColors[row][col]=new Color (r,g,b);
				
			}
		}
        
        for(int i = 1; i<pixels.length-1;i++) {
			for(int j = 1; j<pixels[i].length-1;j++) {
				//copying it back to the original after everything is done
				pixels[i][j]=tempColors[i][j];
				
			}
		}
    }
    //this converts all colors into only black/white/grey gradients
    //average the rgb value (sum) and use it for all three rgb values
    public void greyscale() {
    	outputName = "greyscale_" + outputName;
    	for(int i=0;i<pixels.length;i++) {//nested loop to check each pixel
    		for(int j=0;j<pixels[i].length;j++) {
    			int avg = (pixels[i][j].getRed()+pixels[i][j].getBlue()+pixels[i][j].getGreen())/3;//greyscale by averaging rgb val and using it for all 3 inputs
    			pixels[i][j]=new Color (avg, avg, avg);
    		}
    	}
    }
    
    // *************** DON'T MESS WITH THE BELOW CODE **************** //
    
    // feel free to check it out, but don't change it unless you've consulted 
    // with Mr. David and understand what the code's doing
    
    

    public void run() {
    	JFileChooser fc = new JFileChooser();
		File workingDirectory = new File(System.getProperty("user.dir")+System.getProperty("file.separator")+ "Images");
		fc.setCurrentDirectory(workingDirectory);
		fc.showOpenDialog(null);
		File my_file = fc.getSelectedFile();
		if (my_file == null)
			System.exit(-1);
		
		// reads the image file and creates our 2d array
        BufferedImage image;
		try {
			image = ImageIO.read(my_file);
		
	        BufferedImage new_image = new BufferedImage(image.getWidth(),
	                        image.getHeight(), BufferedImage.TYPE_INT_ARGB);
	        create_pixel_array(image);
			outputName = my_file.getName();
			
			// runs the manipulations determined by the user
			System.out.println("Enter the manipulations you would like to run on the image.\nYour "
					+ "choices are: brighten, flip, negate, blur, edge, greyscale, or simplify.\nEnter each "
					+ "manipulation you'd like to run, then type in 'done'.");
			Scanner in = new Scanner(System.in);
			String action = in.next().toLowerCase();
			while (!action.equals("done")) {
	    			try {
		    			if (action.equals("brighten")) {
		    				System.out.println("enter an amount to increase the brightness by");
		    				int brightness = in.nextInt();
		        			Method m = getClass().getDeclaredMethod(action, int.class);
		        			m.invoke(this, brightness);
		    			}
		    			else if (action.equals("flip")) {
		    				System.out.println("enter \"h\" to flip horizontally, anything else to flip vertically.");
		        			Method m = getClass().getDeclaredMethod(action, boolean.class);
		        			m.invoke(this, in.next().equals("h"));
		    			}
		    			else {
		        			Method m = getClass().getDeclaredMethod(action);
		        			m.invoke(this, new Object[0]);
		    			}
		    			System.out.println("done. enter another action, or type 'done'");
	    			}
	    			catch (NoSuchMethodException e) {
	    				System.out.println("not a valid action, try again");
	    			} catch (IllegalAccessException e) {e.printStackTrace();System.exit(1);} 
	    			catch (IllegalArgumentException e) {e.printStackTrace();System.exit(1);}
	    			catch (InvocationTargetException e) {e.printStackTrace();System.exit(1);}
	    			
	    			action = in.next().toLowerCase();
	    		} 
	        in.close();
	        
	        // turns our 2d array of colors into a new png file
	        create_new_image(new_image);
	        File output_file = new File("Images/" + outputName);
	        ImageIO.write(new_image, "png", output_file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
		
    
    public void create_pixel_array(BufferedImage image) {
        w = image.getWidth();
        h = image.getHeight();
        pixels = new Color[h][];
        for (int i = 0; i < h; i++) {
            pixels[i] = new Color[w];
            for (int j = 0; j < w; j++) {
                pixels[i][j] = new Color(image.getRGB(j,i));
            }
        }
    }

    public void create_new_image(BufferedImage new_image) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
            		new_image.setRGB(j, i, pixels[i][j].getRGB());
            }
        }
    }

    public static void main(String[] args) {
		new PhotoshopFiller();
	}

    public PhotoshopFiller() {
		run();
    }
}