package rtype;

import javax.swing.JFrame;


public class RType  extends JFrame{
	
	/**
	 private String craft = "craft.png";
	 
	 private String craft = "alien.png";
	 */
	

	/**
	 * 
	 */
	public RType() {
        add(new Board());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("Collision");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RType();
    }
}
	



