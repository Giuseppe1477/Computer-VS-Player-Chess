
public class Occupado extends Tile {

	Piece onTile;
	
	Occupado(int co) 
	{
		super(co);
	}

	@Override
	public boolean isOccupied() 
	{
		return true;
	}

	@Override
	public Piece getPiece() 
	{
		return onTile;
	}
	
	

}
