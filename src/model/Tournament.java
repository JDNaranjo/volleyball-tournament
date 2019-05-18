package model;

public class Tournament {

	private Attendee root;
	private Participant firstP;
	private Spectator firstS;
	
	public Tournament() {
		
	}

	public Attendee searchById() {
		
		
		return root;
	}
	
	public Attendee treeByCountry() {
		
		
		return root;
	}

	public Attendee getRoot() {
		return root;
	}

	public void setRoot(Attendee root) {
		this.root = root;
	}

	public Participant getFirstP() {
		return firstP;
	}

	public void setFirstP(Participant firstP) {
		this.firstP = firstP;
	}

	public Spectator getFirstS() {
		return firstS;
	}

	public void setFirstS(Spectator firstS) {
		this.firstS = firstS;
	}
	
}
