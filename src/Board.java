import java.awt.Graphics2D;

import javax.swing.JComponent;

import java.awt.Graphics;
public class Board {
   private BackGround[][] theBackGround;
   private int row, col;
   private String white, black;
   private int initialX;
   private int picHeight, picWidth;
   private BackGround bg;
   public static Piece[][] pieces;

   public Board(int row, int col){
      this.row = row;
      this.col = col;
      theBackGround = new BackGround[row][col];
      black = "image/black.PNG";
      white = "image/white.PNG";
      initialX = 45;
      picHeight = 45;
      picWidth = 45;
      pieces = new Piece[row][col];
      populateDummy();
      initializeBackGround();
   }
/**
 * print the type of pieces
 */
   public void printPiece() {
	      for(int i = 0; i < row ; i ++){
	          for(int j = 0; j < col; j++){
	    	      System.out.println(pieces[i][j].getType());
	          }
	       }
   }
/**
 * set the background with black and white
 */
public void initializeBackGround(){
      int flag = 1;
      for(int i = 0; i < row; i++){
         int x = initialX;
         for(int j = 0; j < col; j++){
            if(flag == 1){
               bg = new BackGround(white, 45+j*picWidth, 45+i*picHeight);
               theBackGround[i][j] = bg;
            }
            if(flag == -1){
               bg = new BackGround(black, 45+j*picWidth,45+i*picHeight);
               theBackGround[i][j] = bg;
            }
            flag *= -1;
         }
         flag *= -1;
      }
   }

   public void paint(Graphics2D g2){
      for(int i = 0; i <row; i++){
         for(int j = 0; j < col; j++){
            theBackGround[i][j].paint(g2);
         }
      }
   }
/**
 * fill the third row to sixth row with dummies
 */
   public void populateDummy(){
      for(int i = 2; i < row-2 ; i ++){
         for(int j = 0; j < col; j++){
            place(new Dummy(), i, j);
         }
      }
   }
/**
 * place a new piece to a position
 * @param p a piece
 * @param rowP the y coordinate of position
 * @param colP the x coordinate of position
 */
   public void place(Piece p, int rowP, int colP)
   {
      pieces[rowP][colP] = p;
      p.place(rowP, colP);
   }
}
