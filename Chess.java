package chess;
public class Chess{
	public static void main(String[] args){
		ChessGame game = new ChessGame(System.out, System.in);
		game.start();
	}
}