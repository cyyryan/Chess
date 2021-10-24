 

import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JComponent;

public abstract class Piece {

	private Location location; // You need this method for Bonus part
	protected char color;
	protected int x, y;
	protected int row, col;
	protected PiecePic pp;
	public Piece(){
		location = new Location(0,0);
		this.color = Def.NO_COLOR;
	}
	
	public Piece(char color){
		location = new Location(0,0);
		this.color=color;
	}

	public void place(int row, int col){
		location.setLocation(row, col);
		this.y = row*45+45;
		this.x = col*45+45;
	}
	
	public Location getLocation(){
		return location;
	}

	public char getColor(){
		return color;
	}
	abstract public int getType();
	abstract public void paint(Graphics2D g);
}
