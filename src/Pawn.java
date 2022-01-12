import java.util.ArrayList;

public class Pawn extends Piece {
	
	Pawn(int x, int y, boolean tema, ArrayList<Movement> moves) {
		super(x, y, tema, moves);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public ArrayList<Movement> getMoves() {
		moves.clear();
		if (team)
		{
			if (y > 0)
				moves.add(new Movement(x, y - 1));
			if (y == 7)
				moves.add(new Movement(x, y - 2));
		}
		else
		{
			if (y == 0)
				moves.add(new Movement(x, y + 2));
			if (y < 7)
				moves.add(new Movement(x, y + 1));
		}
		return moves;
	}
	
	
	
	

}
