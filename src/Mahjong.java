import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;


// MAKE SURE TO UPDATE THE JAR ON ICARUS

public class Mahjong extends JFrame implements MouseListener {
	public ArrayList<Tile> tiles = new ArrayList<Tile>();
	public int count = 0;
	Tile Holder[][][] = new Tile[10][12][5];
	public BorderLayout b = new BorderLayout();
	public Tile secondTileSelected = new Tile("");
	public Tile firstTileSelected = new Tile("");
	public Tile current = new Tile("");
	public Undo undo = new Undo();
	public Board myBoard;
	public Random seed = new Random();
	public boolean soundsetting = true;
	public Long seedNum;

	public Mahjong(Long t) {

		seedNum = t % 100000;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Game Number: " + seedNum);

		myBoard = new Board(b);
		add(myBoard);

		setSize(1300, 1000);
		// setExtendedState(JFrame.MAXIMIZED_BOTH);

		setVisible(true);
	}

	public Mahjong() {
		seedNum = System.currentTimeMillis() % 100000;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myBoard = new Board(b);
		add(myBoard);
		setTitle("Game Number: " + seedNum);
		setSize(1300, 1000);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}

	public class UndoPanel extends JPanel {
		public UndoPanel() {
			undo = new Undo();
			setSize(400, 400);
			undo.setLocation(900, 100);
			undo.setBackground(Color.black);
			makeMenu();
			// add(undo, new BorderLayout());
			add(undo);
		}

	}

