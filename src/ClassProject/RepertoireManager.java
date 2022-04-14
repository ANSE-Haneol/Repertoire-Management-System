package ClassProject;

import java.util.*;

public class RepertoireManager {
	private ArrayList<RepStatus> repList = new ArrayList<RepStatus>(); //RepStatus 타입을 저장하는 ArrayList를 생성
	
	private Scanner in = new Scanner(System.in);
	
	RepertoireManager() {
		
	}
	
	public void addRep() //레퍼토리를 추가한다
	{	
		RepStatus rs = new RepStatus(); //우선 객체 rs를 인스턴스화 해주고
		
		System.out.print("Enter the composer: "); //값들을 입력받고
		rs.setComposer(in.nextLine()); //rs의 setter 메소드들에 접근하여 객체 내의 값을 바꿔준다
		System.out.print("Enter the title: ");
		rs.setTitle(in.nextLine());
		System.out.print("Enter the genre: ");
		rs.setGenre(in.nextLine());
		System.out.print("Enter current performability: ");
		rs.setPeformability(in.nextLine());
		System.out.print("Have you ever performed it? ");
		rs.setPerformed(in.nextLine());
		
		repList.add(rs); //그 객체를 repList에 추가한다.
		
		System.out.println();
	}
	
	public void delRep() //레퍼토리를 삭제한다
	{	
		System.out.print("Which index do you want to delete?: ");
		int delIdx = in.nextInt(); //지우고 싶은 인덱스를 입력받은 후
		in.nextLine();
		
		repList.remove(delIdx); //ArrayList에서 해당 인덱스의 객체를 지운다
		System.out.println();
	}
	
	public void editRep() //레퍼토리를 수정한다
	{	
		RepStatus rs = new RepStatus(); //우선 객체 rs를 인스턴스화 해주고
		
		System.out.print("Which index do you want to edit?: ");
		int edIdx = in.nextInt(); //수정하고 싶은 인덱스를 입력한다
		repList.remove(edIdx);
		in.nextLine();
		
		System.out.print("Rename the composer: "); //다시 값들을 받아
		rs.setComposer(in.nextLine());
		System.out.print("Rename the title: ");
		rs.setTitle(in.nextLine());
		System.out.print("Re-enter the genre: ");
		rs.setGenre(in.nextLine());
		System.out.print("Re-enter current performability: ");
		rs.setPeformability(in.nextLine());
		System.out.print("Have you ever performed it? ");
		rs.setPerformed(in.nextLine());
		
		repList.add(edIdx, rs); //수정하고 싶은 인덱스에 삽입한다.
		System.out.println();
	} //이 과정은 해당 인덱스의 객체를 수정하는 것과 동일한 효과를 가진다
	
	public void viewRep() //레퍼토리 목록을 출력
	{	
		for(int i = 0; i < repList.size(); i++) { //ArrayList의 크기만큼 반복한다
			System.out.println("Composer: " + repList.get(i).getComposer()); //getter 메소드에 접근하여 값을 출력
			System.out.println("Title: " + repList.get(i).getTitle());
			System.out.println("Genre: " + repList.get(i).getGenre());
			System.out.println("Performability: " + repList.get(i).getPerformability());
			System.out.println("Performed: " + repList.get(i).getPerformed());
			System.out.println();
		}
	}
	
	public ArrayList getRepList()
	{
		return this.repList;
	}
}
