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

	
	
}
