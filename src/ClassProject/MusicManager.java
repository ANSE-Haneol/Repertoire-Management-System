package ClassProject;

import java.io.*;
import java.util.*;

import classesAndInterfaces.BaroqueRepertoire;
import classesAndInterfaces.ClassicalRepertoire;
import classesAndInterfaces.Music;
import classesAndInterfaces.RomanticRepertoire;


public class MusicManager implements Serializable {
	
	private static final long serialVersionUID = -7988122261028787086L;
	ArrayList<Music> musicList = new ArrayList<>();
	Mcomparator mComp = new Mcomparator();
	transient Scanner in;
	
	MusicManager(Scanner in) {
		this.in = in;
	}

	public void createRep() //레퍼토리를 추가한다
	{	
		System.out.println("1. Baroque");
		System.out.println("2. Classical");
		System.out.println("3. Romantic");
		System.out.print("What's the era of your repertoire?: ");
		int era = 0;
		try {
			era = in.nextInt();
			in.nextLine();
			Music m;
			if(era == 1) {
				m = new BaroqueRepertoire();
//				m.setInfo(in); musicList.add(m);
			}
			else if(era == 2) {
				m = new ClassicalRepertoire();
//				m.setInfo(in); musicList.add(m);
			}
			else if(era == 3) {
				m = new RomanticRepertoire();
//				m.setInfo(in); musicList.add(m);
			}
			
			System.out.println();
		} catch (InputMismatchException e) {
			System.out.println("Please type a number.");
			System.out.println();
			in.nextLine();
		}
		
		musicList.sort(mComp);
	}
	
	public void deleteRep()
	{
		int size = musicList.size();
		if(size <= 0) { //count가 0보다 크지 않으면
			System.out.println("There's nothing to delete."); //지울 것이 없음
			System.out.println();
		}
		else { //아니면	
			System.out.print("Which index do you want to delete?: ");
			int delIdx = 0;
			try {
				delIdx = in.nextInt();
				musicList.remove(delIdx);
			} catch (InputMismatchException e) {
				System.out.println("Please enter an index number.");
				System.out.println();
				in.nextLine();
			} catch (IndexOutOfBoundsException e) {
				System.out.println("No information in that index.");
				System.out.println();
				in.nextLine();
			}
			in.nextLine();
			
			System.out.println();
		}
	}
	
	public void addMusic(Music m)
	{
		this.musicList.add(m);
	}
	
	public void printMusic()
	{
		for(int i = 0; i < musicList.size(); i++) {
			musicList.get(i).printMusic();
		}
	}
	
	public int getSize()
	{
		return musicList.size();
	}
	
	public Music getMusic(int idx) 
	{
		return musicList.get(idx);
	}
	
	public ArrayList<Music> getList()
	{
		return this.musicList;
	}
	
	public void setList(ArrayList<Music> musicList)
	{
		this.musicList = musicList;
	}
	
	public void sortList()
	{
		this.musicList.sort(mComp);
	}
}

class Mcomparator implements Comparator<Music>, Serializable {
	private static final long serialVersionUID = -6984642319340808896L;

	public int compare(Music m1, Music m2) {
		if(m1.getComposer().compareTo(m2.getComposer()) < 0) {
			if(m1.getOrder() < m2.getOrder()) {
				return -1;
			}
			else {
				return 1;
			}
		}
		else if(m1.getComposer().compareTo(m2.getComposer()) > 0){
			if(m1.getOrder() > m2.getOrder()) {
				return 1;
			}
			else {
				return -1;
			}
		}
		
		return 0;
	}
}