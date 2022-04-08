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
			in.nextLine(); //int를 받고 나서 개행문자('\n')이 남아 있어 다음 string을 받는 데 스킵이 되는 것을 방지
			
			if(num == 1) { //1을 입력하면
				ri.addRep(); //레퍼토리를 추가
			}
			else if(num == 2) { //2를 입력했는데
				if(ri.getRepList().size() <= 0) { //count가 0보다 크지 않으면
					System.out.println("There's nothing to delete."); //지울 것이 없음
					System.out.println();
				}
				else { //아니면
					ri.delRep(); //레퍼토리를 삭제
				}
			}
			else if(num == 3) { //3을 입력했는데
				if(ri.getRepList().size() <= 0) { //count가 0보다 크지 않으면
					System.out.println("There's nothing to edit."); //수정할 것이 없음
					System.out.println();
				}
				else { //아니면
					ri.editRep(); //레퍼토리를 수정
				}
			}
			else if(num == 4) { //4를 입력했는데
				if(ri.getRepList().size() <= 0) { //count가 0보다 크지 않으면
					System.out.println("The list is empty"); //리스트는 비어있음
					System.out.println();
				}
				else { //아니면
					ri.viewRep(); //레퍼토리 목록을 출력
				}
			}
		}
	}
}
