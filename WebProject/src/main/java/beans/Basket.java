package beans;

import java.util.List;

public class Basket {
    private List<Vehicle> vehicles;
    private Customer customer;
    private double price;
    
    public Basket() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public Basket(List<Vehicle> vehicles, Customer customer, double price) {
		super();
		this.vehicles = vehicles;
		this.customer = customer;
		this.price = price;
	}
	
	// getters and setters
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}