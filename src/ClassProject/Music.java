package ClassProject;

import java.util.*;

public class Music {
	
	protected String composer = null;
	protected String title = null;
	protected String genre = null;
	protected String era = null;
	
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
	
	public void setEra()
	{
		//intentional blank, for overriding
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
	
	public String getEra()
	{
		return this.era;
	}
}
