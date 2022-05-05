package ClassProject;

import java.util.*;

public class ManagerMain {
	public static void main(String[] args) {
		ArrayList<Music> musicList = new ArrayList<>();
		
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
			num = in.nextInt();
			in.nextLine();
			
			if(num == 1) { //1�� �Է��ϸ�
				System.out.println("1. Baroque");
				System.out.println("2. Classical");
				System.out.println("3. Romantic");
				System.out.print("What's the era of your repertoire?: ");
				int era = in.nextInt();
				
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
				musicList.sort(new EraComparator());
			}
			else if(num == 2) { //2�� �Է��ߴµ�
				int size = musicList.size();
				if(size <= 0) { //count�� 0���� ũ�� ������
					System.out.println("There's nothing to delete."); //���� ���� ����
					System.out.println();
				}
				else { //�ƴϸ�	
					System.out.print("Which index do you want to delete?: ");
					int delIdx = in.nextInt();
					in.nextLine();
					
					musicList.remove(delIdx); 
					System.out.println();
				}
			}
			else if(num == 3) { //3�� �Է��ߴµ�				
				if(musicList.size() <= 0) { //count�� 0���� ũ�� ������
					System.out.println("There's nothing to edit."); //������ ���� ����
					System.out.println();
				}
				else { //�ƴϸ�
					System.out.println("1. Baroque");
					System.out.println("2. Classical");
					System.out.println("3. Romantic");
					System.out.print("What's the era of your repertoire?: ");
					int era = in.nextInt();
					
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
					int delIdx = in.nextInt();
					in.nextLine();
					musicList.remove(delIdx);
					musicList.add(delIdx, m.createRep(m));
					
					System.out.println();
				}
			}
			else if(num == 4) { //4�� �Է��ߴµ�
				if(musicList.size() <= 0) {
					System.out.println("There's nothing to show.");
					System.out.println();
				}
				else { //�ƴϸ�
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
