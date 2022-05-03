package ClassProject;

public class BaroqueRepertoire extends Music {
	private String era;
	
	BaroqueRepertoire() {
		
	}
	
	public void setEra()
	{
		this.era = "Baroque";
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
