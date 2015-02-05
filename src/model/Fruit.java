package model;

public class Fruit
{

	/*
	 * Fruit Object
	 */
	
	private String name;
	private String largestProducer;
	private double gramsOfSugar;
	
	
	public Fruit(String name, String largestProducer, double gramsOfSugar)
	{
		this.name = name;
		this.largestProducer = largestProducer;
		this.gramsOfSugar = gramsOfSugar;
	}
	
	@Override
	public String toString()
	{
		return "String!";
	}

}
