import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class CharacterTile extends Tile {
	private Color c;
	private char cChar;
	private String uniCode;
	private String type; 
	public CharacterTile(char c) {

		super("Character" + c);
		this.setType("CharacterTile" + c); 
		cChar = c;
		setToolTipText("Character" + c); 
	}
	
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Font f = new Font("Arial Unicode MS", Font.PLAIN, 30);
		g.setFont(f);
		switch (cChar) {
		case '1':
			
			g.drawString("\u4E00", 25, 40);
			g2.setPaint(c.RED);
			g.drawString("1", 60, 40);
			g2.setPaint(c.RED);
			g.drawString("\u4EB9", 40, 80);
			break;

		case '2':

			g.drawString("\u4E8C", 25, 40);
			g2.setPaint(c.RED);
			g.drawString("2", 60, 40);
			g2.setPaint(c.RED);
			g.drawString("\u4EB9", 40, 80);
			break;

		case '3':

			g.drawString("\u4E09", 25, 40);
			g2.setPaint(c.RED);
			g.drawString("3", 60, 40);
			g2.setPaint(c.RED);
			g.drawString("\u4EB9", 40, 80);
			break;




		case '4':

			g.drawString("\u56DB", 25, 40);
			g2.setPaint(c.RED);
			g.drawString("4", 60, 40);
			g2.setPaint(c.RED);
			g.drawString("\u4EB9", 40, 80);
			break;

		case '5':

			g.drawString("\u4E94", 25, 40);
			g2.setPaint(c.RED);
			g.drawString("5", 60, 40);
			g2.setPaint(c.RED);
			g.drawString("\u4EB9", 40, 80);
			break;

		case '6':

			g.drawString("\u516D", 25, 40);
			g2.setPaint(c.RED);
			g.drawString("6", 60, 40);
			g2.setPaint(c.RED);
			g.drawString("\u4EB9", 40, 80);
			break;

		case '7':

			g.drawString("\u4E03", 25, 40);
			g2.setPaint(c.RED);
			g.drawString("7", 60, 40);
			g2.setPaint(c.RED);
			g.drawString("\u4EB9", 40, 80);
			break;

		case '8':

			g.drawString("\u516B", 25, 40);
			g2.setPaint(c.RED);
			g.drawString("8", 60, 40);
			g2.setPaint(c.RED);
			g.drawString("\u4EB9", 40, 80);
			break;

		case '9':

			g.drawString("\u4E5D", 25, 40);
			g2.setPaint(c.RED);
			g.drawString("9", 60, 40);
			g2.setPaint(c.RED);
			g.drawString("\u4EB9", 40, 80);
			break;

		case 'N':

			Font fN = new Font("Arial Unicode MS", Font.PLAIN, 60);
			g2.setPaint(c.RED);
			g.drawString("N", 60, 30);
			g2.setPaint(c.BLACK);
			g.setFont(fN);
			g.drawString("\u5317", 25, 80);
			break;

		case 'S':

			Font fS = new Font("Arial Unicode MS", Font.PLAIN, 60);
			g2.setPaint(c.RED);
			g.drawString("S", 60, 30);
			g2.setPaint(c.BLACK);
			g.setFont(fS);
			g.drawString("\u5357", 25, 80);
			break;

		case 'E':

			Font fE = new Font("Arial Unicode MS", Font.PLAIN, 60);
			g2.setPaint(c.RED);
			g.drawString("E", 60, 30);
			g2.setPaint(c.BLACK);
			g.setFont(fE);
			g.drawString("\u6771", 25, 80);
			break;




		case 'W':
			
			Font fw = new Font("Arial Unicode MS", Font.PLAIN, 60);
			g2.setPaint(c.RED);
			g.drawString("W", 58, 30);
			g2.setPaint(c.BLACK);
			g.setFont(fw);
			g.drawString("\u897F", 25, 80);
			break;

		case 'C':

			Font fr = new Font("Arial Unicode MS", Font.PLAIN, 60);
			g2.setPaint(c.RED);
			g.drawString("C", 58, 30);
			g2.setPaint(c.RED);
			g.setFont(fr);
			g.drawString("\u4E2D", 25, 80);
			
			break;

		case 'F':

			Font fg = new Font("Arial Unicode MS", Font.PLAIN, 60);
			g2.setPaint(c.RED);
			g.drawString("F", 58, 26);
			g2.setPaint(c.GREEN);
			g.setFont(fg);
			g.drawString("\u767C", 25, 80);
			break;

		default:
		}
	}
	
	public static void main(String[] args)
	{
		JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Character Tiles");
		
		frame.add(new CharacterTile('1'));
		frame.add(new CharacterTile('2'));
		frame.add(new CharacterTile('3'));
		frame.add(new CharacterTile('4'));
		frame.add(new CharacterTile('5'));
		frame.add(new CharacterTile('6'));
		frame.add(new CharacterTile('7'));
		frame.add(new CharacterTile('8'));
		frame.add(new CharacterTile('9'));
		frame.add(new CharacterTile('N'));
		frame.add(new CharacterTile('E'));
		frame.add(new CharacterTile('W'));
		frame.add(new CharacterTile('S'));
		frame.add(new CharacterTile('F'));
		frame.add(new CharacterTile('C'));

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
