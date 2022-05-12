package ClassProject;

import java.util.*;			

public class ManagerMain {
	public static void main(String[] args) {
		ArrayList<Music> musicList = new ArrayList<>();
		
		EraComparator eraComp = new EraComparator();
		
		Scanner in = new Scanner(System.in);
		
		int num = 0;
		
		while(num != 6) {
			System.out.println("1. Add Repertoire");
			System.out.println("2. Delete Repertoire");
			System.out.println("3. Edit Repertoire");
			System.out.println("4. View Repertoire");
			System.out.println("5. Show menu");
			System.out.println("6. Exit");
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
					System.out.println("Invalid code.");
					System.out.println();
					continue;
				}
				
				musicList.add(m.createRep(m));
				musicList.sort(eraComp);
			}
			else if(num == 2) { //2를 입력했는데
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
					} catch (InputMismatchException e) {
						System.out.println("Please enter an index number.");
						System.out.println();
						in.nextLine();
						continue;
					}
					in.nextLine();
					
					musicList.remove(delIdx); 
					System.out.println();
				}
			}
			else if(num == 3) { //3을 입력했는데				
				if(musicList.size() <= 0) { //count가 0보다 크지 않으면
					System.out.println("There's nothing to edit."); //수정할 것이 없음
					System.out.println();
				}
				else { //아니면
					System.out.println("1. Baroque");
					System.out.println("2. Classical");
					System.out.println("3. Romantic");
					System.out.print("What's the era of your repertoire?: ");
					int era = 0;
					try {
						era = in.nextInt();
					} catch (InputMismatchException e) {
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
						System.out.println("Invalid code.");
						System.out.println();
						continue;
					}
					
					System.out.print("Which index do you want to delete?: ");
					int delIdx = 0;
					try {
						delIdx = in.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Please enter an index number.");
						System.out.println();
						in.nextLine();
						continue;
					}
					in.nextLine();
					
					System.out.println();
				}
			}
			else if(num == 4) { //4를 입력했는데
				if(musicList.size() <= 0) {
					System.out.println("There's nothing to show.");
					System.out.println();
				}
				else { //아니면
					for(int i = 0; i < musicList.size(); i++) {
						musicList.get(i).printMusic();
					}
				}
			}
		}
	}
}

class EraComparator implements Comparator<Music> {
	public int compare(Music m1, Music m2) {
		if(m1.getOrder() < m2.getOrder()) {
			return -1;
		}
		else if(m1.getOrder() > m2.getOrder()){
			return 1;
		}
		
		return 0;
	}
}
