
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Elohe Yonas
 * CSC201
 *
 */

public class GridLayoutDemo extends JFrame{
	private JButton button1, button2, button3, button4, button5, button6;
	private JPanel panel1, panel2;
	private JFrame frame1;

	public GridLayoutDemo(){
		/**
		 * creating the properties of class GridLayoutDemo
		 */
		
		button1 = new JButton("Button1");
		button2 = new JButton("Button2");
		button3 = new JButton("Button3");
		button4 = new JButton("Button4");
		button5 = new JButton("Button5");
		button6 = new JButton("Button6");
		panel1 = new JPanel();
		panel2 = new JPanel();
	
		
		
/**
 * setting the layouts for the panels, borders than grids.
 */
		panel1.setLayout(new BorderLayout());
		add(panel1,BorderLayout.SOUTH);
		panel2.setLayout(new BorderLayout());
		add(panel2,BorderLayout.CENTER);
		panel1.setLayout(new GridLayout(2,2));
		/**
		 * add the buttons to the panels
		 */			
	    panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		
		
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.setLayout(new GridLayout(2,2));
		
		
		/**
		 * set the title, visibility, and size(with pack).
		 */
		setTitle("GridLayoutDemo");
		setVisible(true);
	pack();
	}
}
