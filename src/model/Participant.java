package model;

public class Participant extends Attendee{

	private Participant next;
	private Participant prev;
	
	public Participant(String id, String fName, String lName, String email, String gender, String country, String photo,
			String birthday) {
		super(id, fName, lName, email, gender, country, photo, birthday);
	}

	public Participant getNext() {
		return next;
	}

	public void setNext(Participant next) {
		this.next = next;
	}

	public Participant getPrev() {
		return prev;
	}

	public void setPrev(Participant prev) {
		this.prev = prev;
	}

	
	
}
