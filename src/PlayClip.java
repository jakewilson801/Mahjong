import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Port;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;


/**
 * Plays a short sound clip and terminates.  The sound clip file (wav or au) must be located in the
 * same directory or in a directory below the directory containing PlayClip.class.  This restriction
 * allows play clip to read clips from a jar file.
 */


public class PlayClip implements LineListener
{
	private	Clip	clip = null;		// the sound clip



	/**
	 * Constructs an object that can play the sound clip stored in file <code>name</code>.
	 * This is a convenience method that is the same as calling <code>PlayClip(name, false)</code>.
	 * @param name The sound clip file.
	 */

	public PlayClip(String name)
	{
		this(name, false);
	}



	/**
	 * Constructs an object that can play the sound clip stored in file <code>name</code>.
	 * @param name The sound clip file.
	 * @param showErrors If true, show any errors that occur while trying to open the sound clip;
	 * otherwise, do not shou the errors.
	 */

	public PlayClip(String name, boolean showErrors)
	{
		URL	url = PlayClip.class.getResource(name);

		if (AudioSystem.isLineSupported(Port.Info.SPEAKER))
		{
			try
			{
				AudioInputStream	stream = AudioSystem.getAudioInputStream(url);
				clip = AudioSystem.getClip();
				clip.addLineListener(this);
				clip.open(stream);
			}
			catch (LineUnavailableException lue)
			{
				if (showErrors)
					JOptionPane.showMessageDialog(null,
							"Speaker is unavailable for playback",
							"Sound Clip Error",
							JOptionPane.ERROR_MESSAGE);
			}
			catch (UnsupportedAudioFileException uafe)
			{
				if (showErrors)
					JOptionPane.showMessageDialog(null,
							"Sound clip file type is not supported",
							"Sound Clip Error",
							JOptionPane.ERROR_MESSAGE);
			}
			catch (IOException ioe)
			{
				if (showErrors)
					JOptionPane.showMessageDialog(null,
							"File I/O error: " + ioe,
							"Sound Clip Error",
							JOptionPane.ERROR_MESSAGE);
			}
		}
	}



	/**
	 * Starts clip playback.
	 */

	public void play()
	{
		clip.start();
	}



	/**
	 * Indicates if the clip can or cannot be played.
	 * @return true if the clip can be played or false if it cannot be played.
	 */

	public boolean canPlay()
	{
		return clip != null && clip.isOpen();
	}



	/**
	 * Detects when the sound clip completes and deallocates resources.
	 * This method is required by the LineListener interface and is called when the state of
	 * the sound clip changes.
	 * @param event an object encapsulating event details.
	 */

	public void update(LineEvent event)
	{
		if (event.getType() == LineEvent.Type.STOP)
			event.getLine().close();
	}



	/**
	 * Class test and validation.
	 */

	public static void main(String[] args)
	{
		try
		{
			PlayClip clip = new PlayClip("explosion.wav");
			clip.play();
			//new PlayClip("explosion.wav").play();
			//new PlayClip("audio/stone-scraping.wav").play();

			Thread.sleep(2000);
		}
		catch (InterruptedException ie) {}
	}
}

