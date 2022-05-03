package ClassProject;

public abstract class Music {
	
	protected String composer = null;
	protected String title = null;
	protected String genre = null;
	
	Music() {
		
	}
	
	Music(String composer, String title, String genre) {
		this.composer = composer;
		this.title = title;
		this.genre = genre;
	}
	
	public void setComposer(String composer) //�� ������ ���� �Ҵ��� �� �޼ҵ��
	{
		this.composer = composer;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	
	public String getComposer() //������ ���� �ҷ��� getter �޼ҵ��
	{
		return this.composer;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getGenre()
	{
		return this.genre;
	}
	
	public void printMusic()
	{
		System.out.println("Composer: " + getComposer());
		System.out.println("Title: " + getTitle());
		System.out.println("Genre: " + getGenre());
		System.out.println();
	}
}
