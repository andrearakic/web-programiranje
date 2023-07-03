package beans;

public class Comment {
    private Customer customer;
    private RentACarFacility rentACarFacility;
    private String commentText;
    private int score;
    
    public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public Comment(Customer customer, RentACarFacility rentACarFacility, String commentText, int score) {
		super();
		this.customer = customer;
		this.rentACarFacility = rentACarFacility;
		this.commentText = commentText;
		this.score = score;
	}

	// getters and setters
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public RentACarFacility getRentACarFacility() {
		return rentACarFacility;
	}
	public void setRentACarFacility(RentACarFacility rentACarFacility) {
		this.rentACarFacility = rentACarFacility;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}