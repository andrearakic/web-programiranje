package beans;

import java.sql.Date;

public class User {
    private String username;
    private String password;
    private String name;
    private String surname;
    private String sex;
    private Date dateOfBirth;
    private UserRole role;
    
    public User() {
		super();
	}

	public User(String username, String password, String name, String surname, String sex, Date dateOfBirth,
			UserRole role) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.dateOfBirth = dateOfBirth;
		this.role = role;
		}
    
    // getters and setters
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
}