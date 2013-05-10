import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PictureTile extends Tile {
	private String imgName;
	private ImageIcon image;
	private String type;

	public PictureTile(String imgName) {
	
		super(imgName);
		
		this.imgName = imgName;

		setToolTipText(imgName);
		this.setType("Picture" + imgName);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		if (imgName.equals("Bamboo 1")) {
			image = createImageIcon("images/Bamboo 1.png", "fall");
			image.paintIcon(this, g2, 23, 20);
		} else if (imgName.equals("Chrysanthemum")) {
			image = createImageIcon("images/Chrysanthemum.png", "fall");
			image.paintIcon(this, g2, 23, 20);
		} else if (imgName.equals("Orchid")) {
			image = createImageIcon("images/Orchid.png", "fall");
			image.paintIcon(this, g2, 23, 20);
		} else if (imgName.equals("Plum")) {
			image = createImageIcon("images/Plum.png", "fall");
			image.paintIcon(this, g2, 23, 20);
		} else if (imgName.equals("Bamboo")) {
			image = createImageIcon("images/Bamboo.png", "fall");
			image.paintIcon(this, g2, 23, 20);
		} else if (imgName.equals("Spring")) {
			image = createImageIcon("images/Spring.png", "fall");
			image.paintIcon(this, g2, 23, 20);
		} else if (imgName.equals("Summer")) {
			image = createImageIcon("images/Summer.png", "fall");
			image.paintIcon(this, g2, 23, 20);
		} else if (imgName.equals("Fall")) {
			image = createImageIcon("images/Fall.png", "fall");
			image.paintIcon(this, g2, 23, 20);
		} else if (imgName.equals("Winter")) {
			image = createImageIcon("images/Winter.png", "fall");
			image.paintIcon(this, g2, 23, 20);
		}
	}

	/** Returns an ImageIcon, or null if the path was invalid. */

	protected ImageIcon createImageIcon(String path, String description) {

		java.net.URL imgURL = getClass().getResource(path);

		if (imgURL != null) {

			return new ImageIcon(imgURL, description);

		} else {

			System.err.println("Couldn't find file: " + path);

			return null;

		}

	}

	public static void main(String args[]) {
		JFrame frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Picture Tiles");

		frame.add(new PictureTile("Bamboo 1"));
		frame.add(new PictureTile("Chrysanthemum"));
		frame.add(new PictureTile("Orchid"));
		frame.add(new PictureTile("Plum"));
		frame.add(new PictureTile("Bamboo"));
		frame.add(new PictureTile("Spring"));
		frame.add(new PictureTile("Summer"));
		frame.add(new PictureTile("Fall"));
		frame.add(new PictureTile("Winter"));

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