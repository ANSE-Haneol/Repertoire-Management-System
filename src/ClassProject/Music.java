package ClassProject;

import java.util.*;

public class Music {
	
	private String composer = null;
	private String title = null;
	private String genre = null;
	
	Music() {
		
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
}
