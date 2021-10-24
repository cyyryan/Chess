import java.io.PrintStream;
import java.awt.Graphics2D; 
public class Title{
	
	private String filename;
	private PiecePic pp;
	private int x, y;
	public Title(String name, int x, int y){
		filename = name;
		this.y = y*45;
		this.x = x*45;
		
	}
	
	public int getType(){
		return Def.BOARDER;
	}	
	
	public void paint(Graphics2D g2){
		pp = new PiecePic(filename, x, y);
		pp.paint(g2);
	}
	
   public char getColor(){// that returns the color of the piece such as BLACK
      return 0;
   }
	
}

