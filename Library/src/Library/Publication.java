package Library;

public abstract class Publication {
	private int publicationID;
	private static int idnumber = 1;
	private String publicationName;
	private String publicationDate;
	boolean taken = false;
	
	Publication()
	{
		
	}
	
	Publication(String publicationName, String publicationDate)
	{
		publicationID = idnumber;
		idnumber++;
		this.publicationName =  publicationName;
		this.publicationDate = publicationDate;
	}


	public int getPublicationID() {
		return publicationID;
	}

	public void setPublicationID(int publicationID) {
		this.publicationID = publicationID;
	}

	public String getPublicationName() {
		return publicationName;
	}

	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	public boolean isTaken() {
		return taken;
	}

	public void setTaken(boolean taken) {
		this.taken = taken;
	}
}
