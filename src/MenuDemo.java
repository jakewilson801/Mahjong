import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;


public class MenuDemo extends JFrame
{
	private	JPanel	color = new JPanel();
	private JLabel	label = new JLabel("Hello");

	/*private	Action	redAction = new AbstractAction("Red")
		{ public void actionPerformed(ActionEvent e)
			{ red(); }
		};*/


	public MenuDemo()
	{
		setTitle("Mah Jong");
		setSize(600, 400);
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

		addWindowListener(new WindowAdapter()
				{ public void windowClosing(WindowEvent e)
					{ exit(); }
				});

		add(color);
		color.setBackground(Color.YELLOW);
		color.add(label);

		makeMenu();

		setVisible(true);
	}


	public void exit()
	{
		if (JOptionPane.showConfirmDialog(this,
					"Do you want to end this program?", "End Program",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
			System.exit(0);
	}


	public void red()
	{
		color.setBackground(Color.RED);
	}


	public void blue()
	{
		color.setBackground(Color.BLUE);
	}


	private void makeMenu()
	{
		JMenuBar	menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu	colorMenu = new JMenu("Color");
		colorMenu.setMnemonic('C');
		menuBar.add(colorMenu);

		//JMenuItem	red = new JMenuItem(redAction);
		JMenuItem	red = new JMenuItem("Red", 'R');
		red.setToolTipText("Change the color to red");
		red.setAccelerator(KeyStroke.getKeyStroke("ctrl R"));
		colorMenu.add(red);
		red.addActionListener(new ActionListener()
				{ public void actionPerformed(ActionEvent e)
					{ red(); }
				});

		JMenuItem	blue = new JMenuItem("Blue", 'B');
		blue.setToolTipText("Change the color to blue");
		blue.setAccelerator(KeyStroke.getKeyStroke("ctrl B"));
		colorMenu.add(blue);
		blue.addActionListener(new ActionListener()
				{ public void actionPerformed(ActionEvent e)
					{ blue(); }
				});

		colorMenu.addSeparator();

		JMenuItem	exit = new JMenuItem("Exit", 'E');
		exit.setToolTipText("Exit the program");
		exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));
		colorMenu.add(exit);
		exit.addActionListener(new ActionListener()
				{ public void actionPerformed(ActionEvent e)
					{ exit(); }
				});


		ButtonGroup	group = new ButtonGroup();
		JMenu		messageMenu = new JMenu("Message");
		messageMenu.setMnemonic('M');
		menuBar.add(messageMenu);

		JRadioButtonMenuItem	helloItem = new JRadioButtonMenuItem("Hello", true);
		group.add(helloItem);
		messageMenu.add(helloItem);
		helloItem.setToolTipText("Say Hello");
		helloItem.setAccelerator(KeyStroke.getKeyStroke("ctrl H"));
		helloItem.setMnemonic('H');
		helloItem.addActionListener(new ActionListener()
				{ public void actionPerformed(ActionEvent e)
					{ label.setText("Hello"); }
				});

		JRadioButtonMenuItem	goodbyeItem = new JRadioButtonMenuItem("Goodbye");
		group.add(goodbyeItem);
		messageMenu.add(goodbyeItem);
		goodbyeItem.setToolTipText("Say Goodbye");
		goodbyeItem.setAccelerator(KeyStroke.getKeyStroke("ctrl G"));
		goodbyeItem.setMnemonic('G');
		goodbyeItem.addActionListener(new ActionListener()
				{ public void actionPerformed(ActionEvent e)
					{ label.setText("Goodbye"); }
				});
	}


	public static void main(String[] args)
	{
		new MenuDemo();
	}
}

