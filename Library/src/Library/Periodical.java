package Library;

public class Periodical extends Publication{
	private String type;
	


	Periodical()
	{
		
	}
	
	Periodical(String publicationName, String publicationDate,String type, Library libo)
	{
		super(publicationName, publicationDate);
		this.type = type;
		
		for(int i = 0; i < libo.periodicals.length; i++)
		{
			if(libo.periodicals[i] == null)
			{
				libo.periodicals[i] = this;
				return;
			}
		}
	}
	
	public String toString()
	{
		return "Periodical id: " + super.getPublicationID() + "\n" + "Periodical name: " + super.getPublicationName();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
