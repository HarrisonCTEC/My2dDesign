package view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import controller.controller;

public class panel extends JPanel
{
	private controller baseController;
	private JTable table;
	private SpringLayout baseLayout;
	private JLabel titleLabel;
	
	public panel(controller baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		titleLabel = new JLabel("Welcome!");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		String [] colNames = {"Col 1", "Col 2"};
		DefaultTableModel fruitModel = new DefaultTableModel(baseController.getMyFruits(), colNames);
		table = new JTable(fruitModel);
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(table);
		this.add(titleLabel);
		this.setBackground(Color.GRAY);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
