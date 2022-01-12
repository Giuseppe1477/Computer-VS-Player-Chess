
public abstract class Tile {
	
	int coordinate;
	
	Tile(int co)
	{
		coordinate = co;
	}
	
	public abstract boolean isOccupied();
	
	public abstract Piece getPiece();
	
	

}
