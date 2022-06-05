package src;

import java.util.HashMap;

public class FlightInformation {

	
	//calculate the shortest and the longest route from DFW to CLT
	//Origin | Destination | Time in hrs
	//DFW | ATL | 4
	//ATL | CLT | 1
	//DFW | PHX | 2
	//PHX | CLT | 6
	//DFW | OKC | 1
	//OKC | CLT | 5

	private String connectingPort;
	private int timeTaken;
	private boolean isOriginSet;
	private boolean isDestinationSet;
	
	public FlightInformation(String connectingPort, int timeTaken, boolean isOriginSet, boolean isDestinationSet) {
		super();
		this.connectingPort = connectingPort;
		this.timeTaken = timeTaken;
		this.isOriginSet = isOriginSet;
		this.isDestinationSet = isDestinationSet;
	}
	
	public String getConnectingPort() {
		return connectingPort;
	}
	public void setConnectingPort(String connectingPort) {
		this.connectingPort = connectingPort;
	}
	
	public int getTimeTaken() {
		return timeTaken;
	}
	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}
	public boolean isOriginSet() {
		return isOriginSet;
	}
	public void setOriginSet(boolean isOriginSet) {
		this.isOriginSet = isOriginSet;
	}
	public boolean isDestinationSet() {
		return isDestinationSet;
	}
	public void setDestinationSet(boolean isDestinationSet) {
		this.isDestinationSet = isDestinationSet;
	}
	


}
