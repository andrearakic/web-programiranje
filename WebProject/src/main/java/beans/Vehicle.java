package beans;

public class Vehicle {
    private String brand;
    private String model;
    private double price;
    private String type;
    private String transmissionType;
    private String fuelType;
    private double consumption;
    private int doorNumber;
    private int passengerCapacity;
    private String description;
    private String image; // image path or URL
    private boolean availabilityStatus;
    private RentACarFacility rentACarFacility;
    
    
    // getters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public double getConsumption() {
		return consumption;
	}
	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public boolean isAvailabilityStatus() {
		return availabilityStatus;
	}
	public void setAvailabilityStatus(boolean availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}
	public RentACarFacility getRentACarFacility() {
		return rentACarFacility;
	}
	public void setRentACarFacility(RentACarFacility rentACarFacility) {
		this.rentACarFacility = rentACarFacility;
	}
}