package ClassProject;

import java.io.*;
import java.util.*;


public class MusicManager implements Serializable {
	
	private static final long serialVersionUID = -7988122261028787086L;
	ArrayList<Music> musicList = new ArrayList<>();
	Mcomparator mComp = new Mcomparator();
	transient Scanner in;
	
	MusicManager(Scanner in) {
		this.in = in;
	}

	public void createRep() //�����丮�� �߰��Ѵ�
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
				m.setInfo(in); musicList.add(m);
			}
			else if(era == 2) {
				m = new ClassicalRepertoire();
				m.setInfo(in); musicList.add(m);
			}
			else if(era == 3) {
				m = new RomanticRepertoire();
				m.setInfo(in); musicList.add(m);
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
		if(size <= 0) { //count�� 0���� ũ�� ������
			System.out.println("There's nothing to delete."); //���� ���� ����
			System.out.println();
		}
		else { //�ƴϸ�	
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
	
	public void printMusic()
	{
		for(int i = 0; i < musicList.size(); i++) {
			musicList.get(i).printMusic();
		}
	}
}

class Mcomparator implements Comparator<Music>, Serializable {
	private static final long serialVersionUID = -6984642319340808896L;

	public int compare(Music m1, Music m2) {
		if(m1.getComposer().contains(m2.getComposer())) {
			if(m1.getOrder() < m2.getOrder()) {
				return -1;
			}
			else {
				return 1;
			}
		}
		else if(m1.getComposer().contains(m2.getComposer())){
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