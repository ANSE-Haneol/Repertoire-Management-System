package ClassProject;

public class RomanticRepertoire extends Music {
	private String era;
	
	RomanticRepertoire() {
		
	}
	
	public void setEra()
	{
		this.era = "Romantic";
	}
	
	public void setEra(String era)
	{
		this.era = era;
	}
	
	public String getEra()
	{
		return this.era;
	}
	
	public void printMusic()
	{
		System.out.println("Composer: " + getComposer());
		System.out.println("Title: " + getTitle());
		System.out.println("Genre: " + getGenre());
		System.out.println("Era: " + getEra());
		System.out.println();
	}
}
