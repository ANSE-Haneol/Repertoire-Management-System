package ClassProject;

import java.util.*;

public class RepertoireManager {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		RepInfo ri = new RepInfo();
		
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
			in.nextLine(); //int�� �ް� ���� ���๮��('\n')�� ���� �־� ���� string�� �޴� �� ��ŵ�� �Ǵ� ���� ����
			
			if(num == 1) { //1�� �Է��ϸ�
				ri.addRep(); //�����丮�� �߰�
			}
			else if(num == 2) { //2�� �Է��ߴµ�
				if(ri.getRepList().size() <= 0) { //count�� 0���� ũ�� ������
					System.out.println("There's nothing to delete."); //���� ���� ����
					System.out.println();
				}
				else { //�ƴϸ�
					ri.delRep(); //�����丮�� ����
				}
			}
			else if(num == 3) { //3�� �Է��ߴµ�
				if(ri.getRepList().size() <= 0) { //count�� 0���� ũ�� ������
					System.out.println("There's nothing to edit."); //������ ���� ����
					System.out.println();
				}
				else { //�ƴϸ�
					ri.editRep(); //�����丮�� ����
				}
			}
			else if(num == 4) { //4�� �Է��ߴµ�
				if(ri.getRepList().size() <= 0) { //count�� 0���� ũ�� ������
					System.out.println("The list is empty"); //����Ʈ�� �������
					System.out.println();
				}
				else { //�ƴϸ�
					ri.viewRep(); //�����丮 ����� ���
				}
			}
		}
	}
}
