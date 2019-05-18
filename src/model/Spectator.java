package model;

public class Spectator extends Attendee {

	private Spectator next;
	private Spectator prev;
	
	public Spectator(String id, String fName, String lName, String email, String gender, String country, String photo,
			String birthday) {
		super(id, fName, lName, email, gender, country, photo, birthday);
	}

	public Spectator getNext() {
		return next;
	}

	public void setNext(Spectator next) {
		this.next = next;
	}

	public Spectator getPrev() {
		return prev;
	}

	public void setPrev(Spectator prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		return "id: "+getId()+"\n First Name: "+getfName()+"\n Last Name: "+getlName()+
				"\n Email: "+getEmail()+"\n Gender: "+getGender()+"\n Country: "+getCountry()
				+"\n Birthday: "+getBirthday();
	}
	
}
