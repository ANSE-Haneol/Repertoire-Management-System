package ClassProject;

import java.util.*;

public class RepertoireManager {
	
	static ArrayList<String> composers = new ArrayList<String>(); //다른 메서드에서 쓰기 위해 전역변수로 선언
	static ArrayList<String> titles = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = 0;
		int count = 0; //ArrayList 내의 원소의 개수를 세어줌
		
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
				addRep(); //레퍼토리를 추가
				count++;
			}
			else if(num == 2) { //2를 입력했는데
				if(count <= 0) { //count가 0보다 크지 않으면
					System.out.println("There's nothing to delete."); //지울 것이 없음
					System.out.println();
				}
				else { //아니면
					delRep(); //레퍼토리를 삭제
					count--;
				}
			}
			else if(num == 3) { //3을 입력했는데
				if(count <= 0) { //count가 0보다 크지 않으면
					System.out.println("There's nothing to edit."); //수정할 것이 없음
					System.out.println();
				}
				else { //아니면
					editRep(); //레퍼토리를 수정
				}
			}
			else if(num == 4) { //4를 입력했는데
				if(count <= 0) { //count가 0보다 크지 않으면
					System.out.println("The list is empty"); //리스트는 비어있음
					System.out.println();
				}
				else { //아니면
					viewRep(); //레퍼토리 목록을 출력
				}
			}
		}
	}
	
	public static void addRep()
	{	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the composer: ");
		composers.add(in.nextLine()); //작곡가를 추가
		System.out.print("Enter the title: ");
		titles.add(in.nextLine()); //제목을 추가
		
		System.out.println();
	}
	
	public static void delRep()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Which index do you want to delete?: ");
		int delIdx = in.nextInt(); //인덱스를 입력받고
		
		composers.remove(delIdx); //해당 인덱스의 원소를 삭제
		titles.remove(delIdx);
		System.out.println();
	}
	
	public static void editRep()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Which index do you want to edit?: ");
		int edIdx = in.nextInt(); //인덱스를 입력받고
		composers.remove(edIdx); //해당 인덱스의 원소를 삭제
		titles.remove(edIdx);
		in.nextLine(); //'\n' 개행문자를 없애주기 위함
		
		System.out.print("Rename the composer: ");
		composers.add(edIdx, in.nextLine()); //해당 인덱스에 원소를 다시 삽입
		System.out.print("Rename the title: ");
		titles.add(edIdx, in.nextLine());
		
		System.out.println(); //위 과정은 해당 인덱스의 내용을 수정하는 것과 같은 동작을 함
	}
	
	public static void viewRep()
	{
		for(int i = 0; i < composers.size(); i++) { //ArrayList의 크기만큼 반복
			System.out.println();
			System.out.println("Composer: " + composers.get(i)); //원소를 출력
			System.out.println("Title: " + titles.get(i));
			System.out.println();
		}
	}
}
