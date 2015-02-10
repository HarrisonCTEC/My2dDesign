package view;

import javax.swing.JFrame;

import controller.controller;

public class frame extends JFrame
{
	private panel appPanel;
	
	public frame(controller baseController)
	{
		appPanel = new panel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(1000, 500);
		this.setContentPane(appPanel);
		this.setVisible(true);
	}
}
