package beans;

import java.sql.Date;

public class Administrator extends User {

	public Administrator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrator(String username, String password, String name, String surname, String sex, Date dateOfBirth,
			UserRole role) {
		super(username, password, name, surname, sex, dateOfBirth, role);
		// TODO Auto-generated constructor stub
	}
	
	
    // getters and setters
}