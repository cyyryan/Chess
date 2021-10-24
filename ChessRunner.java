package chess;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
   This program demonstrates how to install an action listener.
*/
public class ChessRunner
{  
	public static void main(String[] args)
	{  
		JFrame frame = new JFrame();
	
		ChessViewer theTester = new ChessViewer(); 
		frame.add(theTester);
     
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private static final int FRAME_WIDTH = 1000;
	private static final int FRAME_HEIGHT = 1000;
}
