package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tournament {

	private Attendee root;
	private Participant firstP;
	private Spectator firstS;
	
	public final static String ATTENDEES_PATH="data/attendees.txt";
	
	public Tournament() {
		loadTree(ATTENDEES_PATH);
	}
	public void loadTree(String path) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while(line != null) {
			try {
				line = br.readLine();
				String data[]=line.split(",",-1);
				add(new Attendee(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7]));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void add(Attendee a) {
	    root = add(a, Integer.parseInt(a.getId()));
	}
	public Attendee add(Attendee current, int id) {
		if (current == null) {
	        return current;
	    }
	 
	    if (id < Integer.parseInt(current.getId())) {
	        current.setLeft( add(current.getLeft(), id));
	    } else if (id > Integer.parseInt(current.getId())) {
	        current.setRight(add(current.getRight(), id));
	    } else {
	        return current;
	    }
	 
	    return current;
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
