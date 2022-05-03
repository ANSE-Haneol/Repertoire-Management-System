package ClassProject;

import java.util.*;

public class RepertoireManager {
	protected ArrayList<BaroqueRepertoire> brList = new ArrayList<BaroqueRepertoire>(); //�� Ŭ������ ���� ArrayList�� ����
	protected ArrayList<ClassicalRepertoire> crList = new ArrayList<ClassicalRepertoire>();
	protected ArrayList<RomanticRepertoire> rrList = new ArrayList<RomanticRepertoire>();
	
	private Scanner in = new Scanner(System.in);
	
	RepertoireManager() {
		
	}
	
	public void addRep(BaroqueRepertoire br) //�����丮�� �߰��Ѵ�
	{	
		
		System.out.print("Enter the composer: "); //������ �Է¹ް�
		br.setComposer(in.nextLine()); 
		System.out.print("Enter the title: ");
		br.setTitle(in.nextLine());
		System.out.print("Enter the genre: ");
		br.setGenre(in.nextLine());
		
		brList.add(br); //�� ��ü�� �ش� ��ü�� ����Ʈ�� �߰��Ѵ�
		
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
	
	public void delRep(int era) //�����丮�� �����Ѵ�
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
	
	public void editRep(BaroqueRepertoire br) //�����丮�� �����Ѵ�
	{			
		System.out.print("Which index do you want to edit?: ");
		int edIdx = in.nextInt(); //�����ϰ� ���� �ε����� �Է��Ѵ�
		brList.remove(edIdx);
		in.nextLine();
		
		System.out.print("Rename the composer: "); //�ٽ� ������ �޾�
		br.setComposer(in.nextLine());
		System.out.print("Rename the title: ");
		br.setTitle(in.nextLine());
		System.out.print("Re-enter the genre: ");
		br.setGenre(in.nextLine());
		
		brList.add(edIdx, br); //�����ϰ� ���� �ε����� �����Ѵ�.
		System.out.println();
	} //�� ������ �ش� �ε����� ��ü�� �����ϴ� �Ͱ� ������ ȿ���� ������
	
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
	
	public void viewRep() //�����丮 ����� ���
	{	
		for(int i = 0; i < brList.size(); i++) { //ArrayList�� ũ�⸸ŭ �ݺ��Ѵ�
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
