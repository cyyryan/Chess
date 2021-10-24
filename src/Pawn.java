
import java.awt.Graphics2D;
import java.io.PrintStream;
import javax.swing.JComponent;

public class Pawn extends Piece{

	public Pawn(char color){
		super(color);
	}
	
	public Pawn(char color,int row, int col){
		super(color);
		this.y = row*45+45;
		this.x = col*45+45;
	}
	

	public int getType(){
		return Def.PAWN;
	}
	
	public void paint(Object media){
		PrintStream out= (PrintStream) media;
		out.print(""+getColor()+"P ");
	}

	@Override
	public void paint(Graphics2D g) {
		if(color == Def.BLACK)
		pp = new PiecePic(Def.IMG_PAWN_BLACK, x, y);
	else if (color == Def.WHITE)
		pp = new PiecePic(Def.IMG_PAWN_WHITE, x, y);
		pp.paint(g);

		
	}
}

