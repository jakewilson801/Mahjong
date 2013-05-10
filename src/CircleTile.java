import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class CircleTile extends Tile {
	private int value;
	private String type;

	CircleTile(int value) {
		super("Circle" +value);
		this.value = value;
		this.setType("Circle" + value);
		setToolTipText("Circle"  + value); 
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		switch (value) {
		case 1:
			Graphics2D g1 = (Graphics2D) g;
			g1.drawOval(28, 25, 49, 49);
			g1.setPaint(new Color(0, 128, 0));
			g1.fillOval(28, 25, 49, 49);

			g1.setPaint(new Color(255, 255, 255));
			g1.drawOval(45, 42, 15, 15);
			g1.setPaint(new Color(255, 0, 0));
			g1.fillOval(45, 42, 15, 15);

			g1.setPaint(new Color(255, 255, 255));
			g1.drawLine(47, 44, 57, 54);
			g1.drawLine(57, 44, 47, 54);
			break;
		case 2:
			Graphics2D g2 = (Graphics2D) g;
			g2.setPaint(new Color(255, 255, 255));
			g2.drawOval(38, 9, 30, 30);
			g2.setPaint(new Color(0, 128, 0));
			g2.fillOval(38, 9, 30, 30);

			g2.setPaint(new Color(255, 255, 255));
			g2.drawOval(38, 58, 30, 30);
			g2.setPaint(new Color(255, 0, 0));
			g2.fillOval(38, 58, 30, 30);

			g2.setPaint(new Color(255, 255, 255));
			g2.drawLine(43, 13, 63, 33);
			g2.drawLine(63, 13, 43, 33);

			g2.drawLine(43, 63, 63, 83);
			g2.drawLine(63, 63, 43, 83);

			break;
		case 3:
			Graphics2D g3 = (Graphics2D) g;
			g3.setPaint(new Color(255, 255, 255));
			g3.drawOval(22, 6, 20, 20);
			g3.setPaint(new Color(0, 128, 0));
			g3.fillOval(22, 6, 20, 20);

			g3.setPaint(new Color(0, 255, 0));
			g3.drawOval(42, 40, 20, 20);
			g3.setPaint(new Color(255, 0, 0));
			g3.fillOval(42, 40, 20, 20);

			g3.setPaint(new Color(255, 255, 255));
			g3.drawOval(64, 72, 20, 20);
			g3.setPaint(new Color(0, 0, 255));
			g3.fillOval(64, 72, 20, 20);

			g3.setPaint(new Color(255, 255, 255));
			g3.drawLine(27, 11, 37, 21);
			g3.drawLine(37, 11, 27, 21);

			g3.setPaint(new Color(255, 255, 255));
			g3.drawLine(47, 45, 57, 55);
			g3.drawLine(57, 45, 47, 55);

			g3.setPaint(new Color(255, 255, 255));
			g3.drawLine(69, 77, 79, 87);
			g3.drawLine(79, 77, 69, 87);
			break;
		case 4:
			Graphics2D g4 = (Graphics2D) g;
			g4.setPaint(new Color(255, 255, 255));
			g4.drawOval(22, 9, 30, 30);
			g4.setPaint(new Color(0, 0, 255));
			g4.fillOval(22, 9, 30, 30);

			g4.setPaint(new Color(255, 255, 255));
			g4.drawOval(55, 9, 30, 30);
			g4.setPaint(new Color(0, 128, 0));
			g4.fillOval(55, 9, 30, 30);

			g4.setPaint(new Color(255, 255, 255));
			g4.drawOval(22, 58, 30, 30);
			g4.setPaint(new Color(0, 128, 0));
			g4.fillOval(22, 58, 30, 30);

			g4.setPaint(new Color(255, 255, 255));
			g4.drawOval(55, 58, 30, 30);
			g4.setPaint(new Color(0, 0, 255));
			g4.fillOval(55, 58, 30, 30);

			g4.setPaint(new Color(255, 255, 255));
			g4.drawLine(28, 13, 48, 33);
			g4.drawLine(48, 13, 28, 33);

			g4.drawLine(60, 13, 80, 33);
			g4.drawLine(80, 13, 60, 33);

			g4.drawLine(28, 63, 48, 83);
			g4.drawLine(48, 63, 28, 83);

			g4.drawLine(60, 63, 80, 83);
			g4.drawLine(80, 63, 60, 83);
			break;
		case 5:
			Graphics2D g5 = (Graphics2D) g;
			g5.setPaint(new Color(255, 255, 255));
			g5.drawOval(22, 6, 20, 20);
			g5.setPaint(new Color(0, 0, 255));
			g5.fillOval(22, 6, 20, 20);

			g5.setPaint(new Color(255, 255, 255));
			g5.drawOval(64, 6, 20, 20);
			g5.setPaint(new Color(0, 128, 0));
			g5.fillOval(64, 6, 20, 20);

			g5.setPaint(new Color(0, 255, 0));
			g5.drawOval(42, 40, 20, 20);
			g5.setPaint(new Color(255, 0, 0));
			g5.fillOval(42, 40, 20, 20);

			g5.setPaint(new Color(255, 255, 255));
			g5.drawOval(22, 72, 20, 20);
			g5.setPaint(new Color(0, 128, 0));
			g5.fillOval(22, 72, 20, 20);

			g5.setPaint(new Color(255, 255, 255));
			g5.drawOval(64, 72, 20, 20);
			g5.setPaint(new Color(0, 0, 255));
			g5.fillOval(64, 72, 20, 20);

			g5.setPaint(new Color(255, 255, 255));
			g5.drawLine(27, 11, 37, 21);
			g5.drawLine(37, 11, 27, 21);

			g5.drawLine(69, 11, 79, 21);
			g5.drawLine(79, 11, 69, 21);

			g5.drawLine(47, 45, 57, 55);
			g5.drawLine(57, 45, 47, 55);

			g5.drawLine(27, 77, 37, 87);
			g5.drawLine(37, 77, 27, 87);

			g5.drawLine(69, 77, 79, 87);
			g5.drawLine(79, 77, 69, 87);
			break;
		case 6:
			Graphics2D g6 = (Graphics2D) g;
			g6.setPaint(new Color(255, 255, 255));
			g6.drawOval(22, 6, 20, 20);
			g6.setPaint(new Color(0, 128, 0));
			g6.fillOval(22, 6, 20, 20);

			g6.setPaint(new Color(255, 255, 255));
			g6.drawOval(64, 6, 20, 20);
			g6.setPaint(new Color(0, 128, 0));
			g6.fillOval(64, 6, 20, 20);

			g6.setPaint(new Color(0, 255, 0));
			g6.drawOval(22, 40, 20, 20);
			g6.setPaint(new Color(255, 0, 0));
			g6.fillOval(22, 40, 20, 20);

			g6.setPaint(new Color(0, 255, 0));
			g6.drawOval(64, 40, 20, 20);
			g6.setPaint(new Color(255, 0, 0));
			g6.fillOval(64, 40, 20, 20);

			g6.setPaint(new Color(255, 255, 255));
			g6.drawOval(22, 72, 20, 20);
			g6.setPaint(new Color(255, 0, 0));
			g6.fillOval(22, 72, 20, 20);

			g6.setPaint(new Color(255, 255, 255));
			g6.drawOval(64, 72, 20, 20);
			g6.setPaint(new Color(255, 0, 0));
			g6.fillOval(64, 72, 20, 20);

			g6.setPaint(new Color(255, 255, 255));
			g6.drawLine(27, 11, 37, 21);
			g6.drawLine(37, 11, 27, 21);

			g6.drawLine(69, 11, 79, 21);
			g6.drawLine(79, 11, 69, 21);

			g6.drawLine(27, 45, 37, 55);
			g6.drawLine(37, 45, 27, 55);

			g6.drawLine(69, 45, 79, 55);
			g6.drawLine(79, 45, 69, 55);

			g6.drawLine(27, 77, 37, 87);
			g6.drawLine(37, 77, 27, 87);

			g6.drawLine(69, 77, 79, 87);
			g6.drawLine(79, 77, 69, 87);
			break;
		case 7:
			Graphics2D g7 = (Graphics2D) g;
			g7.setPaint(new Color(255, 255, 255));
			g7.drawOval(22, 6, 15, 15);
			g7.setPaint(new Color(0, 0, 255));
			g7.fillOval(22, 6, 15, 15);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawOval(45, 20, 15, 15);
			g7.setPaint(new Color(0, 0, 255));
			g7.fillOval(45, 20, 15, 15);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawOval(68, 34, 15, 15);
			g7.setPaint(new Color(0, 0, 255));
			g7.fillOval(68, 34, 15, 15);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawOval(32, 55, 15, 15);
			g7.setPaint(new Color(0, 0, 255));
			g7.fillOval(32, 55, 15, 15);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawOval(32, 55, 15, 15);
			g7.setPaint(new Color(255, 0, 0));
			g7.fillOval(32, 55, 15, 15);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawOval(54, 55, 15, 15);
			g7.setPaint(new Color(255, 0, 0));
			g7.fillOval(54, 55, 15, 15);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawOval(32, 80, 15, 15);
			g7.setPaint(new Color(255, 0, 0));
			g7.fillOval(32, 80, 15, 15);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawOval(54, 80, 15, 15);
			g7.setPaint(new Color(255, 0, 0));
			g7.fillOval(54, 80, 15, 15);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawLine(27, 11, 32, 16);
			g7.drawLine(32, 11, 27, 16);

			g7.drawLine(50, 25, 55, 30);
			g7.drawLine(55, 25, 50, 30);

			g7.drawLine(73, 39, 78, 44);
			g7.drawLine(78, 39, 73, 44);

			g7.drawLine(37, 60, 42, 65);
			g7.drawLine(42, 60, 37, 65);

			g7.drawLine(59, 60, 64, 65);
			g7.drawLine(64, 60, 59, 65);

			g7.drawLine(37, 85, 42, 90);
			g7.drawLine(42, 85, 37, 90);

			g7.drawLine(59, 85, 64, 90);
			g7.drawLine(64, 85, 59, 90);
			break;
		case 8:
			Graphics2D g8 = (Graphics2D) g;
			g8.setPaint(new Color(255, 255, 255));
			g8.drawOval(32, 6, 15, 15);
			g8.setPaint(new Color(0, 0, 255));
			g8.fillOval(32, 6, 15, 15);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawOval(54, 6, 15, 15);
			g8.setPaint(new Color(0, 0, 255));
			g8.fillOval(54, 6, 15, 15);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawOval(32, 30, 15, 15);
			g8.setPaint(new Color(0, 0, 255));
			g8.fillOval(32, 30, 15, 15);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawOval(54, 30, 15, 15);
			g8.setPaint(new Color(0, 0, 255));
			g8.fillOval(54, 30, 15, 15);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawOval(32, 55, 15, 15);
			g8.setPaint(new Color(0, 0, 255));
			g8.fillOval(32, 55, 15, 15);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawOval(32, 55, 15, 15);
			g8.setPaint(new Color(0, 0, 255));
			g8.fillOval(32, 55, 15, 15);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawOval(54, 55, 15, 15);
			g8.setPaint(new Color(0, 0, 255));
			g8.fillOval(54, 55, 15, 15);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawOval(32, 80, 15, 15);
			g8.setPaint(new Color(0, 0, 255));
			g8.fillOval(32, 80, 15, 15);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawOval(54, 80, 15, 15);
			g8.setPaint(new Color(0, 0, 255));
			g8.fillOval(54, 80, 15, 15);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawLine(37, 10, 42, 15);
			g8.drawLine(42, 10, 37, 15);

			g8.drawLine(59, 10, 64, 15);
			g8.drawLine(64, 10, 59, 15);

			g8.drawLine(37, 35, 42, 40);
			g8.drawLine(42, 35, 37, 40);

			g8.drawLine(59, 35, 64, 40);
			g8.drawLine(64, 35, 59, 40);

			g8.drawLine(37, 60, 42, 65);
			g8.drawLine(42, 60, 37, 65);

			g8.drawLine(59, 60, 64, 65);
			g8.drawLine(64, 60, 59, 65);

			g8.drawLine(37, 85, 42, 90);
			g8.drawLine(42, 85, 37, 90);

			g8.drawLine(59, 85, 64, 90);
			g8.drawLine(64, 85, 59, 90);
			break;
		case 9:
			Graphics2D g9 = (Graphics2D) g;
			g9.setPaint(new Color(255, 255, 255));
			g9.drawOval(22, 6, 20, 20);
			g9.setPaint(new Color(0, 128, 0));
			g9.fillOval(22, 6, 20, 20);

			g9.setPaint(new Color(255, 255, 255));
			g9.drawOval(42, 6, 20, 20);
			g9.setPaint(new Color(0, 128, 0));
			g9.fillOval(42, 6, 20, 20);

			g9.setPaint(new Color(0, 255, 0));
			g9.drawOval(64, 6, 20, 20);
			g9.setPaint(new Color(0, 128, 0));
			g9.fillOval(64, 6, 20, 20);

			g9.setPaint(new Color(0, 255, 0));
			g9.drawOval(22, 40, 20, 20);
			g9.setPaint(new Color(255, 0, 0));
			g9.fillOval(22, 40, 20, 20);

			g9.setPaint(new Color(255, 255, 255));
			g9.drawOval(42, 40, 20, 20);
			g9.setPaint(new Color(255, 0, 0));
			g9.fillOval(42, 40, 20, 20);

			g9.setPaint(new Color(255, 255, 255));
			g9.drawOval(64, 40, 20, 20);
			g9.setPaint(new Color(255, 0, 0));
			g9.fillOval(64, 40, 20, 20);

			g9.setPaint(new Color(0, 255, 0));
			g9.drawOval(22, 72, 20, 20);
			g9.setPaint(new Color(255, 0, 0));
			g9.fillOval(22, 72, 20, 20);

			g9.setPaint(new Color(255, 255, 255));
			g9.drawOval(42, 72, 20, 20);
			g9.setPaint(new Color(255, 0, 0));
			g9.fillOval(42, 72, 20, 20);

			g9.setPaint(new Color(255, 255, 255));
			g9.drawOval(64, 72, 20, 20);
			g9.setPaint(new Color(255, 0, 0));
			g9.fillOval(64, 72, 20, 20);

			g9.setPaint(new Color(255, 255, 255));
			g9.drawLine(27, 11, 37, 21);
			g9.drawLine(37, 11, 27, 21);

			g9.drawLine(69, 11, 79, 21);
			g9.drawLine(79, 11, 69, 21);

			g9.drawLine(27, 45, 37, 55);
			g9.drawLine(37, 45, 27, 55);

			g9.drawLine(69, 45, 79, 55);
			g9.drawLine(79, 45, 69, 55);

			g9.drawLine(27, 77, 37, 87);
			g9.drawLine(37, 77, 27, 87);

			g9.drawLine(69, 77, 79, 87);
			g9.drawLine(79, 77, 69, 87);

			g9.drawLine(47, 11, 57, 21);
			g9.drawLine(57, 11, 47, 21);

			g9.drawLine(47, 45, 57, 55);
			g9.drawLine(57, 45, 47, 55);

			g9.drawLine(47, 77, 57, 87);
			g9.drawLine(57, 77, 47, 87);
			break;
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Circle Tiles");

		frame.add(new CircleTile(1));
		frame.add(new CircleTile(2));
		frame.add(new CircleTile(3));
		frame.add(new CircleTile(4));
		frame.add(new CircleTile(5));
		frame.add(new CircleTile(6));
		frame.add(new CircleTile(7));
		frame.add(new CircleTile(8));
		frame.add(new CircleTile(9));

		frame.pack();
		frame.setVisible(true);
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}