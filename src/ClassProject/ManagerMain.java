package ClassProject;

import java.util.*;

public class ManagerMain {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		RepertoireManager rm = new RepertoireManager();
		
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
				
				if(era == 1) { //�����丮�� �߰�
					BaroqueRepertoire br = new BaroqueRepertoire();
					br.setEra();
					rm.addRep(br); 
				}
				else if(era == 2) {
					ClassicalRepertoire cr = new ClassicalRepertoire();
					cr.setEra();
					rm.addRep(cr);
				}
				else if(era == 3) {
					RomanticRepertoire rr = new RomanticRepertoire();
					rr.setEra();
					rm.addRep(rr);
				}
				else {
					System.out.println("Invalid code.");
					System.out.println();
				}
			}
			else if(num == 2) { //2�� �Է��ߴµ�
				System.out.println("1. Baroque");
				System.out.println("2. Classical");
				System.out.println("3. Romantic");
				System.out.print("Which era of the repertoire do you want to delete?: ");
				int era = in.nextInt();
				
				int size = rm.getRepList(era).size();
				if(size <= 0) { //count�� 0���� ũ�� ������
					System.out.println("There's nothing to delete."); //���� ���� ����
					System.out.println();
				}
				else { //�ƴϸ�
					rm.delRep(era); //�����丮�� ����
				}
			}
			else if(num == 3) { //3�� �Է��ߴµ�
				System.out.println("1. Baroque");
				System.out.println("2. Classical");
				System.out.println("3. Romantic");
				System.out.print("Which era of the repertoire do you want to delete?: ");
				int era = in.nextInt();
				
				int size = rm.getRepList(era).size();
				if(size <= 0) { //count�� 0���� ũ�� ������
					System.out.println("There's nothing to edit."); //������ ���� ����
					System.out.println();
				}
				else { //�ƴϸ�
					if(era == 1) {
						BaroqueRepertoire br = new BaroqueRepertoire();
						br.setEra();
						rm.editRep(br);
					}
					else if(era == 2) {
						ClassicalRepertoire cr = new ClassicalRepertoire();
						cr.setEra();
						rm.editRep(cr);
					}
					else if(era == 3) {
						RomanticRepertoire rr = new RomanticRepertoire();
						rr.setEra();
						rm.editRep(rr);
					}
					else {
						System.out.println("Invalid Code.");
						System.out.println();
					}
				}
			}
			else if(num == 4) { //4�� �Է��ߴµ�
				int max = 0;
				for(int i = 1; i <= 3; i++) {
					if(max < rm.getRepList(i).size()) {
						max = rm.getRepList(i).size();
					}
				}
				if(max <= 0) { //���� ū ����Ʈ�� ����� 0���� ũ�� ������
					System.out.println("The list is empty"); //����Ʈ�� �������
					System.out.println();
				}
				else { //�ƴϸ�
					rm.viewRep(); //�����丮 ����� ���
				}
			}
		}
	}
}
