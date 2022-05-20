package ClassProject;

import java.util.*;
import java.text.SimpleDateFormat;
import java.io.*;

public class BaroqueRepertoire extends Music implements Era, Serializable {
	private String era;
	private int order = 1;
	
	BaroqueRepertoire() {
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
	
	public Music createRep(Music m, SimpleDateFormat format, PrintWriter file) //레퍼토리를 추가한다
	{	
		Date date = new Date();
		Scanner in = new Scanner(System.in);
		
     	System.out.print("Enter the composer: "); //값들을 입력받고
		m.setComposer(in.nextLine());
		System.out.print("Enter the title: ");
		m.setTitle(in.nextLine());
		System.out.print("Enter the genre: ");
		m.setGenre(in.nextLine());
		
		file.print(format.format(date) + "\t");
		file.print("Added a Baroque rep: " + m.getTitle() + " by " + m.getComposer() + "\n");
		
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
