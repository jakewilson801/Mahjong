import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tile extends JPanel {
	private final Dimension SIZE = new Dimension(90, 125);
	public int x; 
	public int y; 
	public int z; 
	public String type;
	
	public Color c =new Color(198, 226, 255); 
	public Color w = new Color(255,255,255);
	public int zOrder; 
	public int xx; 
	public int yy; 
	
	public Tile(String t) {
		setPreferredSize(SIZE);
		setSize(SIZE.width, SIZE.height);
		setOpaque(false);
		if (t.equals("Bamboo") || t.equals("Chrysanthemum")
				|| t.equals("Orchid") || t.equals("Plum")) {
			t = "flower"; 
		}else if(t.equals("Fall") || t.equals("Spring")
				|| t.equals("Winter") || t.equals("Summer"))
			t= "season"; 
		this.type = t; 
	}
	
	public boolean isSame(Object o){
		if(this == o)
			return true; 
		else 
			return false; 
		
	}

		
		

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(new Color(71, 60, 39));
		g2.drawRect(20, 0, 66, 99);
		g2.setPaint(new Color(0, 0, 0));
		g2.drawRect(20, 0, 66, 99);
		//g2.setPaint(new Color(0, 0, 0));
		g2.setPaint(c);
		g2.fillRect(21, 1, 65, 98);
		g2.setPaint(new Color(0, 0, 0));
		g2.drawLine(20, 99, 85, 99);
		
		  GradientPaint bottom1 = new GradientPaint(20, 0, Color.black, 60,90,
			        Color.white);
		  GradientPaint bottom = new GradientPaint(20, 0, Color.black, 60,90,
			        Color.white);
		  GradientPaint top = new GradientPaint(20, 99, Color.green, 60,90,
			        Color.green);
		Polygon p1 = new Polygon();

		p1.addPoint(20, 0);
		p1.addPoint(10, 10);
		p1.addPoint(10, 109);
		p1.addPoint(20, 99);
		g2.setPaint(new Color(255, 255, 255));
		
		g2.drawPolygon(p1);
		//g2.setPaint(bottom1);
		g2.fillPolygon(p1);
		Polygon p2 = new Polygon();

		p2.addPoint(86, 99);
		p2.addPoint(76, 109);
		p2.addPoint(10, 109);
		p2.addPoint(20, 99);
	
		g2.setPaint(new Color(255, 255, 255));
 
	//	g2.setPaint(bottom);
		g2.drawPolygon(p2);
		
		g2.fillPolygon(p2);
	
		Polygon p3 = new Polygon();

		p3.addPoint(10, 10);
		p3.addPoint(0, 20);
		p3.addPoint(0, 119);
		p3.addPoint(10, 109);
		g2.setPaint(new Color(0, 0, 0));
		g2.drawPolygon(p3);
	//	g2.setPaint(top);
		g2.fillPolygon(p3); 
		Polygon p4 = new Polygon();

		p4.addPoint(76, 109);
		p4.addPoint(66, 119);
		p4.addPoint(0, 119);
		p4.addPoint(10, 109);
		g2.setPaint(new Color(0, 0, 0));
		
		g2.drawPolygon(p4);
	//	g2.setPaint(top);
		g2.fillPolygon(p4);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tile");

		frame.add(new Tile("tile"));
		frame.pack();
		frame.setVisible(true);
	}
}
