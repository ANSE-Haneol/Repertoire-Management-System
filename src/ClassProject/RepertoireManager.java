package ClassProject;

import java.util.*;

public class RepertoireManager {
	private ArrayList<RepStatus> repList = new ArrayList<RepStatus>(); //RepStatus Ÿ���� �����ϴ� ArrayList�� ����
	
	private Scanner in = new Scanner(System.in);
	
	RepertoireManager() {
		
	}
	
	public void addRep() //�����丮�� �߰��Ѵ�
	{	
		RepStatus rs = new RepStatus(); //�켱 ��ü rs�� �ν��Ͻ�ȭ ���ְ�
		
		System.out.print("Enter the composer: "); //������ �Է¹ް�
		rs.setComposer(in.nextLine()); //rs�� setter �޼ҵ�鿡 �����Ͽ� ��ü ���� ���� �ٲ��ش�
		System.out.print("Enter the title: ");
		rs.setTitle(in.nextLine());
		System.out.print("Enter the genre: ");
		rs.setGenre(in.nextLine());
		System.out.print("Enter current performability: ");
		rs.setPeformability(in.nextLine());
		System.out.print("Have you ever performed it? ");
		rs.setPerformed(in.nextLine());
		
		repList.add(rs); //�� ��ü�� repList�� �߰��Ѵ�.
		
		System.out.println();
	}
	
	public void delRep() //�����丮�� �����Ѵ�
	{	
		System.out.print("Which index do you want to delete?: ");
		int delIdx = in.nextInt(); //����� ���� �ε����� �Է¹��� ��
		in.nextLine();
		
		repList.remove(delIdx); //ArrayList���� �ش� �ε����� ��ü�� �����
		System.out.println();
	}
	
	public void editRep() //�����丮�� �����Ѵ�
	{	
		RepStatus rs = new RepStatus(); //�켱 ��ü rs�� �ν��Ͻ�ȭ ���ְ�
		
		System.out.print("Which index do you want to edit?: ");
		int edIdx = in.nextInt(); //�����ϰ� ���� �ε����� �Է��Ѵ�
		repList.remove(edIdx);
		in.nextLine();
		
		System.out.print("Rename the composer: "); //�ٽ� ������ �޾�
		rs.setComposer(in.nextLine());
		System.out.print("Rename the title: ");
		rs.setTitle(in.nextLine());
		System.out.print("Re-enter the genre: ");
		rs.setGenre(in.nextLine());
		System.out.print("Re-enter current performability: ");
		rs.setPeformability(in.nextLine());
		System.out.print("Have you ever performed it? ");
		rs.setPerformed(in.nextLine());
		
		repList.add(edIdx, rs); //�����ϰ� ���� �ε����� �����Ѵ�.
		System.out.println();
	} //�� ������ �ش� �ε����� ��ü�� �����ϴ� �Ͱ� ������ ȿ���� ������
	
	public void viewRep() //�����丮 ����� ���
	{	
		for(int i = 0; i < repList.size(); i++) { //ArrayList�� ũ�⸸ŭ �ݺ��Ѵ�
			System.out.println("Composer: " + repList.get(i).getComposer()); //getter �޼ҵ忡 �����Ͽ� ���� ���
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
