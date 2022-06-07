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
	
	public void setComposer(String composer) //각 변수에 값을 할당해 줄 메소드들
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
	
	public String getComposer() //변수의 값을 불러올 getter 메소드들
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
