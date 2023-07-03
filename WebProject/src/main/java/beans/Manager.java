package beans;

import java.sql.Date;
import java.util.List;

public class Manager extends User {
    private RentACarFacility rentACarFacility;
    private List<Order> orders;
    private List<Customer> customers;
    
    public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public Manager(String username, String password, String name, String surname, String sex, Date dateOfBirth,
			UserRole role) {
		super(username, password, name, surname, sex, dateOfBirth, role);
		// TODO Auto-generated constructor stub
	}
	
	public Manager(RentACarFacility rentACarFacility, List<Order> orders, List<Customer> customers) {
		super();
		this.rentACarFacility = rentACarFacility;
		this.orders = orders;
		this.customers = customers;
	}
	
	// getters and setters
	public RentACarFacility getRentACarFacility() {
		return rentACarFacility;
	}
	public void setRentACarFacility(RentACarFacility rentACarFacility) {
		this.rentACarFacility = rentACarFacility;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}