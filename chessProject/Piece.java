import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.util.ArrayList;

public abstract class Piece {
	
	
	protected int xPos, yPos;
	protected boolean team;  //white if true
	protected ArrayList<Movement> moves;
	
	Piece(int x, int y, boolean tema)
	{
		xPos = x;
		yPos = y;
		team = tema;
		moves = new ArrayList<Movement>();
	}
	
	public abstract ArrayList<Movement> getMoves();
	
	public int getX()
	{
		
	}
	
	public int getY()
	{
		
	}
	
	public boolean team()
	{
		
	}
	
	public void setCoordinates(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	
	/*
	protected int posx;
	protected int posy;
	protected boolean live = true;
	
	public abstract Tile checkPosition();
	
	public abstract int getx();
	
	public abstract Tile move();
	
	public abstract String toString();
	
	*/

}
