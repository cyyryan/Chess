//Name: Yuyang Chen
//ID: 100290697
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class ChessRunner{
   private static final int FRAME_WIDTH = 800;
	private static final int FRAME_HEIGHT = 500;
   public static void main(String[] args){
		JFrame frame = new JFrame();
		
		ChessViewer cv = new ChessViewer();
		frame.add(cv);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}