 
import java.awt.Graphics2D;
import java.io.PrintStream;

public class Queen extends Piece{

	public Queen( char color){
		super(color);

	}
	
	public Queen( char color,int row, int col){
		super(color);
		this.y = row*45+45;
		this.x = col*45+45;


	}
	

	public int getType(){
		return Def.QUEEN;
	}
	@Override
	public void paint(Graphics2D g) {
		if(color == Def.BLACK)
			pp = new PiecePic(Def.IMG_QUEEN_BLACK, x, y);
		else if (color == Def.WHITE)
			pp = new PiecePic(Def.IMG_QUEEN_WHITE, x, y);
		pp.paint(g);

		
	}
}