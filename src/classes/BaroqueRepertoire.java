package classes;

import java.util.*;

import ClassProject.Era;

import java.text.SimpleDateFormat;
import java.io.*;

public class BaroqueRepertoire extends Music implements Era, Serializable {
	private static final long serialVersionUID = 2376020475136386207L;
	private String era;
	private int order = 1;
	
	public BaroqueRepertoire() {
		this.era = "Baroque";
	}
	
	BaroqueRepertoire(String era) {
		this.era = era;
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
