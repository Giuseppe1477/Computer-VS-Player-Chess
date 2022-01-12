import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.JPanel;


public class Button extends JPanel implements MouseListener{
	
	//Color of the tile, black or white
	private Color currentColor = Color.BLACK;
	//Dimension (position) of the tile within the board
	private Dimension gridLocation;
	
	private boolean isClicked = false;
	
	
	//Button constructor, takes a default size of the button and its position
	public Button(int buttonSize, Dimension position)
	{
		this.setPreferredSize(new Dimension(buttonSize, buttonSize));
		
		//Try not to think about this one too hard.
		//The button class, since it implements mouseListener, it carries
		//a suite of methods (see below) regarding clicks.  We can add it 
		//to any component that needs a mouseListener.  This class also 
		//extends JPanel, so it can be the recipient of a mouseListener
		//*waves hands mysteriously*
		this.addMouseListener(this);
		gridLocation = position;
		
		//Sets the color to black or white depending on location
		if((gridLocation.getHeight() + gridLocation.getWidth()) % 2 == 1) currentColor = Color.WHITE;
	}
	
	
	//Any graphics things go here
	public void paintComponent(Graphics g){
		
		g.setColor(currentColor);
		g.fillRect(0, 0, this.getSize().width, this.getSize().height);
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, this.getSize().width, this.getSize().height);
		
		//This block demonstrates how to load and display an image.
		BufferedImage bPawn = null;
		BufferedImage bRook = null;
		BufferedImage bKnight = null;
		BufferedImage bBishop = null;
		BufferedImage bQueen = null;
		BufferedImage bKing = null;
		BufferedImage wPawn = null;
		BufferedImage wRook = null;
		BufferedImage wKnight = null;
		BufferedImage wBishop = null;
		BufferedImage wQueen = null;
		BufferedImage wKing = null;
		try {
			//replace WhitePawn.gif with any icon in the provided folder
			bPawn = ImageIO.read(new File("pieces/BlackPawn.gif"));
			bRook = ImageIO.read(new File("pieces/BlackRook.gif"));
			bKnight = ImageIO.read(new File("pieces/BlackKnight.gif"));
			bBishop = ImageIO.read(new File("pieces/BlackBishop.gif"));
			bQueen = ImageIO.read(new File("pieces/BlackQueen.gif"));
			bKing = ImageIO.read(new File("pieces/BlackKing.gif"));
			wPawn = ImageIO.read(new File("pieces/WhitePawn.gif"));
			wRook = ImageIO.read(new File("pieces/WhiteRook.gif"));
			wKnight = ImageIO.read(new File("pieces/WhiteKnight.gif"));
			wBishop = ImageIO.read(new File("pieces/WhiteBishop.gif"));
			wQueen = ImageIO.read(new File("pieces/WhiteQueen.gif"));
			wKing = ImageIO.read(new File("pieces/WhiteKing.gif"));
			
		} catch (IOException e) {
		}
		//And actually draw the image
		//g.drawImage(img, 0, 0, this.getSize().width, this.getSize().height, null);
	if((gridLocation.equals(new Dimension(0,0)) || gridLocation.equals(new Dimension(7,0))))
		g.drawImage(bRook, 0, 0, this.getSize().width, this.getSize().height, null);
	if((gridLocation.equals(new Dimension(1,0)) || gridLocation.equals(new Dimension(6,0))))
		g.drawImage(bKnight, 0, 0, this.getSize().width, this.getSize().height, null);
	if((gridLocation.equals(new Dimension(2,0)) || gridLocation.equals(new Dimension(5,0))))
		g.drawImage(bBishop, 0, 0, this.getSize().width, this.getSize().height, null);
	if(gridLocation.equals(new Dimension(3,0)))
		g.drawImage(bKing, 0, 0, this.getSize().width, this.getSize().height, null);
	if(gridLocation.equals(new Dimension(4,0)))
		g.drawImage(bQueen, 0, 0, this.getSize().width, this.getSize().height, null);
	if(gridLocation.getHeight() == 1)
		g.drawImage(bPawn, 0, 0, this.getSize().width, this.getSize().height, null);
	
	if((gridLocation.equals(new Dimension(0,7)) || gridLocation.equals(new Dimension(7,7))))
		g.drawImage(wRook, 0, 0, this.getSize().width, this.getSize().height, null);
	if((gridLocation.equals(new Dimension(1,7)) || gridLocation.equals(new Dimension(6,7))))
		g.drawImage(wKnight, 0, 0, this.getSize().width, this.getSize().height, null);
	if((gridLocation.equals(new Dimension(2,7)) || gridLocation.equals(new Dimension(5,7))))
		g.drawImage(wBishop, 0, 0, this.getSize().width, this.getSize().height, null);
	if(gridLocation.equals(new Dimension(3,7)))
		g.drawImage(wKing, 0, 0, this.getSize().width, this.getSize().height, null);
	if(gridLocation.equals(new Dimension(4,7)))
		g.drawImage(wQueen, 0, 0, this.getSize().width, this.getSize().height, null);
	if(gridLocation.getHeight() == 6)
		g.drawImage(wPawn, 0, 0, this.getSize().width, this.getSize().height, null);
	
	
	
	}
	
	
	//Anything having to do with mouse clicking should go here.
	//
	public void mouseClicked(MouseEvent arg0) {
		if(!isClicked) currentColor = Color.GREEN;
		else{ 
			currentColor = Color.BLACK;
			if((gridLocation.getHeight() + gridLocation.getWidth()) % 2 == 1) currentColor = Color.WHITE;
		}
		isClicked = !isClicked;
			
		this.repaint();
		System.out.println("Click at " + gridLocation.getWidth() + ", " + gridLocation.getHeight());
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
		
	}
}

