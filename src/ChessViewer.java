import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics; 
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * set a new chessboard and
 * add the mouse listener in the chessboard
 * @author cyyry
 *
 */
public class ChessViewer extends JComponent{
   private ChessBoard chessBoard;
   private MousePressListener m1;
   private int flag;
   private int x, y, turns, counts;
   private boolean check;
   private final String bm = "Black Moves";
   private final String wm = "White Moves";
   private Font f;

   public ChessViewer() {
	   
	   flag = 1;
	   turns = 0;
	   counts = 0;
	   m1 = new MousePressListener();		
      chessBoard = new ChessBoard();
      addMouseListener(m1);
	}
/**
 * set the font for the text
 */
   public void paint(Graphics h) {
		Graphics2D g2 = (Graphics2D)h;
		chessBoard.paint(g2);
		f = new Font(null, Font.BOLD, 34);
		g2.setColor(Color.BLUE);
		g2.setFont(f);
		if(turns%2==0)
			g2.drawString(wm, 480, 225);
		else
			g2.drawString(bm, 480, 225);
	}
	/**
	 * a mouse listener inner class
	 * @author cyyry
	 *
	 */
   class MousePressListener implements MouseListener
   {  
      public void mousePressed(MouseEvent event) { }
      public void mouseReleased(MouseEvent event) { }
      public void mouseClicked(MouseEvent event) 
      {
    	  //flag is used to distinguish the mouse function
    	  int tmp = counts;
    	  if(flag==1)  
    	  {
    		 x = event.getX();
    		 y = event.getY();
    		 check = chessBoard.check(x,y,turns);
             if(check == true)
             {
            	flag *= -1;
             	counts++;
                chessBoard.getPieceInfo(x, y);
                 System.out.println("Pressed1");
             }
             else
            	 System.out.println("Please make another choice");
    	  }
    	  if(flag==-1&&tmp==counts)
    	  {
            x = event.getX();
            y = event.getY();
            check = chessBoard.moveCheck(x,y,turns);
            if(check == true)
            {
            chessBoard.moveTo(x, y); 
            	flag *= -1;
                System.out.println("Pressed2");
                turns++;
       	  		repaint();
            }
            else
            	System.out.println("Please make another choice");
    	  }
      }
      public void mouseEntered(MouseEvent event) { }
      public void mouseExited(MouseEvent event) { }
   }   
}
