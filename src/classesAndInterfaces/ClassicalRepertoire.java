package classesAndInterfaces;

import java.io.*;

public class ClassicalRepertoire extends Music implements Era, Serializable {
	private static final long serialVersionUID = 4256671604528330561L;
	private String era;
	private int order = 2;
	
	public ClassicalRepertoire() {
		this.era = "Classical";
	}
	
	ClassicalRepertoire(String era) {
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
