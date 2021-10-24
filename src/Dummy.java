import java.io.PrintStream;
import java.awt.Graphics2D;
public class Dummy extends Piece{
   
   public Dummy(){
		super(Def.NO_COLOR);
	}
   
   public int getType(){
		return Def.DUMMY;
	}
   
   public char getColor(){
      return ' ';   
   }


@Override
public void paint(Graphics2D g) {
	// TODO Auto-generated method stub
	
}
public void move(int x, int y) {
	// TODO Auto-generated method stub
	this.y = y*45+45;
	this.x = x*45+45;
}
}