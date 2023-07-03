package beans;

import java.sql.Date;
import java.util.List;

public class Order {
    private String orderId;
    private List<Vehicle> rentedVehicles;
    private RentACarFacility rentACarFacility;
    private Date rentalDateTime;
    private int duration;
    private double price;
    private Customer customer;
    private OrderStatus status;
    
    public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public Order(String orderId, List<Vehicle> rentedVehicles, RentACarFacility rentACarFacility, Date rentalDateTime,
			int duration, double price, Customer customer, OrderStatus status) {
		super();
		this.orderId = orderId;
		this.rentedVehicles = rentedVehicles;
		this.rentACarFacility = rentACarFacility;
		this.rentalDateTime = rentalDateTime;
		this.duration = duration;
		this.price = price;
		this.customer = customer;
		this.status = status;
	}

	// getters and setters
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public List<Vehicle> getRentedVehicles() {
		return rentedVehicles;
	}
	public void setRentedVehicles(List<Vehicle> rentedVehicles) {
		this.rentedVehicles = rentedVehicles;
	}
	public RentACarFacility getRentACarFacility() {
		return rentACarFacility;
	}
	public void setRentACarFacility(RentACarFacility rentACarFacility) {
		this.rentACarFacility = rentACarFacility;
	}
	public Date getRentalDateTime() {
		return rentalDateTime;
	}
	public void setRentalDateTime(Date rentalDateTime) {
		this.rentalDateTime = rentalDateTime;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
}