import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Undo extends JScrollPane {

	private JPanel[] discard = new JPanel[2];
	public Stack<Tile> undoStack = new Stack<Tile>();
	public Stack<Tile> redoStack = new Stack<Tile>();
	private int width = 99;
	private int height = 99;
	private int count = 0;
	private int row = 0;

	public Undo() {
		setPreferredSize(new Dimension(225, 400));
		setBorder(BorderFactory.createRaisedBevelBorder());
		discard[0] = new JPanel(new FlowLayout(FlowLayout.LEFT));
		discard[1] = new JPanel(new FlowLayout(FlowLayout.LEFT));

		setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBackground(Color.BLACK);
		setViewportView(panel);
		panel.add(discard[0]);
		panel.add(discard[1], BorderLayout.WEST);
		discard[0].setBackground(Color.WHITE);
		discard[1].setBackground(Color.WHITE);
	}

	public void addToRedo(Tile t) {

		redoStack.push(t);

	}

	public Tile undoMove() {

		return undoStack.pop();

	}

	public void addToUndo(Tile t, Tile z) {
		undoStack.push(t);
		undoStack.push(z);

		Dimension size = new Dimension(width, ++count * height);
		discard[0].setPreferredSize(size);
		discard[1].setPreferredSize(size);

		discard[0].add(t, 0);
		discard[1].add(z, 0);

		Rectangle r = new Rectangle(width, ++count * height);
		getViewport().scrollRectToVisible(r);
	}

}