	private void makeMenu() {
		/*
		 * GAME Play -- start a new game Restart -- restart the current game
		 * Numbered -- play a numbered (and therefore a repeatable game)
		 * Tournament* -- start a game in tournament mode SOUND On Off MOVE Undo
		 * -- click tiles or provide a control to restore the tiles to the game
		 * board Redo* HELP Operation Game Rules
		 */
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu game = new JMenu("Game");
		game.setMnemonic('C');
		menuBar.add(game);

		// JMenuItem red = new JMenuItem(redAction);
		JMenuItem play = new JMenuItem("Play", 'G');
		play.setToolTipText("Start A New Game");
		play.setAccelerator(KeyStroke.getKeyStroke("ctrl G"));
		game.add(play);
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newGame();
			}
		});
		JMenuItem restart = new JMenuItem("Restart", 'R');
		restart.setToolTipText("Restart a game.");
		restart.setAccelerator(KeyStroke.getKeyStroke("ctrl R"));
		game.add(restart);
		restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("stack: " + undo.undoStack.size());
				while (undo.undoStack.size() > 0)
					undo();
			}
		});
		JMenuItem number = new JMenuItem("Numbered", 'O');
		number.setToolTipText("Change the color to red");
		number.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
		game.add(number);
		number.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane
						.showConfirmDialog(
								Mahjong.this,
								"Would you like to choose a number for a game?(No will pick one for you)",
								"End Program", JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
					String str = JOptionPane
							.showInputDialog(
									null,
									"Enter a number of the game you want to play (leave blank for random):",
									1);
					if (str != null) {
						try {
							startGame(Long.parseLong(str));
						} catch (Exception parseException) {
							startGame(System.currentTimeMillis());
						}
					}
				} else {
					startGame(System.currentTimeMillis());
				}
			}
		});

		game.addSeparator();

		JMenuItem exit = new JMenuItem("Exit", 'E');
		exit.setToolTipText("Exit the program");
		exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));
		game.add(exit);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exit();
			}
		});

		ButtonGroup sounds = new ButtonGroup();
		JMenu sound = new JMenu("Sound");
		sound.setMnemonic('M');
		menuBar.add(sound);
		JRadioButtonMenuItem soundSelected = new JRadioButtonMenuItem("On",
				true);
		sounds.add(soundSelected);
		sound.add(soundSelected);
		soundSelected.setToolTipText("Sound");
		soundSelected.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
		soundSelected.setMnemonic('S');
		soundSelected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundsetting = true;
				System.out.println(soundsetting);
			}
		});
		JRadioButtonMenuItem soundNotSelected = new JRadioButtonMenuItem("Off",
				true);
		sounds.add(soundNotSelected);
		sound.add(soundNotSelected);
		soundNotSelected.setToolTipText("Sound");
		soundNotSelected.setAccelerator(KeyStroke.getKeyStroke("ctrl Z"));
		soundNotSelected.setMnemonic('Z');
		soundNotSelected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundsetting = false;
				say(soundsetting);
			}
		});
		ButtonGroup move = new ButtonGroup();
		JMenu movemenu = new JMenu("Move");

		menuBar.add(movemenu);
		JMenuItem undo = new JMenuItem("Undo", 'U');
		undo.setAccelerator(KeyStroke.getKeyStroke("ctrl U"));
		movemenu.add(undo);
		undo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				undo();
			}
		});
		JMenu extras = new JMenu("Extras");
		menuBar.add(extras);
		JMenuItem fire = new JMenuItem("FireWorks", 'F');
		fire.setAccelerator(KeyStroke.getKeyStroke("ctrl F"));
		extras.add(fire);
		fire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playCongrats();
			}
		});

		ButtonGroup group = new ButtonGroup();
		JMenu messageMenu = new JMenu("Help");
		messageMenu.setMnemonic('M');
		menuBar.add(messageMenu);

		JMenuItem rules = new JMenuItem("Rules");
		group.add(rules);
		messageMenu.add(rules);
		rules.setToolTipText("Rules");
		rules.setAccelerator(KeyStroke.getKeyStroke("ctrl H"));
		rules.setMnemonic('H');
		rules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HelpPanel help = new HelpPanel("Rules.rtf");
				JFrame frame = new JFrame();
				frame.add(help);
				frame.setSize(625, 500);
				frame.setVisible(true);
			}
		});

		JMenuItem operation = new JMenuItem("Operation");
		group.add(operation);
		messageMenu.add(operation);
		operation.setToolTipText("Operation");
		operation.setAccelerator(KeyStroke.getKeyStroke("ctrl W"));
		operation.setMnemonic('W');
		operation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HelpPanel help = new HelpPanel("Operations.rtf");
				JFrame frame = new JFrame();
				frame.add(help);
				frame.setSize(625, 500);
				frame.setVisible(true);
			}
		});

	}

	protected void playCongrats() {

		JFrame frame = new JFrame();
		Fireworks fw = new Fireworks();

		frame.setSize(1000, 800);
		frame.add(fw.getPanel());
		frame.setVisible(true);

		fw.setExplosions(0, 1000);
		fw.fire();

		try {
			Thread.sleep(10000);
			fw.stop();
		} catch (InterruptedException ie) {
		}
	}

	protected void newGame() {
		if (JOptionPane.showConfirmDialog(this,
				"Do you want to start a new game?", "New Game",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
			startGame(System.currentTimeMillis());
		}

	}

	protected void exit() {
		if (JOptionPane.showConfirmDialog(this,
				"Do you want to quit the game?", "End Game",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
			System.exit(0);

	}

	public void undo() {
		if (undo.undoStack.size() > 0) {
			undoLastMove(undo.undoMove());
			undoLastMove(undo.undoMove());
		}
	}

	public void redoLastMove() {
		Tile temp2 = undo.undoMove();
	}

	public void undoLastMove(Tile tx) {

		tx.setLocation(tx.xx, tx.yy);
		Holder[tx.x][tx.y][tx.z] = tx;
		tx.addMouseListener(this);
		this.add(tx, tx.zOrder);
		undo.addToRedo(tx);
		undo.validate();

	}

	public void startGame(Long time) {
		seedNum = time;
		this.dispose();
		new Mahjong(seedNum);
	}

	public class Board extends JPanel {
		public Board(BorderLayout b) {
			seed.setSeed(seedNum);
			fill();
			Collections.shuffle(tiles, seed);
			setLayout(b);
			add(new UndoPanel(), BorderLayout.EAST);
			drawBoard();

		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Image image = new ImageIcon(this.getClass().getResource(
					"dragon_bg.png")).getImage();
			g.drawImage(image, 250, 100, this);
		}

		public void fill() {

			for (int i = 0; i < 4; i++) {
				tiles.add(new CharacterTile('1'));
				tiles.add(new CharacterTile('2'));
				tiles.add(new CharacterTile('3'));
				tiles.add(new CharacterTile('4'));
				tiles.add(new CharacterTile('5'));
				tiles.add(new CharacterTile('6'));
				tiles.add(new CharacterTile('7'));
				tiles.add(new CharacterTile('8'));
				tiles.add(new CharacterTile('9'));
				tiles.add(new CircleTile(1));
				tiles.add(new CircleTile(2));
				tiles.add(new CircleTile(3));
				tiles.add(new CircleTile(4));
				tiles.add(new CircleTile(5));
				tiles.add(new CircleTile(6));
				tiles.add(new CircleTile(7));
				tiles.add(new CircleTile(8));
				tiles.add(new CircleTile(9));
				tiles.add(new BambooTile(2));
				tiles.add(new BambooTile(3));
				tiles.add(new BambooTile(4));
				tiles.add(new BambooTile(5));
				tiles.add(new BambooTile(6));
				tiles.add(new BambooTile(7));
				tiles.add(new BambooTile(8));
				tiles.add(new BambooTile(9));
				tiles.add(new CharacterTile('N'));
				tiles.add(new CharacterTile('S'));
				tiles.add(new CharacterTile('E'));
				tiles.add(new CharacterTile('W'));
				tiles.add(new CharacterTile('C'));
				tiles.add(new CharacterTile('F'));
				tiles.add(new WhiteDragonTile());
				tiles.add(new PictureTile("Bamboo 1"));
			}

			tiles.add(new PictureTile("Bamboo"));
			tiles.add(new PictureTile("Chrysanthemum"));

			tiles.add(new PictureTile("Orchid"));
			tiles.add(new PictureTile("Plum"));

			tiles.add(new PictureTile("Fall"));
			tiles.add(new PictureTile("Spring"));

			tiles.add(new PictureTile("Summer"));
			tiles.add(new PictureTile("Winter"));

		}

	}

	public void drawBoard() {

		for (int z = 0; z < 4; z++) {
			for (int y = 0; y < 10; y++) {
				for (int x = 0; x < 12; x++) {
					Holder[y][x][z] = null;

				}

			}
		}
		// special case
		Holder[3][0][0] = tiles.get(count);
		Holder[3][0][0].setLocation(525, 275);
		Holder[3][0][0].addMouseListener(this);
		Holder[3][0][0].xx = 525;
		Holder[3][0][0].yy = 275;
		Holder[3][0][0].x = 3;
		Holder[3][0][0].y = 0;
		Holder[3][0][0].z = 0;

		count++;
		this.add(Holder[3][0][0]);

		int l1x = 471;
		int l1y = 440;
		for (int h = 3; h < 5; h++) {
			l1y -= 100;
			for (int k = 5; k < 7; k++) {
				Holder[h][k][1] = tiles.get(count);
				Holder[h][k][1].setLocation(l1x, l1y);
				Holder[h][k][1].addMouseListener(this);
				Holder[h][k][1].xx = l1x;
				Holder[h][k][1].yy = l1y;
				Holder[h][k][1].x = h;
				Holder[h][k][1].y = k;
				Holder[h][k][1].z = 1;
				// add(t[h][k][1]);
				this.add(Holder[h][k][1]);
				l1x += 65;
				count++;
			}
			l1x = 471;
		}
		int l2x = 386;
		int l2y = 560;
		for (int h = 2; h < 6; h++) {
			l2y -= 100;
			for (int k = 4; k < 8; k++) {
				Holder[h][k][2] = tiles.get(count);
				Holder[h][k][2].setLocation(l2x, l2y);
				Holder[h][k][2].addMouseListener(this);
				this.add(Holder[h][k][2]);
				// add(t[k][h][2]);
				Holder[h][k][2].xx = l2x;
				Holder[h][k][2].yy = l2y;
				Holder[h][k][2].x = h;
				Holder[h][k][2].y = k;
				Holder[h][k][2].z = 2;
				l2x += 65;
				count++;
			}
			l2x = 386;
		}

		int l3x = 301;
		int l3y = 680;
		for (int h = 1; h < 7; h++) {
			l3y -= 100;
			for (int k = 3; k < 9; k++) {
				Holder[h][k][3] = tiles.get(count);
				Holder[h][k][3].setLocation(l3x, l3y);
				Holder[h][k][3].addMouseListener(this);
				this.add(Holder[h][k][3]);
				Holder[h][k][3].xx = l3x;
				Holder[h][k][3].yy = l3y;
				Holder[h][k][3].x = h;
				Holder[h][k][3].y = k;
				Holder[h][k][3].z = 3;
				l3x += 65;
				count++;
			}
			l3x = 301;
		}
		// special cases
		Holder[0][0][0] = tiles.get(count);
		Holder[0][0][0].setLocation(19, 350);
		Holder[0][0][0].addMouseListener(this);
		Holder[0][0][0].xx = 19;
		Holder[0][0][0].yy = 350;
		Holder[0][0][0].x = 0;
		Holder[0][0][0].y = 0;
		Holder[0][0][0].z = 0;
		count++;
		this.add(Holder[0][0][0]);

		int l4x = 85;
		int l4y = 800;
		for (int i = 0; i < 8; i++) {
			l4y -= 100;
			if (i == 0)
				i = 0;
			if (i == 1 || i == 6)
				l4x += 130;
			if (i == 2 || i == 5)
				l4x += 65;
			for (int j = 0; j < 12; j++) {

				if ((i == 1 && j == 0) || (i == 2 && j == 0)
						|| (i == 5 && j == 0) || (i == 6 && j == 0) ||

						(i == 1 && j == 1) || (i == 6 && j == 1) ||

						(i == 1 && j == 10) || (i == 6 && j == 10) ||

						(i == 1 && j == 11) || (i == 2 && j == 11)
						|| (i == 5 && j == 11) || (i == 6 && j == 11)) {
					Holder[i][j][4] = null;
				} else {

					Holder[i][j][4] = tiles.get(count);
					Holder[i][j][4].setLocation(l4x, l4y);
					Holder[i][j][4].addMouseListener(this);
					Holder[i][j][4].xx = l4x;
					Holder[i][j][4].yy = l4y;
					Holder[i][j][4].x = i;
					Holder[i][j][4].y = j;
					Holder[i][j][4].z = 4;
					count++;

					l4x += 65;
					this.add(Holder[i][j][4]);

				}

			}
			l4x = 85;
		}
		// Special cases
		Holder[1][0][0] = tiles.get(count);
		Holder[1][0][0].setLocation(867, 350);
		Holder[1][0][0].addMouseListener(this);
		Holder[1][0][0].xx = 867;
		Holder[1][0][0].yy = 350;
		Holder[1][0][0].x = 1;
		Holder[1][0][0].y = 0;
		Holder[1][0][0].z = 0;
		count++;
		this.add(Holder[1][0][0]);

		Holder[2][0][0] = tiles.get(count);
		Holder[2][0][0].setLocation(932, 350);
		Holder[2][0][0].addMouseListener(this);
		Holder[2][0][0].xx = 932;
		Holder[2][0][0].yy = 350;
		Holder[2][0][0].x = 2;
		Holder[2][0][0].y = 0;
		Holder[2][0][0].z = 0;
		count++;
		this.add(Holder[2][0][0]);

		System.out.println(count);
	}

	public static void main(String[] args) {
		new Mahjong();

	}

	@Override
	public void mousePressed(MouseEvent e) {
		Tile temp = (Tile) e.getSource();
		System.out.println("x: " + temp.x + "y: " + temp.y + "z: " + temp.z);
		if (isFree(temp) && firstTileSelected == null) {
			firstTileSelected = temp;
			select(firstTileSelected);
			return;
		} else if (temp == firstTileSelected) {
			secondTileSelected = null;
			return;
		} else
			secondTileSelected = temp;

		if ((isFree(secondTileSelected))
				&& secondTileSelected.type.equals(firstTileSelected.type)) {
			unSelect(firstTileSelected);
			PlayClip removeSound = new PlayClip("stone-scraping.wav");
			if (soundsetting)
				removeSound.play();

			firstTileSelected.zOrder = firstTileSelected.getParent()
					.getComponentZOrder(firstTileSelected);
			this.remove(firstTileSelected);
			secondTileSelected.zOrder = secondTileSelected.getParent()
					.getComponentZOrder(secondTileSelected);

			this.remove(secondTileSelected);
			undo.addToUndo(firstTileSelected, secondTileSelected);
			if (undo.undoStack.size() == 144)
				playCongrats();
			firstTileSelected.removeMouseListener(this);
			secondTileSelected.removeMouseListener(this);

			Holder[firstTileSelected.x][firstTileSelected.y][firstTileSelected.z] = null;
			Holder[secondTileSelected.x][secondTileSelected.y][secondTileSelected.z] = null;

			firstTileSelected = null;
			secondTileSelected = null;
			undo.validate();
		} else if (isFree(secondTileSelected)) {
			unSelect(firstTileSelected);
			firstTileSelected = secondTileSelected;
			secondTileSelected = null;
			select(firstTileSelected);
			return;
		}
	}

	public boolean isFree(Tile tile) {
		if ((tile.x == 7 && tile.y == 0 && tile.z == 4)) {
			return true;
		}
		if ((tile.x == 7 && tile.y == 11 && tile.z == 4)) {
			return true;
		}
		if ((tile.x == 0 && tile.y == 2 && tile.z == 0)) {
			return true;
		}
		if ((tile.x == 0 && tile.y == 1 && tile.z == 0)) {
		}
		if (tile.x == 4 && tile.y == 11 && tile.z == 4) {
			if (Holder[1][0][0] == null)
				return true;
			else
				return false;
		}
		if (tile.x == 3 && tile.y == 11 && tile.z == 4) {
			if (Holder[1][0][0] == null)
				return true;
			else
				return false;
		}
		if (tile.x == 0 && tile.y == 11 && tile.z == 4) {
			return true;
		}
		if (tile.x == 0 && tile.y == 0 && tile.z == 4) {
			return true;
		}
		if (tile.x == 1 && tile.y == 0 && tile.z == 0) {
			if (Holder[2][0][0] == null)
				return true;
			else
				return false;

		}
		if (tile.x == 3 && tile.y == 5 && tile.z == 1) {
			if (Holder[3][0][0] == null)
				return true;
			else
				return false;

		}
		if (tile.x == 3 && tile.y == 6 && tile.z == 1) {
			if (Holder[3][0][0] == null)
				return true;
			else
				return false;

		}
		if (tile.x == 4 && tile.y == 6 && tile.z == 1) {
			if (Holder[3][0][0] == null)
				return true;
			else
				return false;

		}
		if (tile.x == 4 && tile.y == 5 && tile.z == 1) {
			if (Holder[3][0][0] == null)
				return true;
			else
				return false;

		}
		if (tile.x == 2 && tile.y == 0 && tile.z == 0) {
			return true;
		}
		if (tile.x == 0 && tile.y == 0 && tile.z == 0) {
			return true;
		}
		if (tile.x == 3 && tile.y == 0 && tile.z == 4) {
			if (Holder[0][0][0] == null)
				return true;
			else
				return false;
		}
		if (tile.x == 4 && tile.y == 0 && tile.z == 4) {
			if (Holder[0][0][0] == null)
				return true;
			else
				return false;

		}
		if (tile.x == 3 && tile.y == 0 && tile.z == 0) {

			return true;

		}

		if (Holder[tile.x][tile.y - 1][tile.z] == null
				&& Holder[tile.x][tile.y][tile.z - 1] == null)
			return true;

		if (Holder[tile.x][tile.y + 1][tile.z] == null
				&& Holder[tile.x][tile.y][tile.z - 1] == null)
			return true;
		else
			return false;

	}

	public void unSelect(Tile ts) {
		ts.c = new Color(198, 226, 255);
		Holder[ts.x][ts.y][ts.z] = ts;
		repaint();

	}

	public void select(Tile ts) {

		ts.c = new Color(255, 255, 255);
		Holder[ts.x][ts.y][ts.z] = ts;
		repaint();
	}

	private void say(Object o) {
		System.out.println(o.toString());

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent arg0) {

	}
}
