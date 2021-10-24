
import java.awt.Graphics2D;
import java.io.PrintStream;

public class Knight extends Piece{

	public Knight( char color){
		super(color);
	}
	
	public Knight( char color,int row, int col){
		super(color);
		this.y = row*45+45;
		this.x = col*45+45;

		if(color == Def.BLACK)
			pp = new PiecePic(Def.IMG_KNIGHT_BLACK, x, y);
		else if (color == Def.WHITE)
			pp = new PiecePic(Def.IMG_KNIGHT_WHITE, x, y);
	}
	

	public int getType(){
		return Def.KNIGHT;
	}
	@Override
	public void paint(Graphics2D g) {
		if(color == Def.BLACK)
			pp = new PiecePic(Def.IMG_KNIGHT_BLACK, x, y);
		else if (color == Def.WHITE)
			pp = new PiecePic(Def.IMG_KNIGHT_WHITE, x, y);
		pp.paint(g);

		
	}
}