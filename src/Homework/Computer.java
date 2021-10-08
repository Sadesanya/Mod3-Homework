package Homework;

//Homework 4
public class Computer {
	
	private String name;
	private long year;
	private double cost;
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getYear() {
		return year;
	}
	
	public void setYear(long year) {
		this.year = year;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	public static void main(String[ ] args) {
		
		Computer ComputerLife = new Computer();
		ComputerLife.setName("Sil");
		ComputerLife.setYear(1994);
		ComputerLife.setCost(499.99);
		
		System.out.println(ComputerLife.getName());
		System.out.println(ComputerLife.getYear());
		System.out.println(ComputerLife.getCost());
		
		ComputerLife.setName("Silifat");
		System.out.println(ComputerLife.getName());
		
		Computer ComputerSet = new Computer();
		
		System.out.println(ComputerSet.getName());
		
		
		ComputerSet.setName("Lisa");
		System.out.println(ComputerSet.getName());
		System.out.println(ComputerSet.toString());
		
		
		
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + ", year=" + year + ", cost=" + cost + "]";
	}
	
	//Parameterized Constructor 
	public Computer(String name, long year, double cost) {
		name = name;
		year = year;
		cost = cost;
	}
	
	//Empty Constructor
	public Computer() {
		
	}
	

}