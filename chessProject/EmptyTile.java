
public class EmptyTile extends Tile {

	EmptyTile(int co) 
	{
		super(co);
	}
	
	@Override
	public boolean isOccupied()
	{
		return false;
	}
	
	@Override
	public Piece getPiece()
	{
		return null;
	}

}
