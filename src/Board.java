import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class Board extends JFrame{
	
	//2D array that stores the Button components
	Button[][] buttons;
	//Default size of the button
	//Set to this value because of size of .gif images
	int buttonSize = 41;
	
	//Constructor for board
	//width and height are for the number of tiles in each dimension
	public Board(int width, int height){
		
		//Creates an intermediate panel that our small tiles attach to
		//and this panel, in turn, attaches to the JFrame (Board)
		JPanel topPanel = new JPanel(new GridLayout(width, height), true);
		topPanel.setPreferredSize(new Dimension(width*buttonSize, height*buttonSize));
		
		buttons = new Button[width][height];
		
		//Instantiate the buttons and add them to our topPanel
		setupBoard(topPanel);
		
		//Add the topPanel to the JFrame
		this.add(topPanel);
		
		//this is a crucial command that starts at the bottom of the
		//heirarchy and resizes elements to fit based on the size of 
		//their components.
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}
	
	//Just a double-for loop that makes buttons and adds them to the Board.
	public void setupBoard(JPanel currentPanel){
		for(int i = 0; i < buttons.length; i++){
			for(int j = 0; j < buttons[i].length; j++){
				Button newButton = new Button(buttonSize, new Dimension(j, i));
				buttons[j][i] = newButton;
				currentPanel.add(newButton);
			}
		}
	}
}

