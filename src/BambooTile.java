import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class BambooTile extends Tile {
	private int value = 0;
	private String type; 
	public BambooTile(int value) {
		super("Bamboo"+value); 
		this.value = value;
		setToolTipText("Bamboo" + value);
		this.setType("Bamboo" +value); 
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		switch (value) {
//		case 1:
//			Graphics2D g0 = (Graphics2D) g;
//			g0.setPaint(new Color(0, 0, 255));
//			g0.drawArc(47, 20, 5, 5, 90, 90);
//			g0.fillArc(47, 20, 7, 7, 90, 90);
//
//			g0.drawArc(51, 20, 5, 5, 0, 90);
//			g0.fillArc(51, 20, 7, 7, 0, 90);
//
//			g0.drawRect(51, 20, 3, 4);
//			g0.fillRect(51, 20, 3, 4);
//
//			g0.drawRect(51, 25, 3, 4);
//			g0.fillRect(51, 25, 3, 4);
//
//			g0.drawArc(47, 30, 5, 5, 90, 90);
//			g0.fillArc(47, 30, 7, 7, 90, 90);
//
//			g0.drawArc(51, 30, 5, 5, 0, 90);
//			g0.fillArc(51, 30, 7, 7, 0, 90);
//
//			g0.drawRect(51, 30, 3, 3);
//			g0.fillRect(51, 30, 3, 3);
//
//			g0.drawRect(51, 34, 3, 5);
//			g0.fillRect(51, 34, 3, 5);
//
//			g0.drawArc(47, 39, 5, 5, 90, 90);
//			g0.fillArc(47, 39, 7, 7, 90, 90);
//
//			g0.drawArc(51, 39, 5, 5, 0, 90);
//			g0.fillArc(51, 39, 7, 7, 0, 90);
//
//			g0.drawRect(51, 39, 3, 3);
//			g0.fillRect(51, 39, 3, 3);
//			g0.setPaint(new Color(255, 255, 255));
//			g0.drawLine(53, 21, 53, 29);
//			g0.drawLine(53, 33, 53, 41);
//			break;
		case 2:
			Graphics2D g1 = (Graphics2D) g;
			g1.setPaint(new Color(0, 0, 255));
			g1.drawArc(47, 20, 5, 5, 90, 90);
			g1.fillArc(47, 20, 7, 7, 90, 90);

			g1.drawArc(51, 20, 5, 5, 0, 90);
			g1.fillArc(51, 20, 7, 7, 0, 90);

			g1.drawRect(51, 20, 3, 5);
			g1.fillRect(51, 20, 3, 5);

			g1.drawRect(51, 25, 3, 5);
			g1.fillRect(51, 25, 3, 5);

			g1.drawArc(47, 30, 5, 5, 90, 90);
			g1.fillArc(47, 30, 7, 7, 90, 90);

			g1.drawArc(51, 30, 5, 5, 0, 90);
			g1.fillArc(51, 30, 7, 7, 0, 90);

			g1.drawRect(51, 30, 3, 3);
			g1.fillRect(51, 30, 3, 3);

			g1.drawRect(51, 34, 3, 5);
			g1.fillRect(51, 34, 3, 5);

			g1.drawArc(47, 39, 5, 5, 90, 90);
			g1.fillArc(47, 39, 7, 7, 90, 90);

			g1.drawArc(51, 39, 5, 5, 0, 90);
			g1.fillArc(51, 39, 7, 7, 0, 90);

			g1.drawRect(51, 39, 3, 3);
			g1.fillRect(51, 39, 3, 3);

			g1.setPaint(new Color(255, 255, 255));
			g1.drawLine(53, 21, 53, 29);
			g1.drawLine(53, 33, 53, 41);

			g1.setPaint(new Color(0, 128, 0));
			g1.drawArc(47, 60, 5, 5, 90, 90);
			g1.fillArc(47, 60, 7, 7, 90, 90);

			g1.drawArc(51, 60, 5, 5, 0, 90);
			g1.fillArc(51, 60, 7, 7, 0, 90);

			g1.drawRect(51, 60, 3, 5);
			g1.fillRect(51, 60, 3, 5);

			g1.drawRect(51, 65, 3, 5);
			g1.fillRect(51, 65, 3, 5);

			g1.drawArc(47, 70, 5, 5, 90, 90);
			g1.fillArc(47, 70, 7, 7, 90, 90);

			g1.drawArc(51, 70, 5, 5, 0, 90);
			g1.fillArc(51, 70, 7, 7, 0, 90);

			g1.drawRect(51, 70, 3, 3);
			g1.fillRect(51, 70, 3, 3);

			g1.drawRect(51, 74, 3, 5);
			g1.fillRect(51, 74, 3, 5);

			g1.drawArc(47, 79, 5, 5, 90, 90);
			g1.fillArc(47, 79, 7, 7, 90, 90);

			g1.drawArc(51, 79, 5, 5, 0, 90);
			g1.fillArc(51, 79, 7, 7, 0, 90);

			g1.drawRect(51, 79, 3, 3);
			g1.fillRect(51, 79, 3, 3);

			g1.setPaint(new Color(255, 255, 255));
			g1.drawLine(53, 73, 53, 81);
			g1.drawLine(53, 61, 53, 69);
			break;
		case 3:
			Graphics2D g2 = (Graphics2D) g;
			g2.setPaint(new Color(0, 0, 255));
			g2.drawArc(47, 20, 5, 5, 90, 90);
			g2.fillArc(47, 20, 7, 7, 90, 90);

			g2.drawArc(51, 20, 5, 5, 0, 90);
			g2.fillArc(51, 20, 7, 7, 0, 90);

			g2.drawRect(51, 20, 3, 5);
			g2.fillRect(51, 20, 3, 5);

			g2.drawRect(51, 25, 3, 5);
			g2.fillRect(51, 25, 3, 5);

			g2.drawArc(47, 30, 5, 5, 90, 90);
			g2.fillArc(47, 30, 7, 7, 90, 90);

			g2.drawArc(51, 30, 5, 5, 0, 90);
			g2.fillArc(51, 30, 7, 7, 0, 90);

			g2.drawRect(51, 30, 3, 3);
			g2.fillRect(51, 30, 3, 3);

			g2.drawRect(51, 34, 3, 5);
			g2.fillRect(51, 34, 3, 5);

			g2.drawArc(47, 39, 5, 5, 90, 90);
			g2.fillArc(47, 39, 7, 7, 90, 90);

			g2.drawArc(51, 39, 5, 5, 0, 90);
			g2.fillArc(51, 39, 7, 7, 0, 90);

			g2.drawRect(51, 39, 3, 3);
			g2.fillRect(51, 39, 3, 3);

			g2.setPaint(new Color(255, 255, 255));
			g2.drawLine(53, 21, 53, 29);
			g2.drawLine(53, 33, 53, 41);

			g2.setPaint(new Color(0, 128, 0));
			g2.drawArc(37, 60, 5, 5, 90, 90);
			g2.fillArc(37, 60, 7, 7, 90, 90);

			g2.drawArc(41, 60, 5, 5, 0, 90);
			g2.fillArc(41, 60, 7, 7, 0, 90);

			g2.drawRect(41, 60, 3, 5);
			g2.fillRect(41, 60, 3, 5);

			g2.drawRect(41, 65, 3, 5);
			g2.fillRect(41, 65, 3, 5);

			g2.drawArc(37, 70, 5, 5, 90, 90);
			g2.fillArc(37, 70, 7, 7, 90, 90);

			g2.drawArc(41, 70, 5, 5, 0, 90);
			g2.fillArc(41, 70, 7, 7, 0, 90);

			g2.drawRect(41, 70, 3, 3);
			g2.fillRect(41, 70, 3, 3);

			g2.drawRect(41, 74, 3, 5);
			g2.fillRect(41, 74, 3, 5);

			g2.drawArc(37, 79, 5, 5, 90, 90);
			g2.fillArc(37, 79, 7, 7, 90, 90);

			g2.drawArc(41, 79, 5, 5, 0, 90);
			g2.fillArc(41, 79, 7, 7, 0, 90);

			g2.drawRect(41, 79, 3, 3);
			g2.fillRect(41, 79, 3, 3);

			g2.setPaint(new Color(255, 255, 255));
			g2.drawLine(43, 73, 43, 81);
			g2.drawLine(43, 61, 43, 69);

			g2.setPaint(new Color(0, 128, 0));
			g2.drawArc(57, 60, 5, 5, 90, 90);
			g2.fillArc(57, 60, 7, 7, 90, 90);

			g2.drawArc(61, 60, 5, 5, 0, 90);
			g2.fillArc(61, 60, 7, 7, 0, 90);

			g2.drawRect(61, 60, 3, 5);
			g2.fillRect(61, 60, 3, 5);

			g2.drawRect(61, 65, 3, 5);
			g2.fillRect(61, 65, 3, 5);

			g2.drawArc(57, 70, 5, 5, 90, 90);
			g2.fillArc(57, 70, 7, 7, 90, 90);

			g2.drawArc(61, 70, 5, 5, 0, 90);
			g2.fillArc(61, 70, 7, 7, 0, 90);

			g2.drawRect(61, 70, 3, 3);
			g2.fillRect(61, 70, 3, 3);

			g2.drawRect(61, 74, 3, 5);
			g2.fillRect(61, 74, 3, 5);

			g2.drawArc(57, 79, 5, 5, 90, 90);
			g2.fillArc(57, 79, 7, 7, 90, 90);

			g2.drawArc(61, 79, 5, 5, 0, 90);
			g2.fillArc(61, 79, 7, 7, 0, 90);

			g2.drawRect(61, 79, 3, 3);
			g2.fillRect(61, 79, 3, 3);

			g2.setPaint(new Color(255, 255, 255));
			g2.drawLine(63, 73, 63, 81);
			g2.drawLine(63, 61, 63, 69);
			break;

		case 4:
			Graphics2D g3 = (Graphics2D) g;
			g3.setPaint(new Color(0, 0, 255));
			g3.drawArc(37, 20, 5, 5, 90, 90);
			g3.fillArc(37, 20, 7, 7, 90, 90);

			g3.drawArc(41, 20, 5, 5, 0, 90);
			g3.fillArc(41, 20, 7, 7, 0, 90);

			g3.drawRect(41, 20, 3, 5);
			g3.fillRect(41, 20, 3, 5);

			g3.drawRect(41, 25, 3, 5);
			g3.fillRect(41, 25, 3, 5);

			g3.drawArc(37, 30, 5, 5, 90, 90);
			g3.fillArc(37, 30, 7, 7, 90, 90);

			g3.drawArc(41, 30, 5, 5, 0, 90);
			g3.fillArc(41, 30, 7, 7, 0, 90);

			g3.drawRect(41, 30, 3, 3);
			g3.fillRect(41, 30, 3, 3);

			g3.drawRect(41, 34, 3, 5);
			g3.fillRect(41, 34, 3, 5);

			g3.drawArc(37, 39, 5, 5, 90, 90);
			g3.fillArc(37, 39, 7, 7, 90, 90);

			g3.drawArc(41, 39, 5, 5, 0, 90);
			g3.fillArc(41, 39, 7, 7, 0, 90);

			g3.drawRect(41, 39, 3, 3);
			g3.fillRect(41, 39, 3, 3);

			g3.setPaint(new Color(255, 255, 255));
			g3.drawLine(43, 21, 43, 29);
			g3.drawLine(43, 33, 43, 41);

			g3.setPaint(new Color(0, 128, 0));
			g3.drawArc(57, 20, 5, 5, 90, 90);
			g3.fillArc(57, 20, 7, 7, 90, 90);

			g3.drawArc(61, 20, 5, 5, 0, 90);
			g3.fillArc(61, 20, 7, 7, 0, 90);

			g3.drawRect(61, 20, 3, 5);
			g3.fillRect(61, 20, 3, 5);

			g3.drawRect(61, 25, 3, 5);
			g3.fillRect(61, 25, 3, 5);

			g3.drawArc(57, 30, 5, 5, 90, 90);
			g3.fillArc(57, 30, 7, 7, 90, 90);

			g3.drawArc(61, 30, 5, 5, 0, 90);
			g3.fillArc(61, 30, 7, 7, 0, 90);

			g3.drawRect(61, 30, 3, 3);
			g3.fillRect(61, 30, 3, 3);

			g3.drawRect(61, 34, 3, 5);
			g3.fillRect(61, 34, 3, 5);

			g3.drawArc(57, 39, 5, 5, 90, 90);
			g3.fillArc(57, 39, 7, 7, 90, 90);

			g3.drawArc(61, 39, 5, 5, 0, 90);
			g3.fillArc(61, 39, 7, 7, 0, 90);

			g3.drawRect(61, 39, 3, 3);
			g3.fillRect(61, 39, 3, 3);

			g3.setPaint(new Color(255, 255, 255));
			g3.drawLine(63, 21, 63, 29);
			g3.drawLine(63, 33, 63, 41);

			g3.setPaint(new Color(0, 128, 0));
			g3.drawArc(37, 60, 5, 5, 90, 90);
			g3.fillArc(37, 60, 7, 7, 90, 90);

			g3.drawArc(41, 60, 5, 5, 0, 90);
			g3.fillArc(41, 60, 7, 7, 0, 90);

			g3.drawRect(41, 60, 3, 5);
			g3.fillRect(41, 60, 3, 5);

			g3.drawRect(41, 65, 3, 5);
			g3.fillRect(41, 65, 3, 5);

			g3.drawArc(37, 70, 5, 5, 90, 90);
			g3.fillArc(37, 70, 7, 7, 90, 90);

			g3.drawArc(41, 70, 5, 5, 0, 90);
			g3.fillArc(41, 70, 7, 7, 0, 90);

			g3.drawRect(41, 70, 3, 3);
			g3.fillRect(41, 70, 3, 3);

			g3.drawRect(41, 74, 3, 5);
			g3.fillRect(41, 74, 3, 5);

			g3.drawArc(37, 79, 5, 5, 90, 90);
			g3.fillArc(37, 79, 7, 7, 90, 90);

			g3.drawArc(41, 79, 5, 5, 0, 90);
			g3.fillArc(41, 79, 7, 7, 0, 90);

			g3.drawRect(41, 79, 3, 3);
			g3.fillRect(41, 79, 3, 3);

			g3.setPaint(new Color(255, 255, 255));
			g3.drawLine(43, 73, 43, 81);
			g3.drawLine(43, 61, 43, 69);

			g3.setPaint(new Color(0, 0, 255));
			g3.drawArc(57, 60, 5, 5, 90, 90);
			g3.fillArc(57, 60, 7, 7, 90, 90);

			g3.drawArc(61, 60, 5, 5, 0, 90);
			g3.fillArc(61, 60, 7, 7, 0, 90);

			g3.drawRect(61, 60, 3, 5);
			g3.fillRect(61, 60, 3, 5);

			g3.drawRect(61, 65, 3, 5);
			g3.fillRect(61, 65, 3, 5);

			g3.drawArc(57, 70, 5, 5, 90, 90);
			g3.fillArc(57, 70, 7, 7, 90, 90);

			g3.drawArc(61, 70, 5, 5, 0, 90);
			g3.fillArc(61, 70, 7, 7, 0, 90);

			g3.drawRect(61, 70, 3, 3);
			g3.fillRect(61, 70, 3, 3);

			g3.drawRect(61, 74, 3, 5);
			g3.fillRect(61, 74, 3, 5);

			g3.drawArc(57, 79, 5, 5, 90, 90);
			g3.fillArc(57, 79, 7, 7, 90, 90);

			g3.drawArc(61, 79, 5, 5, 0, 90);
			g3.fillArc(61, 79, 7, 7, 0, 90);

			g3.drawRect(61, 79, 3, 3);
			g3.fillRect(61, 79, 3, 3);

			g3.setPaint(new Color(255, 255, 255));
			g3.drawLine(63, 73, 63, 81);
			g3.drawLine(63, 61, 63, 69);
			break;
		case 5:
			Graphics2D g4 = (Graphics2D) g;

			g4.setPaint(new Color(255, 0, 0));
			g4.drawArc(47, 40, 5, 5, 90, 90);
			g4.fillArc(47, 40, 7, 7, 90, 90);

			g4.drawArc(51, 40, 5, 5, 0, 90);
			g4.fillArc(51, 40, 7, 7, 0, 90);

			g4.drawRect(51, 40, 3, 5);
			g4.fillRect(51, 40, 3, 5);

			g4.drawRect(51, 45, 3, 5);
			g4.fillRect(51, 45, 3, 5);

			g4.drawArc(47, 50, 5, 5, 90, 90);
			g4.fillArc(47, 50, 7, 7, 90, 90);

			g4.drawArc(51, 50, 5, 5, 0, 90);
			g4.fillArc(51, 50, 7, 7, 0, 90);

			g4.drawRect(51, 50, 3, 3);
			g4.fillRect(51, 50, 3, 3);

			g4.drawRect(51, 54, 3, 5);
			g4.fillRect(51, 54, 3, 5);

			g4.drawArc(47, 59, 5, 5, 90, 90);
			g4.fillArc(47, 59, 7, 7, 90, 90);

			g4.drawArc(51, 59, 5, 5, 0, 90);
			g4.fillArc(51, 59, 7, 7, 0, 90);

			g4.drawRect(51, 59, 3, 3);
			g4.fillRect(51, 59, 3, 3);

			g4.setPaint(new Color(255, 255, 255));
			g4.drawLine(53, 53, 53, 61);
			g4.drawLine(53, 41, 53, 49);

			g4.setPaint(new Color(0, 128, 0));
			g4.drawArc(27, 20, 5, 5, 90, 90);
			g4.fillArc(27, 20, 7, 7, 90, 90);

			g4.drawArc(31, 20, 5, 5, 0, 90);
			g4.fillArc(31, 20, 7, 7, 0, 90);

			g4.drawRect(31, 20, 3, 5);
			g4.fillRect(31, 20, 3, 5);

			g4.drawRect(31, 25, 3, 5);
			g4.fillRect(31, 25, 3, 5);

			g4.drawArc(27, 30, 5, 5, 90, 90);
			g4.fillArc(27, 30, 7, 7, 90, 90);

			g4.drawArc(31, 30, 5, 5, 0, 90);
			g4.fillArc(31, 30, 7, 7, 0, 90);

			g4.drawRect(31, 30, 3, 3);
			g4.fillRect(31, 30, 3, 3);

			g4.drawRect(31, 34, 3, 5);
			g4.fillRect(31, 34, 3, 5);

			g4.drawArc(27, 39, 5, 5, 90, 90);
			g4.fillArc(27, 39, 7, 7, 90, 90);

			g4.drawArc(31, 39, 5, 5, 0, 90);
			g4.fillArc(31, 39, 7, 7, 0, 90);

			g4.drawRect(31, 39, 3, 3);
			g4.fillRect(31, 39, 3, 3);

			g4.setPaint(new Color(255, 255, 255));
			g4.drawLine(33, 21, 33, 29);
			g4.drawLine(33, 33, 33, 41);

			g4.setPaint(new Color(0, 128, 0));
			g4.drawArc(67, 20, 5, 5, 90, 90);
			g4.fillArc(67, 20, 7, 7, 90, 90);

			g4.drawArc(71, 20, 5, 5, 0, 90);
			g4.fillArc(71, 20, 7, 7, 0, 90);

			g4.drawRect(71, 20, 3, 5);
			g4.fillRect(71, 20, 3, 5);

			g4.drawRect(71, 25, 3, 5);
			g4.fillRect(71, 25, 3, 5);

			g4.drawArc(67, 30, 5, 5, 90, 90);
			g4.fillArc(67, 30, 7, 7, 90, 90);

			g4.drawArc(71, 30, 5, 5, 0, 90);
			g4.fillArc(71, 30, 7, 7, 0, 90);

			g4.drawRect(71, 30, 3, 3);
			g4.fillRect(71, 30, 3, 3);

			g4.drawRect(71, 34, 3, 5);
			g4.fillRect(71, 34, 3, 5);

			g4.drawArc(67, 39, 5, 5, 90, 90);
			g4.fillArc(67, 39, 7, 7, 90, 90);

			g4.drawArc(71, 39, 5, 5, 0, 90);
			g4.fillArc(71, 39, 7, 7, 0, 90);

			g4.drawRect(71, 39, 3, 3);
			g4.fillRect(71, 39, 3, 3);

			g4.setPaint(new Color(255, 255, 255));
			g4.drawLine(73, 21, 73, 29);
			g4.drawLine(73, 33, 73, 41);

			g4.setPaint(new Color(0, 0, 255));
			g4.drawArc(27, 60, 5, 5, 90, 90);
			g4.fillArc(27, 60, 7, 7, 90, 90);

			g4.drawArc(31, 60, 5, 5, 0, 90);
			g4.fillArc(31, 60, 7, 7, 0, 90);

			g4.drawRect(31, 60, 3, 5);
			g4.fillRect(31, 60, 3, 5);

			g4.drawRect(31, 65, 3, 5);
			g4.fillRect(31, 65, 3, 5);

			g4.drawArc(27, 70, 5, 5, 90, 90);
			g4.fillArc(27, 70, 7, 7, 90, 90);

			g4.drawArc(31, 70, 5, 5, 0, 90);
			g4.fillArc(31, 70, 7, 7, 0, 90);

			g4.drawRect(31, 70, 3, 3);
			g4.fillRect(31, 70, 3, 3);

			g4.drawRect(31, 74, 3, 5);
			g4.fillRect(31, 74, 3, 5);

			g4.drawArc(27, 79, 5, 5, 90, 90);
			g4.fillArc(27, 79, 7, 7, 90, 90);

			g4.drawArc(31, 79, 5, 5, 0, 90);
			g4.fillArc(31, 79, 7, 7, 0, 90);

			g4.drawRect(31, 79, 3, 3);
			g4.fillRect(31, 79, 3, 3);

			g4.setPaint(new Color(255, 255, 255));
			g4.drawLine(33, 73, 33, 81);
			g4.drawLine(33, 61, 33, 69);

			g4.setPaint(new Color(0, 0, 255));
			g4.drawArc(67, 60, 5, 5, 90, 90);
			g4.fillArc(67, 60, 7, 7, 90, 90);

			g4.drawArc(71, 60, 5, 5, 0, 90);
			g4.fillArc(71, 60, 7, 7, 0, 90);

			g4.drawRect(71, 60, 3, 5);
			g4.fillRect(71, 60, 3, 5);

			g4.drawRect(71, 65, 3, 5);
			g4.fillRect(71, 65, 3, 5);

			g4.drawArc(67, 70, 5, 5, 90, 90);
			g4.fillArc(67, 70, 7, 7, 90, 90);

			g4.drawArc(71, 70, 5, 5, 0, 90);
			g4.fillArc(71, 70, 7, 7, 0, 90);

			g4.drawRect(71, 70, 3, 3);
			g4.fillRect(71, 70, 3, 3);

			g4.drawRect(71, 74, 3, 5);
			g4.fillRect(71, 74, 3, 5);

			g4.drawArc(67, 79, 5, 5, 90, 90);
			g4.fillArc(67, 79, 7, 7, 90, 90);

			g4.drawArc(71, 79, 5, 5, 0, 90);
			g4.fillArc(71, 79, 7, 7, 0, 90);

			g4.drawRect(71, 79, 3, 3);
			g4.fillRect(71, 79, 3, 3);

			g4.setPaint(new Color(255, 255, 255));
			g4.drawLine(73, 73, 73, 81);
			g4.drawLine(73, 61, 73, 69);
			break;
		case 6:
			Graphics2D g5 = (Graphics2D) g;
			g5.setPaint(new Color(0, 0, 255));
			g5.drawArc(47, 60, 5, 5, 90, 90);
			g5.fillArc(47, 60, 7, 7, 90, 90);

			g5.drawArc(51, 60, 5, 5, 0, 90);
			g5.fillArc(51, 60, 7, 7, 0, 90);

			g5.drawRect(51, 60, 3, 5);
			g5.fillRect(51, 60, 3, 5);

			g5.drawRect(51, 65, 3, 5);
			g5.fillRect(51, 65, 3, 5);

			g5.drawArc(47, 70, 5, 5, 90, 90);
			g5.fillArc(47, 70, 7, 7, 90, 90);

			g5.drawArc(51, 70, 5, 5, 0, 90);
			g5.fillArc(51, 70, 7, 7, 0, 90);

			g5.drawRect(51, 70, 3, 3);
			g5.fillRect(51, 70, 3, 3);

			g5.drawRect(51, 74, 3, 5);
			g5.fillRect(51, 74, 3, 5);

			g5.drawArc(47, 79, 5, 5, 90, 90);
			g5.fillArc(47, 79, 7, 7, 90, 90);

			g5.drawArc(51, 79, 5, 5, 0, 90);
			g5.fillArc(51, 79, 7, 7, 0, 90);

			g5.drawRect(51, 79, 3, 3);
			g5.fillRect(51, 79, 3, 3);

			g5.setPaint(new Color(255, 255, 255));
			g5.drawLine(53, 73, 53, 81);
			g5.drawLine(53, 61, 53, 69);

			g5.setPaint(new Color(0, 128, 0));
			g5.drawArc(47, 20, 5, 5, 90, 90);
			g5.fillArc(47, 20, 7, 7, 90, 90);

			g5.drawArc(51, 20, 5, 5, 0, 90);
			g5.fillArc(51, 20, 7, 7, 0, 90);

			g5.drawRect(51, 20, 3, 5);
			g5.fillRect(51, 20, 3, 5);

			g5.drawRect(51, 25, 3, 5);
			g5.fillRect(51, 25, 3, 5);

			g5.drawArc(47, 30, 5, 5, 90, 90);
			g5.fillArc(47, 30, 7, 7, 90, 90);

			g5.drawArc(51, 30, 5, 5, 0, 90);
			g5.fillArc(51, 30, 7, 7, 0, 90);

			g5.drawRect(51, 30, 3, 3);
			g5.fillRect(51, 30, 3, 3);

			g5.drawRect(51, 34, 3, 5);
			g5.fillRect(51, 34, 3, 5);

			g5.drawArc(47, 39, 5, 5, 90, 90);
			g5.fillArc(47, 39, 7, 7, 90, 90);

			g5.drawArc(51, 39, 5, 5, 0, 90);
			g5.fillArc(51, 39, 7, 7, 0, 90);

			g5.drawRect(51, 39, 3, 3);
			g5.fillRect(51, 39, 3, 3);

			g5.setPaint(new Color(255, 255, 255));
			g5.drawLine(53, 21, 53, 29);
			g5.drawLine(53, 33, 53, 41);

			g5.setPaint(new Color(0, 128, 0));
			g5.drawArc(27, 20, 5, 5, 90, 90);
			g5.fillArc(27, 20, 7, 7, 90, 90);

			g5.drawArc(31, 20, 5, 5, 0, 90);
			g5.fillArc(31, 20, 7, 7, 0, 90);

			g5.drawRect(31, 20, 3, 5);
			g5.fillRect(31, 20, 3, 5);

			g5.drawRect(31, 25, 3, 5);
			g5.fillRect(31, 25, 3, 5);

			g5.drawArc(27, 30, 5, 5, 90, 90);
			g5.fillArc(27, 30, 7, 7, 90, 90);

			g5.drawArc(31, 30, 5, 5, 0, 90);
			g5.fillArc(31, 30, 7, 7, 0, 90);

			g5.drawRect(31, 30, 3, 3);
			g5.fillRect(31, 30, 3, 3);

			g5.drawRect(31, 34, 3, 5);
			g5.fillRect(31, 34, 3, 5);

			g5.drawArc(27, 39, 5, 5, 90, 90);
			g5.fillArc(27, 39, 7, 7, 90, 90);

			g5.drawArc(31, 39, 5, 5, 0, 90);
			g5.fillArc(31, 39, 7, 7, 0, 90);

			g5.drawRect(31, 39, 3, 3);
			g5.fillRect(31, 39, 3, 3);

			g5.setPaint(new Color(255, 255, 255));
			g5.drawLine(33, 21, 33, 29);
			g5.drawLine(33, 33, 33, 41);

			g5.setPaint(new Color(0, 128, 0));
			g5.drawArc(67, 20, 5, 5, 90, 90);
			g5.fillArc(67, 20, 7, 7, 90, 90);

			g5.drawArc(71, 20, 5, 5, 0, 90);
			g5.fillArc(71, 20, 7, 7, 0, 90);

			g5.drawRect(71, 20, 3, 5);
			g5.fillRect(71, 20, 3, 5);

			g5.drawRect(71, 25, 3, 5);
			g5.fillRect(71, 25, 3, 5);

			g5.drawArc(67, 30, 5, 5, 90, 90);
			g5.fillArc(67, 30, 7, 7, 90, 90);

			g5.drawArc(71, 30, 5, 5, 0, 90);
			g5.fillArc(71, 30, 7, 7, 0, 90);

			g5.drawRect(71, 30, 3, 3);
			g5.fillRect(71, 30, 3, 3);

			g5.drawRect(71, 34, 3, 5);
			g5.fillRect(71, 34, 3, 5);

			g5.drawArc(67, 39, 5, 5, 90, 90);
			g5.fillArc(67, 39, 7, 7, 90, 90);

			g5.drawArc(71, 39, 5, 5, 0, 90);
			g5.fillArc(71, 39, 7, 7, 0, 90);

			g5.drawRect(71, 39, 3, 3);
			g5.fillRect(71, 39, 3, 3);

			g5.setPaint(new Color(255, 255, 255));
			g5.drawLine(73, 21, 73, 29);
			g5.drawLine(73, 33, 73, 41);

			g5.setPaint(new Color(0, 0, 255));
			g5.drawArc(27, 60, 5, 5, 90, 90);
			g5.fillArc(27, 60, 7, 7, 90, 90);

			g5.drawArc(31, 60, 5, 5, 0, 90);
			g5.fillArc(31, 60, 7, 7, 0, 90);

			g5.drawRect(31, 60, 3, 5);
			g5.fillRect(31, 60, 3, 5);

			g5.drawRect(31, 65, 3, 5);
			g5.fillRect(31, 65, 3, 5);

			g5.drawArc(27, 70, 5, 5, 90, 90);
			g5.fillArc(27, 70, 7, 7, 90, 90);

			g5.drawArc(31, 70, 5, 5, 0, 90);
			g5.fillArc(31, 70, 7, 7, 0, 90);

			g5.drawRect(31, 70, 3, 3);
			g5.fillRect(31, 70, 3, 3);

			g5.drawRect(31, 74, 3, 5);
			g5.fillRect(31, 74, 3, 5);

			g5.drawArc(27, 79, 5, 5, 90, 90);
			g5.fillArc(27, 79, 7, 7, 90, 90);

			g5.drawArc(31, 79, 5, 5, 0, 90);
			g5.fillArc(31, 79, 7, 7, 0, 90);

			g5.drawRect(31, 79, 3, 3);
			g5.fillRect(31, 79, 3, 3);

			g5.setPaint(new Color(255, 255, 255));
			g5.drawLine(33, 73, 33, 81);
			g5.drawLine(33, 61, 33, 69);

			g5.setPaint(new Color(0, 0, 255));
			g5.drawArc(67, 60, 5, 5, 90, 90);
			g5.fillArc(67, 60, 7, 7, 90, 90);

			g5.drawArc(71, 60, 5, 5, 0, 90);
			g5.fillArc(71, 60, 7, 7, 0, 90);

			g5.drawRect(71, 60, 3, 5);
			g5.fillRect(71, 60, 3, 5);

			g5.drawRect(71, 65, 3, 5);
			g5.fillRect(71, 65, 3, 5);

			g5.drawArc(67, 70, 5, 5, 90, 90);
			g5.fillArc(67, 70, 7, 7, 90, 90);

			g5.drawArc(71, 70, 5, 5, 0, 90);
			g5.fillArc(71, 70, 7, 7, 0, 90);

			g5.drawRect(71, 70, 3, 3);
			g5.fillRect(71, 70, 3, 3);

			g5.drawRect(71, 74, 3, 5);
			g5.fillRect(71, 74, 3, 5);

			g5.drawArc(67, 79, 5, 5, 90, 90);
			g5.fillArc(67, 79, 7, 7, 90, 90);

			g5.drawArc(71, 79, 5, 5, 0, 90);
			g5.fillArc(71, 79, 7, 7, 0, 90);

			g5.drawRect(71, 79, 3, 3);
			g5.fillRect(71, 79, 3, 3);

			g5.setPaint(new Color(255, 255, 255));
			g5.drawLine(73, 73, 73, 81);
			g5.drawLine(73, 61, 73, 69);
			break;

		case 7:
			Graphics2D g6 = (Graphics2D) g;
			g6.setPaint(new Color(0, 0, 255));
			g6.drawArc(47, 70, 5, 5, 90, 90);
			g6.fillArc(47, 70, 7, 7, 90, 90);

			g6.drawArc(51, 70, 5, 5, 0, 90);
			g6.fillArc(51, 70, 7, 7, 0, 90);

			g6.drawRect(51, 70, 3, 5);
			g6.fillRect(51, 70, 3, 5);

			g6.drawRect(51, 75, 3, 5);
			g6.fillRect(51, 75, 3, 5);

			g6.drawArc(47, 80, 5, 5, 90, 90);
			g6.fillArc(47, 80, 7, 7, 90, 90);

			g6.drawArc(51, 80, 5, 5, 0, 90);
			g6.fillArc(51, 80, 7, 7, 0, 90);

			g6.drawRect(51, 80, 3, 3);
			g6.fillRect(51, 80, 3, 3);

			g6.drawRect(51, 84, 3, 5);
			g6.fillRect(51, 84, 3, 5);

			g6.drawArc(47, 89, 5, 5, 90, 90);
			g6.fillArc(47, 89, 7, 7, 90, 90);

			g6.drawArc(51, 89, 5, 5, 0, 90);
			g6.fillArc(51, 89, 7, 7, 0, 90);

			g6.drawRect(51, 89, 3, 3);
			g6.fillRect(51, 89, 3, 3);

			g6.setPaint(new Color(255, 255, 255));
			g6.drawLine(53, 71, 53, 79);
			g6.drawLine(53, 83, 53, 91);

			g6.setPaint(new Color(255, 0, 0));
			g6.drawArc(47, 10, 5, 5, 90, 90);
			g6.fillArc(47, 10, 7, 7, 90, 90);

			g6.drawArc(51, 10, 5, 5, 0, 90);
			g6.fillArc(51, 10, 7, 7, 0, 90);

			g6.drawRect(51, 10, 3, 5);
			g6.fillRect(51, 10, 3, 5);

			g6.drawRect(51, 15, 3, 5);
			g6.fillRect(51, 15, 3, 5);

			g6.drawArc(47, 20, 5, 5, 90, 90);
			g6.fillArc(47, 20, 7, 7, 90, 90);

			g6.drawArc(51, 20, 5, 5, 0, 90);
			g6.fillArc(51, 20, 7, 7, 0, 90);

			g6.drawRect(51, 20, 3, 3);
			g6.fillRect(51, 20, 3, 3);

			g6.drawRect(51, 24, 3, 5);
			g6.fillRect(51, 24, 3, 5);

			g6.drawArc(47, 29, 5, 5, 90, 90);
			g6.fillArc(47, 29, 7, 7, 90, 90);

			g6.drawArc(51, 29, 5, 5, 0, 90);
			g6.fillArc(51, 29, 7, 7, 0, 90);

			g6.drawRect(51, 29, 3, 3);
			g6.fillRect(51, 29, 3, 3);

			g6.setPaint(new Color(255, 255, 255));
			g6.drawLine(53, 23, 53, 31);
			g6.drawLine(53, 11, 53, 19);

			g6.setPaint(new Color(0, 0, 255));
			g6.drawArc(47, 40, 5, 5, 90, 90);
			g6.fillArc(47, 40, 7, 7, 90, 90);

			g6.drawArc(51, 40, 5, 5, 0, 90);
			g6.fillArc(51, 40, 7, 7, 0, 90);

			g6.drawRect(51, 40, 3, 5);
			g6.fillRect(51, 40, 3, 5);

			g6.drawRect(51, 45, 3, 5);
			g6.fillRect(51, 45, 3, 5);

			g6.drawArc(47, 50, 5, 5, 90, 90);
			g6.fillArc(47, 50, 7, 7, 90, 90);

			g6.drawArc(51, 50, 5, 5, 0, 90);
			g6.fillArc(51, 50, 7, 7, 0, 90);

			g6.drawRect(51, 50, 3, 3);
			g6.fillRect(51, 50, 3, 3);

			g6.drawRect(51, 54, 3, 5);
			g6.fillRect(51, 54, 3, 5);

			g6.drawArc(47, 59, 5, 5, 90, 90);
			g6.fillArc(47, 59, 7, 7, 90, 90);

			g6.drawArc(51, 59, 5, 5, 0, 90);
			g6.fillArc(51, 59, 7, 7, 0, 90);

			g6.drawRect(51, 59, 3, 3);
			g6.fillRect(51, 59, 3, 3);

			g6.setPaint(new Color(255, 255, 255));
			g6.drawLine(53, 41, 53, 49);
			g6.drawLine(53, 53, 53, 61);

			g6.setPaint(new Color(0, 128, 0));
			g6.drawArc(27, 40, 5, 5, 90, 90);
			g6.fillArc(27, 40, 7, 7, 90, 90);

			g6.drawArc(31, 40, 5, 5, 0, 90);
			g6.fillArc(31, 40, 7, 7, 0, 90);

			g6.drawRect(31, 40, 3, 5);
			g6.fillRect(31, 40, 3, 5);

			g6.drawRect(31, 45, 3, 5);
			g6.fillRect(31, 45, 3, 5);

			g6.drawArc(27, 50, 5, 5, 90, 90);
			g6.fillArc(27, 50, 7, 7, 90, 90);

			g6.drawArc(31, 50, 5, 5, 0, 90);
			g6.fillArc(31, 50, 7, 7, 0, 90);

			g6.drawRect(31, 50, 3, 3);
			g6.fillRect(31, 50, 3, 3);

			g6.drawRect(31, 54, 3, 5);
			g6.fillRect(31, 54, 3, 5);

			g6.drawArc(27, 59, 5, 5, 90, 90);
			g6.fillArc(27, 59, 7, 7, 90, 90);

			g6.drawArc(31, 59, 5, 5, 0, 90);
			g6.fillArc(31, 59, 7, 7, 0, 90);

			g6.drawRect(31, 59, 3, 3);
			g6.fillRect(31, 59, 3, 3);

			g6.setPaint(new Color(255, 255, 255));
			g6.drawLine(33, 53, 33, 61);
			g6.drawLine(33, 41, 33, 49);

			g6.setPaint(new Color(0, 128, 0));
			g6.drawArc(67, 40, 5, 5, 90, 90);
			g6.fillArc(67, 40, 7, 7, 90, 90);

			g6.drawArc(71, 40, 5, 5, 0, 90);
			g6.fillArc(71, 40, 7, 7, 0, 90);

			g6.drawRect(71, 40, 3, 5);
			g6.fillRect(71, 40, 3, 5);

			g6.drawRect(71, 45, 3, 5);
			g6.fillRect(71, 45, 3, 5);

			g6.drawArc(67, 50, 5, 5, 90, 90);
			g6.fillArc(67, 50, 7, 7, 90, 90);

			g6.drawArc(71, 50, 5, 5, 0, 90);
			g6.fillArc(71, 50, 7, 7, 0, 90);

			g6.drawRect(71, 50, 3, 3);
			g6.fillRect(71, 50, 3, 3);

			g6.drawRect(71, 54, 3, 5);
			g6.fillRect(71, 54, 3, 5);

			g6.drawArc(67, 59, 5, 5, 90, 90);
			g6.fillArc(67, 59, 7, 7, 90, 90);

			g6.drawArc(71, 59, 5, 5, 0, 90);
			g6.fillArc(71, 59, 7, 7, 0, 90);

			g6.drawRect(71, 59, 3, 3);
			g6.fillRect(71, 59, 3, 3);

			g6.setPaint(new Color(255, 255, 255));
			g6.drawLine(73, 53, 73, 61);
			g6.drawLine(73, 41, 73, 49);

			g6.setPaint(new Color(0, 128, 0));
			g6.drawArc(27, 70, 5, 5, 90, 90);
			g6.fillArc(27, 70, 7, 7, 90, 90);

			g6.drawArc(31, 70, 5, 5, 0, 90);
			g6.fillArc(31, 70, 7, 7, 0, 90);

			g6.drawRect(31, 70, 3, 5);
			g6.fillRect(31, 70, 3, 5);

			g6.drawRect(31, 75, 3, 5);
			g6.fillRect(31, 75, 3, 5);

			g6.drawArc(27, 80, 5, 5, 90, 90);
			g6.fillArc(27, 80, 7, 7, 90, 90);

			g6.drawArc(31, 80, 5, 5, 0, 90);
			g6.fillArc(31, 80, 7, 7, 0, 90);

			g6.drawRect(31, 80, 3, 3);
			g6.fillRect(31, 80, 3, 3);

			g6.drawRect(31, 84, 3, 5);
			g6.fillRect(31, 84, 3, 5);

			g6.drawArc(27, 89, 5, 5, 90, 90);
			g6.fillArc(27, 89, 7, 7, 90, 90);

			g6.drawArc(31, 89, 5, 5, 0, 90);
			g6.fillArc(31, 89, 7, 7, 0, 90);

			g6.drawRect(31, 89, 3, 3);
			g6.fillRect(31, 89, 3, 3);

			g6.setPaint(new Color(255, 255, 255));
			g6.drawLine(33, 71, 33, 79);
			g6.drawLine(33, 83, 33, 91);

			g6.setPaint(new Color(0, 128, 0));
			g6.drawArc(67, 70, 5, 5, 90, 90);
			g6.fillArc(67, 70, 7, 7, 90, 90);

			g6.drawArc(71, 70, 5, 5, 0, 90);
			g6.fillArc(71, 70, 7, 7, 0, 90);

			g6.drawRect(71, 70, 3, 5);
			g6.fillRect(71, 70, 3, 5);

			g6.drawRect(71, 75, 3, 5);
			g6.fillRect(71, 75, 3, 5);

			g6.drawArc(67, 80, 5, 5, 90, 90);
			g6.fillArc(67, 80, 7, 7, 90, 90);

			g6.drawArc(71, 80, 5, 5, 0, 90);
			g6.fillArc(71, 80, 7, 7, 0, 90);

			g6.drawRect(71, 80, 3, 3);
			g6.fillRect(71, 80, 3, 3);

			g6.drawRect(71, 84, 3, 5);
			g6.fillRect(71, 84, 3, 5);

			g6.drawArc(67, 89, 5, 5, 90, 90);
			g6.fillArc(67, 89, 7, 7, 90, 90);

			g6.drawArc(71, 89, 5, 5, 0, 90);
			g6.fillArc(71, 89, 7, 7, 0, 90);

			g6.drawRect(71, 89, 3, 3);
			g6.fillRect(71, 89, 3, 3);

			g6.setPaint(new Color(255, 255, 255));
			g6.drawLine(73, 71, 73, 79);
			g6.drawLine(73, 83, 73, 91);
			break;

		case 8:
			Graphics2D g7 = (Graphics2D) g;
			g7.setPaint(new Color(0, 128, 0));
			g7.drawArc(47, 10, 5, 5, 90, 90);
			g7.fillArc(47, 10, 7, 7, 90, 90);

			g7.drawArc(51, 10, 5, 5, 0, 90);
			g7.fillArc(51, 10, 7, 7, 0, 90);

			g7.drawRect(51, 10, 3, 5);
			g7.fillRect(51, 10, 3, 5);

			g7.drawRect(51, 15, 3, 5);
			g7.fillRect(51, 15, 3, 5);

			g7.drawArc(47, 20, 5, 5, 90, 90);
			g7.fillArc(47, 20, 7, 7, 90, 90);

			g7.drawArc(51, 20, 5, 5, 0, 90);
			g7.fillArc(51, 20, 7, 7, 0, 90);

			g7.drawRect(51, 20, 3, 3);
			g7.fillRect(51, 20, 3, 3);

			g7.drawRect(51, 24, 3, 5);
			g7.fillRect(51, 24, 3, 5);

			g7.drawArc(47, 29, 5, 5, 90, 90);
			g7.fillArc(47, 29, 7, 7, 90, 90);

			g7.drawArc(51, 29, 5, 5, 0, 90);
			g7.fillArc(51, 29, 7, 7, 0, 90);

			g7.drawRect(51, 29, 3, 3);
			g7.fillRect(51, 29, 3, 3);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawLine(53, 23, 53, 31);
			g7.drawLine(53, 11, 53, 19);

			g7.setPaint(new Color(0, 128, 0));
			g7.drawArc(27, 10, 5, 5, 90, 90);
			g7.fillArc(27, 10, 7, 7, 90, 90);

			g7.drawArc(31, 10, 5, 5, 0, 90);
			g7.fillArc(31, 10, 7, 7, 0, 90);

			g7.drawRect(31, 10, 3, 5);
			g7.fillRect(31, 10, 3, 5);

			g7.drawRect(31, 15, 3, 5);
			g7.fillRect(31, 15, 3, 5);

			g7.drawArc(27, 20, 5, 5, 90, 90);
			g7.fillArc(27, 20, 7, 7, 90, 90);

			g7.drawArc(31, 20, 5, 5, 0, 90);
			g7.fillArc(31, 20, 7, 7, 0, 90);

			g7.drawRect(31, 20, 3, 3);
			g7.fillRect(31, 20, 3, 3);

			g7.drawRect(31, 24, 3, 5);
			g7.fillRect(31, 24, 3, 5);

			g7.drawArc(27, 29, 5, 5, 90, 90);
			g7.fillArc(27, 29, 7, 7, 90, 90);

			g7.drawArc(31, 29, 5, 5, 0, 90);
			g7.fillArc(31, 29, 7, 7, 0, 90);

			g7.drawRect(31, 29, 3, 3);
			g7.fillRect(31, 29, 3, 3);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawLine(33, 11, 33, 19);
			g7.drawLine(33, 23, 33, 31);

			g7.setPaint(new Color(0, 128, 0));
			g7.drawArc(67, 10, 5, 5, 90, 90);
			g7.fillArc(67, 10, 7, 7, 90, 90);

			g7.drawArc(71, 10, 5, 5, 0, 90);
			g7.fillArc(71, 10, 7, 7, 0, 90);

			g7.drawRect(71, 10, 3, 5);
			g7.fillRect(71, 10, 3, 5);

			g7.drawRect(71, 15, 3, 5);
			g7.fillRect(71, 15, 3, 5);

			g7.drawArc(67, 20, 5, 5, 90, 90);
			g7.fillArc(67, 20, 7, 7, 90, 90);

			g7.drawArc(71, 20, 5, 5, 0, 90);
			g7.fillArc(71, 20, 7, 7, 0, 90);

			g7.drawRect(71, 20, 3, 3);
			g7.fillRect(71, 20, 3, 3);

			g7.drawRect(71, 24, 3, 5);
			g7.fillRect(71, 24, 3, 5);

			g7.drawArc(67, 29, 5, 5, 90, 90);
			g7.fillArc(67, 29, 7, 7, 90, 90);

			g7.drawArc(71, 29, 5, 5, 0, 90);
			g7.fillArc(71, 29, 7, 7, 0, 90);

			g7.drawRect(71, 29, 3, 3);
			g7.fillRect(71, 29, 3, 3);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawLine(73, 11, 73, 19);
			g7.drawLine(73, 23, 73, 31);

			g7.setPaint(new Color(0, 0, 255));
			g7.drawArc(27, 70, 5, 5, 90, 90);
			g7.fillArc(27, 70, 7, 7, 90, 90);

			g7.drawArc(31, 70, 5, 5, 0, 90);
			g7.fillArc(31, 70, 7, 7, 0, 90);

			g7.drawRect(31, 70, 3, 5);
			g7.fillRect(31, 70, 3, 5);

			g7.drawRect(31, 75, 3, 5);
			g7.fillRect(31, 75, 3, 5);

			g7.drawArc(27, 80, 5, 5, 90, 90);
			g7.fillArc(27, 80, 7, 7, 90, 90);

			g7.drawArc(31, 80, 5, 5, 0, 90);
			g7.fillArc(31, 80, 7, 7, 0, 90);

			g7.drawRect(31, 80, 3, 3);
			g7.fillRect(31, 80, 3, 3);

			g7.drawRect(31, 84, 3, 5);
			g7.fillRect(31, 84, 3, 5);

			g7.drawArc(27, 89, 5, 5, 90, 90);
			g7.fillArc(27, 89, 7, 7, 90, 90);

			g7.drawArc(31, 89, 5, 5, 0, 90);
			g7.fillArc(31, 89, 7, 7, 0, 90);

			g7.drawRect(31, 89, 3, 3);
			g7.fillRect(31, 89, 3, 3);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawLine(33, 71, 33, 79);
			g7.drawLine(33, 83, 33, 91);

			g7.setPaint(new Color(0, 0, 255));
			g7.drawArc(47, 70, 5, 5, 90, 90);
			g7.fillArc(47, 70, 7, 7, 90, 90);

			g7.drawArc(51, 70, 5, 5, 0, 90);
			g7.fillArc(51, 70, 7, 7, 0, 90);

			g7.drawRect(51, 70, 3, 5);
			g7.fillRect(51, 70, 3, 5);

			g7.drawRect(51, 75, 3, 5);
			g7.fillRect(51, 75, 3, 5);

			g7.drawArc(47, 80, 5, 5, 90, 90);
			g7.fillArc(47, 80, 7, 7, 90, 90);

			g7.drawArc(51, 80, 5, 5, 0, 90);
			g7.fillArc(51, 80, 7, 7, 0, 90);

			g7.drawRect(51, 80, 3, 3);
			g7.fillRect(51, 80, 3, 3);

			g7.drawRect(51, 84, 3, 5);
			g7.fillRect(51, 84, 3, 5);

			g7.drawArc(47, 89, 5, 5, 90, 90);
			g7.fillArc(47, 89, 7, 7, 90, 90);

			g7.drawArc(51, 89, 5, 5, 0, 90);
			g7.fillArc(51, 89, 7, 7, 0, 90);

			g7.drawRect(51, 89, 3, 3);
			g7.fillRect(51, 89, 3, 3);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawLine(53, 71, 53, 79);
			g7.drawLine(53, 83, 53, 91);

			g7.setPaint(new Color(0, 0, 255));
			g7.drawArc(67, 70, 5, 5, 90, 90);
			g7.fillArc(67, 70, 7, 7, 90, 90);

			g7.drawArc(71, 70, 5, 5, 0, 90);
			g7.fillArc(71, 70, 7, 7, 0, 90);

			g7.drawRect(71, 70, 3, 5);
			g7.fillRect(71, 70, 3, 5);

			g7.drawRect(71, 75, 3, 5);
			g7.fillRect(71, 75, 3, 5);

			g7.drawArc(67, 80, 5, 5, 90, 90);
			g7.fillArc(67, 80, 7, 7, 90, 90);

			g7.drawArc(71, 80, 5, 5, 0, 90);
			g7.fillArc(71, 80, 7, 7, 0, 90);

			g7.drawRect(71, 80, 3, 3);
			g7.fillRect(71, 80, 3, 3);

			g7.drawRect(71, 84, 3, 5);
			g7.fillRect(71, 84, 3, 5);

			g7.drawArc(67, 89, 5, 5, 90, 90);
			g7.fillArc(67, 89, 7, 7, 90, 90);

			g7.drawArc(71, 89, 5, 5, 0, 90);
			g7.fillArc(71, 89, 7, 7, 0, 90);

			g7.drawRect(71, 89, 3, 3);
			g7.fillRect(71, 89, 3, 3);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawLine(73, 71, 73, 79);
			g7.drawLine(73, 83, 73, 91);

			g7.setPaint(new Color(255, 0, 0));
			g7.drawArc(57, 40, 5, 5, 90, 90);
			g7.fillArc(57, 40, 7, 7, 90, 90);

			g7.drawArc(61, 40, 5, 5, 0, 90);
			g7.fillArc(61, 40, 7, 7, 0, 90);

			g7.drawRect(61, 40, 3, 5);
			g7.fillRect(61, 40, 3, 5);

			g7.drawRect(61, 45, 3, 5);
			g7.fillRect(61, 45, 3, 5);

			g7.drawArc(57, 50, 5, 5, 90, 90);
			g7.fillArc(57, 50, 7, 7, 90, 90);

			g7.drawArc(61, 50, 5, 5, 0, 90);
			g7.fillArc(61, 50, 7, 7, 0, 90);

			g7.drawRect(61, 50, 3, 3);
			g7.fillRect(61, 50, 3, 3);

			g7.drawRect(61, 54, 3, 5);
			g7.fillRect(61, 54, 3, 5);

			g7.drawArc(57, 59, 5, 5, 90, 90);
			g7.fillArc(57, 59, 7, 7, 90, 90);

			g7.drawArc(61, 59, 5, 5, 0, 90);
			g7.fillArc(61, 59, 7, 7, 0, 90);

			g7.drawRect(61, 59, 3, 3);
			g7.fillRect(61, 59, 3, 3);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawLine(63, 53, 63, 61);
			g7.drawLine(63, 41, 63, 49);

			g7.setPaint(new Color(255, 0, 0));
			g7.drawArc(37, 40, 5, 5, 90, 90);
			g7.fillArc(37, 40, 7, 7, 90, 90);

			g7.drawArc(41, 40, 5, 5, 0, 90);
			g7.fillArc(41, 40, 7, 7, 0, 90);

			g7.drawRect(41, 40, 3, 5);
			g7.fillRect(41, 40, 3, 5);

			g7.drawRect(41, 45, 3, 5);
			g7.fillRect(41, 45, 3, 5);

			g7.drawArc(37, 50, 5, 5, 90, 90);
			g7.fillArc(37, 50, 7, 7, 90, 90);

			g7.drawArc(41, 50, 5, 5, 0, 90);
			g7.fillArc(41, 50, 7, 7, 0, 90);

			g7.drawRect(41, 50, 3, 3);
			g7.fillRect(41, 50, 3, 3);

			g7.drawRect(41, 54, 3, 5);
			g7.fillRect(41, 54, 3, 5);

			g7.drawArc(37, 59, 5, 5, 90, 90);
			g7.fillArc(37, 59, 7, 7, 90, 90);

			g7.drawArc(41, 59, 5, 5, 0, 90);
			g7.fillArc(41, 59, 7, 7, 0, 90);

			g7.drawRect(41, 59, 3, 3);
			g7.fillRect(41, 59, 3, 3);

			g7.setPaint(new Color(255, 255, 255));
			g7.drawLine(43, 53, 43, 61);
			g7.drawLine(43, 41, 43, 49);
			break;

		case 9:
			Graphics2D g8 = (Graphics2D) g;
			g8.setPaint(new Color(0, 0, 255));
			g8.drawArc(47, 10, 5, 5, 90, 90);
			g8.fillArc(47, 10, 7, 7, 90, 90);

			g8.drawArc(51, 10, 5, 5, 0, 90);
			g8.fillArc(51, 10, 7, 7, 0, 90);

			g8.drawRect(51, 10, 3, 5);
			g8.fillRect(51, 10, 3, 5);

			g8.drawRect(51, 15, 3, 5);
			g8.fillRect(51, 15, 3, 5);

			g8.drawArc(47, 20, 5, 5, 90, 90);
			g8.fillArc(47, 20, 7, 7, 90, 90);

			g8.drawArc(51, 20, 5, 5, 0, 90);
			g8.fillArc(51, 20, 7, 7, 0, 90);

			g8.drawRect(51, 20, 3, 3);
			g8.fillRect(51, 20, 3, 3);

			g8.drawRect(51, 24, 3, 5);
			g8.fillRect(51, 24, 3, 5);

			g8.drawArc(47, 29, 5, 5, 90, 90);
			g8.fillArc(47, 29, 7, 7, 90, 90);

			g8.drawArc(51, 29, 5, 5, 0, 90);
			g8.fillArc(51, 29, 7, 7, 0, 90);

			g8.drawRect(51, 29, 3, 3);
			g8.fillRect(51, 29, 3, 3);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawLine(53, 23, 53, 31);
			g8.drawLine(53, 11, 53, 19);

			g8.setPaint(new Color(255, 0, 0));
			g8.drawArc(27, 10, 5, 5, 90, 90);
			g8.fillArc(27, 10, 7, 7, 90, 90);

			g8.drawArc(31, 10, 5, 5, 0, 90);
			g8.fillArc(31, 10, 7, 7, 0, 90);

			g8.drawRect(31, 10, 3, 5);
			g8.fillRect(31, 10, 3, 5);

			g8.drawRect(31, 15, 3, 5);
			g8.fillRect(31, 15, 3, 5);

			g8.drawArc(27, 20, 5, 5, 90, 90);
			g8.fillArc(27, 20, 7, 7, 90, 90);

			g8.drawArc(31, 20, 5, 5, 0, 90);
			g8.fillArc(31, 20, 7, 7, 0, 90);

			g8.drawRect(31, 20, 3, 3);
			g8.fillRect(31, 20, 3, 3);

			g8.drawRect(31, 24, 3, 5);
			g8.fillRect(31, 24, 3, 5);

			g8.drawArc(27, 29, 5, 5, 90, 90);
			g8.fillArc(27, 29, 7, 7, 90, 90);

			g8.drawArc(31, 29, 5, 5, 0, 90);
			g8.fillArc(31, 29, 7, 7, 0, 90);

			g8.drawRect(31, 29, 3, 3);
			g8.fillRect(31, 29, 3, 3);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawLine(33, 11, 33, 19);
			g8.drawLine(33, 23, 33, 31);

			g8.setPaint(new Color(0, 128, 0));
			g8.drawArc(67, 10, 5, 5, 90, 90);
			g8.fillArc(67, 10, 7, 7, 90, 90);

			g8.drawArc(71, 10, 5, 5, 0, 90);
			g8.fillArc(71, 10, 7, 7, 0, 90);

			g8.drawRect(71, 10, 3, 5);
			g8.fillRect(71, 10, 3, 5);

			g8.drawRect(71, 15, 3, 5);
			g8.fillRect(71, 15, 3, 5);

			g8.drawArc(67, 20, 5, 5, 90, 90);
			g8.fillArc(67, 20, 7, 7, 90, 90);

			g8.drawArc(71, 20, 5, 5, 0, 90);
			g8.fillArc(71, 20, 7, 7, 0, 90);

			g8.drawRect(71, 20, 3, 3);
			g8.fillRect(71, 20, 3, 3);

			g8.drawRect(71, 24, 3, 5);
			g8.fillRect(71, 24, 3, 5);

			g8.drawArc(67, 29, 5, 5, 90, 90);
			g8.fillArc(67, 29, 7, 7, 90, 90);

			g8.drawArc(71, 29, 5, 5, 0, 90);
			g8.fillArc(71, 29, 7, 7, 0, 90);

			g8.drawRect(71, 29, 3, 3);
			g8.fillRect(71, 29, 3, 3);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawLine(73, 11, 73, 19);
			g8.drawLine(73, 23, 73, 31);

			g8.setPaint(new Color(255, 0, 0));
			g8.drawArc(27, 70, 5, 5, 90, 90);
			g8.fillArc(27, 70, 7, 7, 90, 90);

			g8.drawArc(31, 70, 5, 5, 0, 90);
			g8.fillArc(31, 70, 7, 7, 0, 90);

			g8.drawRect(31, 70, 3, 5);
			g8.fillRect(31, 70, 3, 5);

			g8.drawRect(31, 75, 3, 5);
			g8.fillRect(31, 75, 3, 5);

			g8.drawArc(27, 80, 5, 5, 90, 90);
			g8.fillArc(27, 80, 7, 7, 90, 90);

			g8.drawArc(31, 80, 5, 5, 0, 90);
			g8.fillArc(31, 80, 7, 7, 0, 90);

			g8.drawRect(31, 80, 3, 3);
			g8.fillRect(31, 80, 3, 3);

			g8.drawRect(31, 84, 3, 5);
			g8.fillRect(31, 84, 3, 5);

			g8.drawArc(27, 89, 5, 5, 90, 90);
			g8.fillArc(27, 89, 7, 7, 90, 90);

			g8.drawArc(31, 89, 5, 5, 0, 90);
			g8.fillArc(31, 89, 7, 7, 0, 90);

			g8.drawRect(31, 89, 3, 3);
			g8.fillRect(31, 89, 3, 3);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawLine(33, 71, 33, 79);
			g8.drawLine(33, 83, 33, 91);

			g8.setPaint(new Color(0, 0, 255));
			g8.drawArc(47, 70, 5, 5, 90, 90);
			g8.fillArc(47, 70, 7, 7, 90, 90);

			g8.drawArc(51, 70, 5, 5, 0, 90);
			g8.fillArc(51, 70, 7, 7, 0, 90);

			g8.drawRect(51, 70, 3, 5);
			g8.fillRect(51, 70, 3, 5);

			g8.drawRect(51, 75, 3, 5);
			g8.fillRect(51, 75, 3, 5);

			g8.drawArc(47, 80, 5, 5, 90, 90);
			g8.fillArc(47, 80, 7, 7, 90, 90);

			g8.drawArc(51, 80, 5, 5, 0, 90);
			g8.fillArc(51, 80, 7, 7, 0, 90);

			g8.drawRect(51, 80, 3, 3);
			g8.fillRect(51, 80, 3, 3);

			g8.drawRect(51, 84, 3, 5);
			g8.fillRect(51, 84, 3, 5);

			g8.drawArc(47, 89, 5, 5, 90, 90);
			g8.fillArc(47, 89, 7, 7, 90, 90);

			g8.drawArc(51, 89, 5, 5, 0, 90);
			g8.fillArc(51, 89, 7, 7, 0, 90);

			g8.drawRect(51, 89, 3, 3);
			g8.fillRect(51, 89, 3, 3);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawLine(53, 71, 53, 79);
			g8.drawLine(53, 83, 53, 91);

			g8.setPaint(new Color(0, 128, 0));
			g8.drawArc(67, 70, 5, 5, 90, 90);
			g8.fillArc(67, 70, 7, 7, 90, 90);

			g8.drawArc(71, 70, 5, 5, 0, 90);
			g8.fillArc(71, 70, 7, 7, 0, 90);

			g8.drawRect(71, 70, 3, 5);
			g8.fillRect(71, 70, 3, 5);

			g8.drawRect(71, 75, 3, 5);
			g8.fillRect(71, 75, 3, 5);

			g8.drawArc(67, 80, 5, 5, 90, 90);
			g8.fillArc(67, 80, 7, 7, 90, 90);

			g8.drawArc(71, 80, 5, 5, 0, 90);
			g8.fillArc(71, 80, 7, 7, 0, 90);

			g8.drawRect(71, 80, 3, 3);
			g8.fillRect(71, 80, 3, 3);

			g8.drawRect(71, 84, 3, 5);
			g8.fillRect(71, 84, 3, 5);

			g8.drawArc(67, 89, 5, 5, 90, 90);
			g8.fillArc(67, 89, 7, 7, 90, 90);

			g8.drawArc(71, 89, 5, 5, 0, 90);
			g8.fillArc(71, 89, 7, 7, 0, 90);

			g8.drawRect(71, 89, 3, 3);
			g8.fillRect(71, 89, 3, 3);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawLine(73, 71, 73, 79);
			g8.drawLine(73, 83, 73, 91);

			g8.setPaint(new Color(0, 128, 0));
			g8.drawArc(67, 40, 5, 5, 90, 90);
			g8.fillArc(67, 40, 7, 7, 90, 90);

			g8.drawArc(71, 40, 5, 5, 0, 90);
			g8.fillArc(71, 40, 7, 7, 0, 90);

			g8.drawRect(71, 40, 3, 5);
			g8.fillRect(71, 40, 3, 5);

			g8.drawRect(71, 45, 3, 5);
			g8.fillRect(71, 45, 3, 5);

			g8.drawArc(67, 50, 5, 5, 90, 90);
			g8.fillArc(67, 50, 7, 7, 90, 90);

			g8.drawArc(71, 50, 5, 5, 0, 90);
			g8.fillArc(71, 50, 7, 7, 0, 90);

			g8.drawRect(71, 50, 3, 3);
			g8.fillRect(71, 50, 3, 3);

			g8.drawRect(71, 54, 3, 5);
			g8.fillRect(71, 54, 3, 5);

			g8.drawArc(67, 59, 5, 5, 90, 90);
			g8.fillArc(67, 59, 7, 7, 90, 90);

			g8.drawArc(71, 59, 5, 5, 0, 90);
			g8.fillArc(71, 59, 7, 7, 0, 90);

			g8.drawRect(71, 59, 3, 3);
			g8.fillRect(71, 59, 3, 3);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawLine(73, 53, 73, 61);
			g8.drawLine(73, 41, 73, 49);

			g8.setPaint(new Color(0, 0, 255));
			g8.drawArc(47, 40, 5, 5, 90, 90);
			g8.fillArc(47, 40, 7, 7, 90, 90);

			g8.drawArc(51, 40, 5, 5, 0, 90);
			g8.fillArc(51, 40, 7, 7, 0, 90);

			g8.drawRect(51, 40, 3, 5);
			g8.fillRect(51, 40, 3, 5);

			g8.drawRect(51, 45, 3, 5);
			g8.fillRect(51, 45, 3, 5);

			g8.drawArc(47, 50, 5, 5, 90, 90);
			g8.fillArc(47, 50, 7, 7, 90, 90);

			g8.drawArc(51, 50, 5, 5, 0, 90);
			g8.fillArc(51, 50, 7, 7, 0, 90);

			g8.drawRect(51, 50, 3, 3);
			g8.fillRect(51, 50, 3, 3);

			g8.drawRect(51, 54, 3, 5);
			g8.fillRect(51, 54, 3, 5);

			g8.drawArc(47, 59, 5, 5, 90, 90);
			g8.fillArc(47, 59, 7, 7, 90, 90);

			g8.drawArc(51, 59, 5, 5, 0, 90);
			g8.fillArc(51, 59, 7, 7, 0, 90);

			g8.drawRect(51, 59, 3, 3);
			g8.fillRect(51, 59, 3, 3);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawLine(53, 41, 53, 49);
			g8.drawLine(53, 53, 53, 61);

			g8.setPaint(new Color(255, 0, 0));
			g8.drawArc(27, 40, 5, 5, 90, 90);
			g8.fillArc(27, 40, 7, 7, 90, 90);

			g8.drawArc(31, 40, 5, 5, 0, 90);
			g8.fillArc(31, 40, 7, 7, 0, 90);

			g8.drawRect(31, 40, 3, 5);
			g8.fillRect(31, 40, 3, 5);

			g8.drawRect(31, 45, 3, 5);
			g8.fillRect(31, 45, 3, 5);

			g8.drawArc(27, 50, 5, 5, 90, 90);
			g8.fillArc(27, 50, 7, 7, 90, 90);

			g8.drawArc(31, 50, 5, 5, 0, 90);
			g8.fillArc(31, 50, 7, 7, 0, 90);

			g8.drawRect(31, 50, 3, 3);
			g8.fillRect(31, 50, 3, 3);

			g8.drawRect(31, 54, 3, 5);
			g8.fillRect(31, 54, 3, 5);

			g8.drawArc(27, 59, 5, 5, 90, 90);
			g8.fillArc(27, 59, 7, 7, 90, 90);

			g8.drawArc(31, 59, 5, 5, 0, 90);
			g8.fillArc(31, 59, 7, 7, 0, 90);

			g8.drawRect(31, 59, 3, 3);
			g8.fillRect(31, 59, 3, 3);

			g8.setPaint(new Color(255, 255, 255));
			g8.drawLine(33, 53, 33, 61);
			g8.drawLine(33, 41, 33, 49);
			break;
		}

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bamboo Tiles");

		frame.add(new BambooTile(1));
		frame.add(new BambooTile(3));
		frame.add(new BambooTile(4));
		frame.add(new BambooTile(5));
		frame.add(new BambooTile(6));
		frame.add(new BambooTile(7));
		frame.add(new BambooTile(8));
		frame.add(new BambooTile(9));

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
