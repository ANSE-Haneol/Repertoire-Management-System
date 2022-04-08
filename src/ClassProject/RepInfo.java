package ClassProject;

import java.util.*;

public class RepInfo extends Music {
	private ArrayList<Music> repList = new ArrayList<Music>(); //Music 타입을 저장하는 ArrayList를 생성
	private Scanner in = new Scanner(System.in);
	
	RepInfo() {
		
	}
	
	public void addRep() //레퍼토리를 추가한다
	{	
		Music m = new Music(); //우선 객체 m을 인스턴스화 해주고
		
		System.out.print("Enter the composer: "); //값들을 입력받고
		m.setComposer(in.nextLine()); //m의 setter 메소드들에 접근하여 인스턴스 내의 값을 바꿔준다
		System.out.print("Enter the title: ");
		m.setTitle(in.nextLine());
		System.out.print("Enter the genre: ");
		m.setGenre(in.nextLine());
		
		repList.add(m); //그 값을 repList에 추가한다.
		
		System.out.println();
	}
	
	public void delRep() //레퍼토리를 삭제한다
	{	
		System.out.print("Which index do you want to delete?: ");
		int delIdx = in.nextInt(); //지우고 싶은 인덱스를 입력받은 후
		in.nextLine();
		
		repList.remove(delIdx); //ArrayList에서 해당 인덱스 내의 값을 지운다
		System.out.println();
	}
	
	public void editRep() //레퍼토리를 수정한다
	{	
		Music m = new Music(); //우선 객체 m을 인스턴스화 해주고
		
		System.out.print("Which index do you want to edit?: ");
		int edIdx = in.nextInt(); //수정하고 싶은 인덱스를 입력한다
		repList.remove(edIdx);
		in.nextLine();
		
		System.out.print("Rename the composer: "); //다시 값들을 받아
		m.setComposer(in.nextLine());
		System.out.print("Rename the title: ");
		m.setTitle(in.nextLine());
		System.out.print("Re-enter the genre: ");
		m.setGenre(in.nextLine());
		
		repList.add(edIdx, m); //수정하고 싶은 인덱스에 삽입한다.
		System.out.println();
	} //이 과정은 해당 인덱스의 값을 수정하는 것과 동일한 효과를 가진다
	
	public void viewRep() //레퍼토리 목록을 출력
	{	
		for(int i = 0; i < repList.size(); i++) { //ArrayList의 크기만큼 반복한다
			System.out.print("Composer: ");
			System.out.println(repList.get(i).getComposer()); //각 Music 타입 객체의 getter 메소드들에 접근하여 값을 불러온다
			System.out.print("Title: ");
			System.out.println(repList.get(i).getTitle());
			System.out.print("Genre: ");
			System.out.println(repList.get(i).getGenre());
			System.out.println();
		}
	}
	
	public ArrayList getRepList()
	{
		return this.repList;
	}
}
