import java.util.Scanner;

public class RepertoireManager {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = 0;
		
		String composer = null, title = null; //문자열 초기화
		
		while(num != 6) {
			System.out.println("1. Add Repertoire");
			System.out.println("2. Delete Repertoire");
			System.out.println("3. Edit Repertoire");
			System.out.println("4. View Repertoire");
			System.out.println("5. Show menu");
			System.out.println("6. Exit");
			
			System.out.print("Enter a command number: ");
			num = in.nextInt();
			in.nextLine(); //int를 받고 나서 개행문자('\n')이 남아 있어 다음 string을 받는 데 스킵이 되는 것을 방지
			
			switch(num) {
				case 1: System.out.print("Enter the composer: "); //작곡가의 이름과 곡의 제목을 입력받음
						composer = in.nextLine();
						System.out.print("Enter the title of the piece: ");
						title = in.nextLine();
						System.out.println();
						break;
				case 2: composer = "\0"; //널 문자를 할당하여 정보를 지움
						title = "\0";
						break;
				case 3: System.out.print("Enter the composer: "); //다시 입력받으면 수정과 똑같음
						composer = in.nextLine();
						System.out.print("Enter the title of the piece: ");
						title = in.nextLine();
						break;
				case 4: System.out.printf("\nComposer: %s\n", composer); //저장된 값을 출력
						System.out.printf("Title: %s\n", title);
						System.out.println();
						break;
				default: break;
			}
		}
	}
}
