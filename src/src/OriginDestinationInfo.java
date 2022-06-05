package src;

public class OriginDestinationInfo {
	
	private String originPlace;
	private String destPlace;
	private int totalTimeTaken;
	private String ConnectingPort;
	private boolean isOriginSet = false;
	private boolean isDestinationSet = false;
	
	
	public OriginDestinationInfo() {
		
		this.originPlace = "DFW";
		this.destPlace = "CLT";
	}
	
	public String getConnectingPort() {
		return ConnectingPort;
	}

	public void setConnectingPort(String connectingPort) {
		ConnectingPort = connectingPort;
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


	
	public OriginDestinationInfo(String originPlace, String destPlace) {
		super();
		this.originPlace = originPlace;
		this.destPlace = destPlace;
	}

	public String getOriginPlace() {
		return originPlace;
	}

	public void setOriginPlace(String originPlace) {
		this.originPlace = originPlace;
	}

	public String getDestPlace() {
		return destPlace;
	}

	public void setDestPlace(String destPlace) {
		this.destPlace = destPlace;
	}

	public int getTotalTimeTaken() {
		return totalTimeTaken;
	}

	public void setTotalTimeTaken(int totalTimeTaken) {
		this.totalTimeTaken = totalTimeTaken;
	}
	

}
