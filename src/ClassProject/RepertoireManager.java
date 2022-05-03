package ClassProject;

import java.util.*;

public class RepertoireManager {
	protected ArrayList<BaroqueRepertoire> brList = new ArrayList<BaroqueRepertoire>(); //각 클래스에 대한 ArrayList를 생성
	protected ArrayList<ClassicalRepertoire> crList = new ArrayList<ClassicalRepertoire>();
	protected ArrayList<RomanticRepertoire> rrList = new ArrayList<RomanticRepertoire>();
	
	private Scanner in = new Scanner(System.in);
	
	RepertoireManager() {
		
	}
	
	public void addRep(BaroqueRepertoire br) //레퍼토리를 추가한다
	{	
		
		System.out.print("Enter the composer: "); //값들을 입력받고
		br.setComposer(in.nextLine()); 
		System.out.print("Enter the title: ");
		br.setTitle(in.nextLine());
		System.out.print("Enter the genre: ");
		br.setGenre(in.nextLine());
		
		brList.add(br); //그 객체를 해당 객체의 리스트에 추가한다
		
		System.out.println();
	}
	
	public void addRep(ClassicalRepertoire cr)
	{	
		
		System.out.print("Enter the composer: "); 
		cr.setComposer(in.nextLine()); 
		System.out.print("Enter the title: ");
		cr.setTitle(in.nextLine());
		System.out.print("Enter the genre: ");
		cr.setGenre(in.nextLine());
		
		crList.add(cr);
		
		System.out.println();
	}
	
	public void addRep(RomanticRepertoire rr)
	{	
		
		System.out.print("Enter the composer: ");
		rr.setComposer(in.nextLine());
		System.out.print("Enter the title: ");
		rr.setTitle(in.nextLine());
		System.out.print("Enter the genre: ");
		rr.setGenre(in.nextLine());
		
		rrList.add(rr);
		
		System.out.println();
	}
	
	public void delRep(int era) //레퍼토리를 삭제한다
	{	
		System.out.print("Which index do you want to delete?: ");
		int delIdx = in.nextInt();
		in.nextLine();
		
		if(era == 1) {
			brList.remove(delIdx); 
		}
		else if(era == 2) {
			crList.remove(delIdx);
		}
		else if(era == 3) {
			rrList.remove(delIdx);
		}
		
		System.out.println();
	}
	
	public void editRep(BaroqueRepertoire br) //레퍼토리를 수정한다
	{			
		System.out.print("Which index do you want to edit?: ");
		int edIdx = in.nextInt(); //수정하고 싶은 인덱스를 입력한다
		brList.remove(edIdx);
		in.nextLine();
		
		System.out.print("Rename the composer: "); //다시 값들을 받아
		br.setComposer(in.nextLine());
		System.out.print("Rename the title: ");
		br.setTitle(in.nextLine());
		System.out.print("Re-enter the genre: ");
		br.setGenre(in.nextLine());
		
		brList.add(edIdx, br); //수정하고 싶은 인덱스에 삽입한다.
		System.out.println();
	} //이 과정은 해당 인덱스의 객체를 수정하는 것과 동일한 효과를 가진다
	
	public void editRep(ClassicalRepertoire cr)
	{			
		System.out.print("Which index do you want to edit?: ");
		int edIdx = in.nextInt(); 
		crList.remove(edIdx);
		in.nextLine();
		
		System.out.print("Rename the composer: "); 
		cr.setComposer(in.nextLine());
		System.out.print("Rename the title: ");
		cr.setTitle(in.nextLine());
		System.out.print("Re-enter the genre: ");
		cr.setGenre(in.nextLine());
		
		crList.add(edIdx, cr);
		System.out.println();
	} 
	
	public void editRep(RomanticRepertoire rr) 
	{			
		System.out.print("Which index do you want to edit?: ");
		int edIdx = in.nextInt();
		rrList.remove(edIdx);
		in.nextLine();
		
		System.out.print("Rename the composer: "); 
		rr.setComposer(in.nextLine());
		System.out.print("Rename the title: ");
		rr.setTitle(in.nextLine());
		System.out.print("Re-enter the genre: ");
		rr.setGenre(in.nextLine());
		
		rrList.add(edIdx, rr); 
		System.out.println();
	} 
	
	public void viewRep() //레퍼토리 목록을 출력
	{	
		for(int i = 0; i < brList.size(); i++) { //ArrayList의 크기만큼 반복한다
			brList.get(i).printMusic();
		}
		
		for(int i = 0; i < crList.size(); i++) {
			crList.get(i).printMusic();
		}
		
		for(int i = 0; i < rrList.size(); i++) {
			rrList.get(i).printMusic();
		}
	}
	
	public ArrayList getRepList(int era)
	{
		if(era == 1) {
			return brList;
		}
		else if(era == 2) {
			return crList;
		}
		else {
			return rrList;
		}
	}
}
