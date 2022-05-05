package ClassProject;

public class RomanticRepertoire extends Music implements Era {
	private String era;
	private int order = 3;
	
	RomanticRepertoire() {
		this.era = "Romantic";
	}
	
	RomanticRepertoire(String era) {
		this.era = era;
	}
	
	public void setEra(String era)
	{
		this.era = era;
	}
	
	public String getEra()
	{
		return this.era;
	}
	
	public int getOrder()
	{
		return this.order;
	}
	
	public Music createRep(Music m) //�����丮�� �߰��Ѵ�
	{			
     	System.out.print("Enter the composer: "); //������ �Է¹ް�
		m.setComposer(in.nextLine()); 
		System.out.print("Enter the title: ");
		m.setTitle(in.nextLine());
		System.out.print("Enter the genre: ");
		m.setGenre(in.nextLine());
		
		System.out.println();
		
		return m;
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
