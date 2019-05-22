package model;

public class Attendee {

	private String id;
	private String fName;
	private String lName;
	private String email;
	private String gender;
	private String country;
	private String photo;
	private String birthday;
	
	private Attendee right;
	private Attendee left;
	
	public Attendee(String id, String fName, String lName, String email, String gender, String country, String photo,
			String birthday) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.gender = gender;
		this.country = country;
		this.photo = photo;
		this.birthday = birthday;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Attendee getRight() {
		return right;
	}

	public void setRight(Attendee right) {
		this.right = right;
	}

	public Attendee getLeft() {
		return left;
	}

	public void setLeft(Attendee left) {
		this.left = left;
	}
	
}
