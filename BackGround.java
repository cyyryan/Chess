package chess;
import java.awt.Graphics2D; 
import java.awt.Graphics; 
import javax.swing.JComponent;

public class BackGround extends JComponent{
	private MyImg img1;
	public BackGround()
	{
		
	}
	
	public BackGround(int x, int y, int turn) {
		if (turn==1)
			img1 = new MyImg(Definition.IMG_BG_BLACK, x, y );
		else 
			img1 = new MyImg(Definition.IMG_BG_WHITE, x, y);

	}

	public void paint(Graphics h) {
		Graphics2D g = (Graphics2D)h;
		
		img1.paint(g);  
		//img2.paint(g);
		//img3.paint(g);

	}
}

