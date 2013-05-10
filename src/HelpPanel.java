import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;





/**
 * Implements scrollable panel for displaying help (or similar) information read from a resource file.
 *  Resource files may contain HTML, RTF, or text; content type is determined from the file extension
 *  (.html, .htm, .rtf, or .txt -- text is assumed for unrecognized file types).
 */

public class HelpPanel extends JScrollPane
{
	private	JTextComponent	textData;		// the help information


	/**
	 * Constructs and displays the help panel.
	 *  @param file the file containing the help or other information; can be text,
	 *  html, or rich text.
	 *  The file type is determined from the file's extension:
	 *  <ul>
	 *  <li>.html or .htm for hypter-text markup language files
	 *  <li>.rtf for rich text files
	 *  <li>.txt (or any other) for a plain text file
	 *  </ul>
	 */

	public HelpPanel(String file)
	{
		//setPreferredSize(new Dimension(500, 600));
		String lFile = file.toLowerCase();

		if (lFile.endsWith(".html") || lFile.endsWith(".htm") || lFile.endsWith(".rtf"))
			readHTML(file);
		else
			readText(file);
	}



	/**
	 * Returns the text stored in the help panel.
	 */

	public String toString()
	{
		return textData.getText();
	}



	// reads plain text files

	private void readText(String file)
	{
		try
		{	JTextArea	text = new JTextArea();
			setViewportView(text);

			text.setEditable(false);
			text.setLineWrap(true);
			text.setWrapStyleWord(true);
			text.setTabSize(4);

			InputStream		stream = HelpPanel.class.getResourceAsStream(file);
			BufferedReader		input = new BufferedReader(new InputStreamReader(stream));

			String line;
			while ((line = input.readLine()) != null)
			{
				line += "\n";
				text.append(line);
			}
			textData = text;
		}
		catch (FileNotFoundException FNF)
		{
			JOptionPane.showMessageDialog(null, "ERROR: Help file \"" + file + "\" not found",
				"File Error", JOptionPane.ERROR_MESSAGE);
		}
		catch (IOException E)
		{
			JOptionPane.showMessageDialog(null, "ERROR: Reading file: " + file,
				"File Error", JOptionPane.ERROR_MESSAGE);
		}
	}




	// reads html and rtf files

	private void readHTML(String file)
	{
		try
		{
			JEditorPane	text = new JEditorPane();

			Document doc = text.getDocument();
			setViewportView(text);
			text.setEditable(false);

			URL   url = HelpPanel.class.getResource(file);
			text.setPage(url);
			textData = text;
		}
		catch (FileNotFoundException FNF)
		{
			JOptionPane.showMessageDialog(null, "ERROR: Help file \"" + file + "\" not found",
				"File Error", JOptionPane.ERROR_MESSAGE);
		}
		catch (IOException E)
		{
			JOptionPane.showMessageDialog(null, "ERROR: Reading file: " + file,
				"File Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}

