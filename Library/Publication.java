package Library;

public abstract class Publication {
	int publicationNumber;
	String publicationAddress;
	String publicationDate;
	
	Publication()
	{
		
	}
	
	Publication(int publicationNumber, String publicationAddress, String publicationDate)
	{
		this.publicationNumber = publicationNumber;
		this.publicationAddress = publicationAddress;
		this.publicationDate = publicationDate;
	}

	public int getPublicationNumber() {
		return publicationNumber;
	}

	public void setPublicationNumber(int publicationNumber) {
		this.publicationNumber = publicationNumber;
	}

	public String getPublicationAddress() {
		return publicationAddress;
	}

	public void setPublicationAddress(String publicationAddress) {
		this.publicationAddress = publicationAddress;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	
}
