import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JFrame;







public class WhiteDragonTile extends Tile {
	

	public WhiteDragonTile(){

		super("WhiteDragon"); 

	}




	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		g2.setPaint(Color.BLUE); 

		g2.drawRect(25, 10, 10, 5);

	

		g2.fillRect(25, 10, 10, 5);

		g2.setPaint(Color.WHITE); 

		g2.drawRect(35, 10, 10, 5);

		g2.fillRect(35, 10, 10, 5);

		g2.setPaint(Color.BLUE); 

		g2.drawRect(45, 10, 10, 5);

		g2.fillRect(45, 10, 10, 5);

		g2.setPaint(Color.WHITE); 

		g2.drawRect(55, 10, 10, 5);

		g2.fillRect(55, 10, 10, 5);

		g2.setPaint(Color.BLUE); 

		g2.drawRect(65, 10, 10, 5);

	

		g2.fillRect(65, 10, 10, 5);

		g2.setPaint(Color.WHITE); 

		g2.drawRect(75, 10, 7, 5);

		g2.fillRect(75, 10, 7, 5);

		

		g2.setPaint(Color.BLUE); 

		g2.drawRect(77, 15, 5, 10);

		g2.fillRect(77, 15, 5, 10);

		

		g2.setPaint(Color.WHITE); 

		g2.drawRect(77, 25, 5, 10);

		g2.fillRect(77, 25, 5, 10);

		g2.setPaint(Color.BLUE); 

		g2.drawRect(77, 35, 5, 10);

		g2.fillRect(77, 35, 5, 10);

		g2.setPaint(Color.WHITE); 

		g2.drawRect(77, 45, 5, 10);

		g2.fillRect(77, 45, 5, 10);

		g2.setPaint(Color.BLUE); 

		g2.drawRect(77, 55, 5, 10);

		g2.fillRect(77, 55, 5, 10);

		g2.setPaint(Color.WHITE); 

		g2.drawRect(77, 65, 5, 10);

		g2.fillRect(77, 65, 5, 10);

		g2.setPaint(Color.BLUE); 

		g2.drawRect(77, 75, 5, 10);

		g2.fillRect(77, 75, 5, 10);

		g2.setPaint(Color.WHITE); 

		g2.drawRect(77, 85, 5, 10);

		g2.fillRect(77, 85, 5, 10);

		

		g2.setPaint(Color.BLUE); 

		g2.drawRect(25, 85, 10, 5);

	

		g2.fillRect(25, 85, 10, 5);

		g2.setPaint(Color.WHITE); 

		g2.drawRect(35, 85, 10, 5);

		g2.fillRect(35, 85, 10, 5);

		g2.setPaint(Color.BLUE); 

		g2.drawRect(45, 85, 10, 5);

		g2.fillRect(45, 85, 10, 5);

		g2.setPaint(Color.WHITE); 

		g2.drawRect(55, 85, 10, 5);

		g2.fillRect(55, 85, 10, 5);

		g2.setPaint(Color.BLUE); 

		g2.drawRect(65, 85, 10, 5);

	

		g2.fillRect(65, 85, 10, 5);

		g2.setPaint(Color.WHITE); 

		g2.drawRect(75, 85, 7, 5);

		g2.fillRect(75, 85, 7, 5);

		

		

		g2.setPaint(Color.WHITE); 

		g2.drawRect(25, 15, 5, 10);

		g2.fillRect(25, 15, 5, 10);

		

		g2.setPaint(Color.BLUE); 

		g2.drawRect(25, 25, 5, 10);

		g2.fillRect(25, 25, 5, 10);

		g2.setPaint(Color.WHITE);  

		g2.drawRect(25, 35, 5, 10);

		g2.fillRect(25, 35, 5, 10);

		g2.setPaint(Color.BLUE); 

		g2.drawRect(25, 45, 5, 10);

		g2.fillRect(25, 45, 5, 10);

		g2.setPaint(Color.WHITE);

		g2.drawRect(25, 55, 5, 10);

		g2.fillRect(25, 55, 5, 10);

		g2.setPaint(Color.BLUE); 

		g2.drawRect(25, 65, 5, 10);

		g2.fillRect(25, 65, 5, 10);

		g2.setPaint(Color.WHITE);  

		g2.drawRect(25, 75, 5, 7);

		g2.fillRect(25, 75, 5, 7);

//		g2.setPaint(Color.BLUE); 

//		g2.drawRect(25, 85, 5, 10);

//		g2.fillRect(25, 85, 5, 10);

		

		g2.setPaint(Color.BLACK);

		Polygon p = new Polygon(); 

		p.addPoint(25, 10); 

		p.addPoint(82, 10);

		p.addPoint (82, 90); 

		p.addPoint(25,90); 

		Polygon p1 = new Polygon(); 

		p1.addPoint(30, 15); 

		p1.addPoint(77, 15);

		p1.addPoint (77, 85); 

		p1.addPoint(30,85); 

		g2.drawPolygon(p);

		g2.drawPolygon(p1);

		

		

		

		

	}
	
	public static void main(String[] args)
	{
		JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("WhiteDragon Tile");

		frame.add(new WhiteDragonTile());

		frame.pack();
		frame.setVisible(true);
	}
}