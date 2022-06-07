package classesAndInterfaces;

import java.io.*;

public class RomanticRepertoire extends Music implements Era, Serializable {
	private static final long serialVersionUID = 690466906846436816L;
	private String era;
	private int order = 3;
	
	public RomanticRepertoire() {
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
	
	public void printMusic()
	{
		System.out.println("Composer: " + getComposer());
		System.out.println("Title: " + getTitle());
		System.out.println("Genre: " + getGenre());
		System.out.println("Era: " + getEra());
		System.out.println();
	}
}
