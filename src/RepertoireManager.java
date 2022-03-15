import java.util.Scanner;

public class RepertoireManager {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = 0;
		
		String composer = null, title = null; //���ڿ� �ʱ�ȭ
		
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
			
			switch(num) {
				case 1: System.out.print("Enter the composer: "); //�۰�� �̸��� ���� ������ �Է¹���
						composer = in.nextLine();
						System.out.print("Enter the title of the piece: ");
						title = in.nextLine();
						System.out.println();
						break;
				case 2: composer = "\0"; //�� ���ڸ� �Ҵ��Ͽ� ������ ����
						title = "\0";
						break;
				case 3: System.out.print("Enter the composer: "); //�ٽ� �Է¹����� ������ �Ȱ���
						composer = in.nextLine();
						System.out.print("Enter the title of the piece: ");
						title = in.nextLine();
						break;
				case 4: System.out.printf("\nComposer: %s\n", composer); //����� ���� ���
						System.out.printf("Title: %s\n", title);
						System.out.println();
						break;
				default: break;
			}
		}
	}
}
