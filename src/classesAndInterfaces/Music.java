package classesAndInterfaces;

import java.io.*;

public abstract class Music implements Serializable {
	
	private static final long serialVersionUID = -5879039979649994252L;
	private String composer;
	private String title;
	private String genre;
	private int order;
	
	Music() {
		
	}
	
	Music(String composer, String title, String genre, int order) {
		this.composer = composer;
		this.title = title;
		this.genre = genre;
		this.order = order;
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
	
	public void setInfo(String composer, String title, String genre)
	{
		this.setComposer(composer);
		this.setTitle(title);
		this.setGenre(genre);
	}
	
	public abstract int getOrder();
	public abstract void printMusic();
}
