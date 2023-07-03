package beans;

import java.sql.Date;
import java.util.List;

public class Customer extends User {
    private List<Order> orders;
    private Basket basket;
    private int accumulatedPoints;
    private CustomerType customerType;
    
    public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public Customer(String username, String password, String name, String surname, String sex, Date dateOfBirth,
			UserRole role) {
		super(username, password, name, surname, sex, dateOfBirth, role);
		// TODO Auto-generated constructor stub
	}
	
	public Customer(List<Order> orders, Basket basket, int accumulatedPoints, CustomerType customerType) {
		super();
		this.orders = orders;
		this.basket = basket;
		this.accumulatedPoints = accumulatedPoints;
		this.customerType = customerType;
	}

	// getters and setters
	public Basket getBasket() {
		return basket;
	}
	public void setBasket(Basket basket) {
		this.basket = basket;
	}
	public CustomerType getCustomerType() {
		return customerType;
	}
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}
	public int getAccumulatedPoints() {
		return accumulatedPoints;
	}
	public void setAccumulatedPoints(int accumulatedPoints) {
		this.accumulatedPoints = accumulatedPoints;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}