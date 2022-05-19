package ClassProject;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;			

public class ManagerMain {
	public static void main(String[] args) {
		try {
			ArrayList<Music> musicList = new ArrayList<>();
			Mcomparator mComp = new Mcomparator();
			Scanner in = new Scanner(System.in);
			
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			PrintWriter file = new PrintWriter(new FileWriter("RMSlog.txt", true));
			Date dateStart = new Date();
			file.print(format.format(dateStart) + "\t");
			file.println("Process started.");
			
			int num = 0;
			
			while(num != 5) {
				System.out.println("1. Add Repertoire");
				System.out.println("2. Delete Repertoire");
				System.out.println("3. View Repertoire");
				System.out.println("4. Show menu");
				System.out.println("5. Exit");
				System.out.print("Enter a command number: ");
				try {
					num = in.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please type a number.");
					System.out.println();
				}
				in.nextLine();
				
				if(num == 1) { //1을 입력하면
					System.out.println("1. Baroque");
					System.out.println("2. Classical");
					System.out.println("3. Romantic");
					System.out.print("What's the era of your repertoire?: ");
					int era = 0;
					try {
						era = in.nextInt();
					} catch (InputMismatchException e) {
						Date dateIME = new Date();
						file.print(format.format(dateIME) + "\t");
						file.println("An exception has been occured.");
						System.out.println("Please type a number.");
						System.out.println();
						in.nextLine();
						continue;
					}
					in.nextLine();
					
					Music m;
					if(era == 1) {
						m = new BaroqueRepertoire();
					}
					else if(era == 2) {
						m = new ClassicalRepertoire();
					}
					else if(era == 3) {
						m = new RomanticRepertoire();
					}
					else {
						Date dateInv = new Date();
						file.print(format.format(dateInv) + "\t");
						file.println("An invalid code has been entered.");
						System.out.println("Invalid code.");
						System.out.println();
						continue;
					}
					
					musicList.add(m.createRep(m, format, file));
					musicList.sort(mComp);
				}
				else if(num == 2) { //2를 입력했는데
					int size = musicList.size();
					if(size <= 0) { //count가 0보다 크지 않으면
						Date dateDelFailed1 = new Date();
						file.print(format.format(dateDelFailed1) + "\t");
						file.println("Deletion failure.");
						System.out.println("There's nothing to delete."); //지울 것이 없음
						System.out.println();
					}
					else { //아니면	
						System.out.print("Which index do you want to delete?: ");
						int delIdx = 0;
						try {
							delIdx = in.nextInt();
						} catch (InputMismatchException e) {
							Date dateDelFailed2 = new Date();
							file.print(format.format(dateDelFailed2) + "\t");
							file.println("Deletion failure.");
							System.out.println("Please enter an index number.");
							System.out.println();
							in.nextLine();
							continue;
						} catch (IndexOutOfBoundsException e) {
							Date dateDelFailed3 = new Date();
							file.print(format.format(dateDelFailed3) + "\t");
							file.println("Deletion failure.");
							System.out.println("No information in that index.");
							System.out.println();
							in.nextLine();
							continue;
						}
						in.nextLine();
						
						musicList.remove(delIdx);
						Date dateDel = new Date();
						file.print(format.format(dateDel) + "\t");
						file.println("Deleted the repertoire in index #" + delIdx);
						System.out.println();
					}
				}
				else if(num == 3) { //4를 입력했는데
					if(musicList.size() <= 0) {
						Date datePrintFailed = new Date();
						file.print(format.format(datePrintFailed) + "\t");
						file.println("Data print failure.");
						System.out.println("There's nothing to show.");
						System.out.println();
					}
					else { //아니면
						Date datePrint = new Date();
						file.print(format.format(datePrint) + "\t");
						file.println("Data has been printed.");
						for(int i = 0; i < musicList.size(); i++) {
							musicList.get(i).printMusic();
						}
					}
				} else if(num == 5) {
					Date dateEnd = new Date();
					file.print(format.format(dateEnd) + "\t");
					file.println("Process finished.");
					file.close();
				}
			}
		} catch (IOException e) {
			//intentional blank
		}
	}
}

class Mcomparator implements Comparator<Music> {
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
