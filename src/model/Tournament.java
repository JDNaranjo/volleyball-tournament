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

	public Spectator idSearchSpectator(String id) {
		Spectator current = firstS;
		while(current!=null) {
			if (current.getId().equals(id)) {
				return current;
			}else {
				current = current.getNext();
			}
		}
		return null;
	}

	public Participant idSearchParticipant(String id) {
		Participant current = firstP;
		while(current!=null) {
			if (current.getId().equals(id)) {
				return current;
			}else {
				current = current.getNext();
			}
		}
		return null;
	}
	
}
