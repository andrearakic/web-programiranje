package beans;

import java.util.List;

public class RentACarFacility {
    private String name;
    private List<Vehicle> vehicles;
    private String openingHours;
    private boolean workingStatus;
    private Location location;
    private String logo; // image path or URL
    private double score;
    private Manager manager;
    private List<Comment> comments;

    
    public RentACarFacility() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public RentACarFacility(String name, List<Vehicle> vehicles, String openingHours, boolean workingStatus,
			Location location, String logo, double score, Manager manager, List<Comment> comments) {
		super();
		this.name = name;
		this.vehicles = vehicles;
		this.openingHours = openingHours;
		this.workingStatus = workingStatus;
		this.location = location;
		this.logo = logo;
		this.score = score;
		this.manager = manager;
		this.comments = comments;
	}


	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	public String getOpeningHours() {
		return openingHours;
	}
	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}
	public boolean isWorkingStatus() {
		return workingStatus;
	}
	public void setWorkingStatus(boolean workingStatus) {
		this.workingStatus = workingStatus;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}