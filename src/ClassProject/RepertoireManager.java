package ClassProject;

import java.util.*;

public class RepertoireManager {
	
	static ArrayList<String> composers = new ArrayList<String>(); //�ٸ� �޼��忡�� ���� ���� ���������� ����
	static ArrayList<String> titles = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = 0;
		int count = 0; //ArrayList ���� ������ ������ ������
		
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
				addRep(); //�����丮�� �߰�
				count++;
			}
			else if(num == 2) { //2�� �Է��ߴµ�
				if(count <= 0) { //count�� 0���� ũ�� ������
					System.out.println("There's nothing to delete."); //���� ���� ����
					System.out.println();
				}
				else { //�ƴϸ�
					delRep(); //�����丮�� ����
					count--;
				}
			}
			else if(num == 3) { //3�� �Է��ߴµ�
				if(count <= 0) { //count�� 0���� ũ�� ������
					System.out.println("There's nothing to edit."); //������ ���� ����
					System.out.println();
				}
				else { //�ƴϸ�
					editRep(); //�����丮�� ����
				}
			}
			else if(num == 4) { //4�� �Է��ߴµ�
				if(count <= 0) { //count�� 0���� ũ�� ������
					System.out.println("The list is empty"); //����Ʈ�� �������
					System.out.println();
				}
				else { //�ƴϸ�
					viewRep(); //�����丮 ����� ���
				}
			}
		}
	}
	
	public static void addRep()
	{	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the composer: ");
		composers.add(in.nextLine()); //�۰�� �߰�
		System.out.print("Enter the title: ");
		titles.add(in.nextLine()); //������ �߰�
		
		System.out.println();
	}
	
	public static void delRep()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Which index do you want to delete?: ");
		int delIdx = in.nextInt(); //�ε����� �Է¹ް�
		
		composers.remove(delIdx); //�ش� �ε����� ���Ҹ� ����
		titles.remove(delIdx);
		System.out.println();
	}
	
	public static void editRep()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Which index do you want to edit?: ");
		int edIdx = in.nextInt(); //�ε����� �Է¹ް�
		composers.remove(edIdx); //�ش� �ε����� ���Ҹ� ����
		titles.remove(edIdx);
		in.nextLine(); //'\n' ���๮�ڸ� �����ֱ� ����
		
		System.out.print("Rename the composer: ");
		composers.add(edIdx, in.nextLine()); //�ش� �ε����� ���Ҹ� �ٽ� ����
		System.out.print("Rename the title: ");
		titles.add(edIdx, in.nextLine());
		
		System.out.println(); //�� ������ �ش� �ε����� ������ �����ϴ� �Ͱ� ���� ������ ��
	}
	
	public static void viewRep()
	{
		for(int i = 0; i < composers.size(); i++) { //ArrayList�� ũ�⸸ŭ �ݺ�
			System.out.println();
			System.out.println("Composer: " + composers.get(i)); //���Ҹ� ���
			System.out.println("Title: " + titles.get(i));
			System.out.println();
		}
	}
}
