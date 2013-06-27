package rtype;

import java.awt.Image;

import java.awt.Rectangle;


import javax.swing.ImageIcon;

public class missile {

	
	private int x, y;
	private Image image;
	boolean visible;
	private int width, height;
	
	private final int BOARD_WIDTH = 390;
	private final int MISSILE_SPEED = 2; 
	
	
		public missile (int x, int y){
			
			javax.swing.ImageIcon ii =
				new ImageIcon (this.getClass().getResource("missile.png"));
			image = ii.getImage();
					visible = true;
					width = image.getWidth(null);
					height = image.getHeight(null);
			this.x = x;
			this.y = y;
			
		}
		
		public Image getImage() {
			return image;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public Boolean isVisible() {
			return visible;
		}
		
		public void setVisible(Boolean visible){
			this.visible = visible;
		}
		
		public Rectangle getBounds() {
			return new Rectangle(x, y, width, height);
		}
		public void move() {
			 x +=  MISSILE_SPEED;
			 if(x > BOARD_WIDTH)
				 visible = false;
		}
		

		
}
