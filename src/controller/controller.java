package controller;

import javax.swing.JOptionPane;

import model.Fruit;
import view.frame;

public class controller
{
	private Fruit[][] myData;
	private frame appFrame;
	
	public controller()
	{
		myData = new Fruit[3][2];
		fillMyArray();
		appFrame = new frame(this);
	}
	
	private void fillMyArray()
	{
		for(int row = 0; row < myData.length; row++)
		{
			for(int col = myData[row].length-1; col >= 0; col--)
			{
				myData[row][col] = new Fruit("Pear", "China", 9.75);
			}
		}
	}
	
	public Fruit[][] getMyFruits()
	{
		return myData;
		
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Hello :)");
	}

}
