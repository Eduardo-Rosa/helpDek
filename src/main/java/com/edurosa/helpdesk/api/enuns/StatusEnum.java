package com.edurosa.helpdesk.api.enuns;

public enum StatusEnum {
	
	New,
	Assigned,
	Resolved,
	Approved,
	Disaproved,
	Closed;
	
	
	public static StatusEnum getStatus(String status) {
		switch(status) {
		case "New" : return New;
		case "Assigned": return Assigned;
		case "Approved": return Approved;
		case "Disaproved": return Disaproved;
		case "Resolved": return Resolved;
		case "Closed": return Closed;
		default: return New;
		}
	}

}
