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
		
		setupTable();
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
		baseLayout.putConstraint(SpringLayout.NORTH, table, 6, SpringLayout.SOUTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.WEST, table, 0, SpringLayout.WEST, titleLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, table, 300, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, table, 0, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
