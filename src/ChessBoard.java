import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
/**
 * extending the board class
 * creat and place all piece on the board
 * set titles
 * check if move is valid
 * @author cyyry
 *
 */
public class ChessBoard extends Board {
	private Piece p;
	   private int piecePosit_x, piecePosit_y;
	   private Piece piece1;
	   public static Title[] titleNums_left;
	   public static Title[] titleNums_right;
	   public static Title[] titleAlph_top;
	   public static Title[] titleAlph_bot;
	   
	public ChessBoard(){
		super(8,8);
		initial();
		setTitle();
	}
	


	public void paint(Graphics2D g2) {
		super.paint(g2);
		for(int i = 0;i<8;i++)
		{
			for (int j =0;j<8;j++)
			{
				pieces[i][j].paint(g2);			
			}
		}
		//print titles
		for(int i=0;i<8;i++)
		{
			titleNums_left[i].paint(g2);
			titleNums_right[i].paint(g2);
			titleAlph_top[i].paint(g2);
			titleAlph_bot[i].paint(g2);
		}
	}
	public void initial()
	{

		//place(new Pawn(Def.WHITE, 2, 2),2,2);
//		p = new Rook(Def.BLACK,0,0);
 		place(new Rook(Def.BLACK),0,0);
 		place(new Rook(Def.BLACK),0,7);
 		place(new Knight(Def.BLACK),0,1);
 		place(new Knight(Def.BLACK),0,6);

 		place(new Bishop(Def.BLACK),0,2);
 		place(new Bishop(Def.BLACK),0,5);

		place(new Queen(Def.BLACK),0,3);
 		place(new King(Def.BLACK),0,4);

 		for(int j=0; j<8; j++){
 			place (new Pawn(Def.BLACK),1,j);
		}
 		
 		place(new Rook(Def.WHITE),7,0);
 		place(new Rook(Def.WHITE),7,7);
 		place(new Knight(Def.WHITE),7,1);
 		place(new Knight(Def.WHITE),7,6);

 		place(new Bishop(Def.WHITE),7,2);
 		place(new Bishop(Def.WHITE),7,5);

		place(new Queen(Def.WHITE),7,3);
 		place(new King(Def.WHITE),7,4);

 		for(int j=0; j<8; j++){
 			place (new Pawn(Def.WHITE),6,j);
		}
	}
	/**to save the position info of the piece
	 * 
	 * @param x the x coordinate of the position
	 * @param y the y coordinate of the position
	 */
	   public void getPieceInfo(int x, int y)
	   {
		   this.piecePosit_y = y/45-1;
		   this.piecePosit_x = x/45-1;   	  
		   
	   }
	   /**
	    * put the title image in arrays then print
	    */
		private void setTitle() {
			titleNums_left = new Title[8];
			titleNums_right = new Title[8];
			titleAlph_top = new Title[8];
			titleAlph_bot = new Title[8];
			titleNums_left[0] = new Title(Def.titleNum8,0,1);
			titleNums_left[1] = new Title(Def.titleNum7,0,2);
			titleNums_left[2] = new Title(Def.titleNum6,0,3);
			titleNums_left[3] = new Title(Def.titleNum5,0,4);
			titleNums_left[4] = new Title(Def.titleNum4,0,5);
			titleNums_left[5] = new Title(Def.titleNum3,0,6);
			titleNums_left[6] = new Title(Def.titleNum2,0,7);
			titleNums_left[7] = new Title(Def.titleNum1,0,8);
			
			titleNums_right[0] = new Title(Def.titleNum8,9,1);
			titleNums_right[1] = new Title(Def.titleNum7,9,2);
			titleNums_right[2] = new Title(Def.titleNum6,9,3);
			titleNums_right[3] = new Title(Def.titleNum5,9,4);
			titleNums_right[4] = new Title(Def.titleNum4,9,5);
			titleNums_right[5] = new Title(Def.titleNum3,9,6);
			titleNums_right[6] = new Title(Def.titleNum2,9,7);
			titleNums_right[7] = new Title(Def.titleNum1,9,8);
			
			titleAlph_top[0] = new Title(Def.titleA,1,0);
			titleAlph_top[1] = new Title(Def.titleB,2,0);
			titleAlph_top[2] = new Title(Def.titleC,3,0);
			titleAlph_top[3] = new Title(Def.titleD,4,0);
			titleAlph_top[4] = new Title(Def.titleE,5,0);
			titleAlph_top[5] = new Title(Def.titleF,6,0);
			titleAlph_top[6] = new Title(Def.titleG,7,0);
			titleAlph_top[7] = new Title(Def.titleH,8,0);	
			
			titleAlph_bot[0] = new Title(Def.titleA,1,9);
			titleAlph_bot[1] = new Title(Def.titleB,2,9);
			titleAlph_bot[2] = new Title(Def.titleC,3,9);
			titleAlph_bot[3] = new Title(Def.titleD,4,9);
			titleAlph_bot[4] = new Title(Def.titleE,5,9);
			titleAlph_bot[5] = new Title(Def.titleF,6,9);
			titleAlph_bot[6] = new Title(Def.titleG,7,9);
			titleAlph_bot[7] = new Title(Def.titleH,8,9);	
			}
		/**
		 * move the piece to a new position
		 * @param x the x coordinate of the position
		 * @param y the y coordinate of the position
		 */
	   public void moveTo(int x, int y)
	   {
		   char color = pieces[piecePosit_y][piecePosit_x].getColor();
		   int tmp = pieces[piecePosit_y][piecePosit_x].getType();
		   {
			   if (tmp==1)
				   piece1 = new Pawn(color);
			   if (tmp==2)
				   piece1 = new Knight(color);
			   if (tmp==3)
				   piece1 = new Bishop(color);
			   if (tmp==4)
				   piece1 = new Rook(color);
			   if (tmp==5)
				   piece1 = new Queen(color);
			   if (tmp==6)
				   piece1 = new King(color);			   
		   }
		   place(piece1, y/45-1, x/45-1);
		   place(new Dummy(), piecePosit_y, piecePosit_x);
		   
	   }
	   /**
	    *  check the move if is valid
	    * @param x the x coordinate of position
	    * @param y the y coordinate of position
	    * @param turns to get the turn of players
	    * @return
	    */
	   public boolean check(int x, int y, int turns)
	   {
		   if(pieces[y/45-1][x/45-1].getType()==0)
			   return false;
		   if (y<45||y>405||x<45||x>405)
			   return false;
		   if (turns%2==0)
		   {
			   if(pieces[y/45-1][x/45-1].getColor()=='w')
				   return true;
			   else 
				   return false;
		   }
		   else if(turns%2==1)
		   {
			   if(pieces[y/45-1][x/45-1].getColor()=='b')
				   return true;		
			   else 
				   return false;
		   }
		   else
			   return true;
		   
	   }
	   /**
	    * check if the target position is a good choice
	    * @param x the x coordinate
	    * @param y the y coordiante
	    * @param turns the turn of players
	    * @return if the move can be processed return true otherwise return false
	    */
	   public boolean moveCheck(int x, int y, int turns)
	   {
		   if(pieces[y/45-1][x/45-1].getType()==0)
			   return true;
		   if (y<45||y>405||x<45||x>405)
			   return false;
		   if (turns%2==0)
		   {
			   if(pieces[y/45-1][x/45-1].getColor()!='w')
				   return true;
			   else 
				   return false;
		   }
		   else if(turns%2==1)
		   {
			   if(pieces[y/45-1][x/45-1].getColor()!='b')
				   return true;		
			   else 
				   return false;
		   }
		   else
			   return true;
		   
	   }
}

