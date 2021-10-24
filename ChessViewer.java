package chess;

import java.awt.Graphics;

import javax.swing.JComponent;

public class ChessViewer extends JComponent {
	private Board b;
	private BackGround bg;
	public ChessViewer ()
	{
		b = new Board(8,8);
		initial();
		
		
	}
	private void initial() {
		for (int i = 0;i<8;i++)
		{
			for(int j = 0;j<8;j++)
			{
				bg = new BackGround((100+45*i), (100+45*j), (i%2));
				b.setBG(bg, i, j);
			}
		}
		
	}
	public void paint(Graphics h)
	{
		b.paint(h);
	}
}
