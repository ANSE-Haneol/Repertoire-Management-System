package ClassProject;

import java.util.*;

public class RepInfo extends Music {
	private ArrayList<Music> repList = new ArrayList<Music>(); //Music Ÿ���� �����ϴ� ArrayList�� ����
	private Scanner in = new Scanner(System.in);
	
	RepInfo() {
		
	}
	
	public void addRep() //�����丮�� �߰��Ѵ�
	{	
		Music m = new Music(); //�켱 ��ü m�� �ν��Ͻ�ȭ ���ְ�
		
		System.out.print("Enter the composer: "); //������ �Է¹ް�
		m.setComposer(in.nextLine()); //m�� setter �޼ҵ�鿡 �����Ͽ� �ν��Ͻ� ���� ���� �ٲ��ش�
		System.out.print("Enter the title: ");
		m.setTitle(in.nextLine());
		System.out.print("Enter the genre: ");
		m.setGenre(in.nextLine());
		
		repList.add(m); //�� ���� repList�� �߰��Ѵ�.
		
		System.out.println();
	}
	
	public void delRep() //�����丮�� �����Ѵ�
	{	
		System.out.print("Which index do you want to delete?: ");
		int delIdx = in.nextInt(); //����� ���� �ε����� �Է¹��� ��
		in.nextLine();
		
		repList.remove(delIdx); //ArrayList���� �ش� �ε��� ���� ���� �����
		System.out.println();
	}
	
	public void editRep() //�����丮�� �����Ѵ�
	{	
		Music m = new Music(); //�켱 ��ü m�� �ν��Ͻ�ȭ ���ְ�
		
		System.out.print("Which index do you want to edit?: ");
		int edIdx = in.nextInt(); //�����ϰ� ���� �ε����� �Է��Ѵ�
		repList.remove(edIdx);
		in.nextLine();
		
		System.out.print("Rename the composer: "); //�ٽ� ������ �޾�
		m.setComposer(in.nextLine());
		System.out.print("Rename the title: ");
		m.setTitle(in.nextLine());
		System.out.print("Re-enter the genre: ");
		m.setGenre(in.nextLine());
		
		repList.add(edIdx, m); //�����ϰ� ���� �ε����� �����Ѵ�.
		System.out.println();
	} //�� ������ �ش� �ε����� ���� �����ϴ� �Ͱ� ������ ȿ���� ������
	
	public void viewRep() //�����丮 ����� ���
	{	
		for(int i = 0; i < repList.size(); i++) { //ArrayList�� ũ�⸸ŭ �ݺ��Ѵ�
			System.out.print("Composer: ");
			System.out.println(repList.get(i).getComposer()); //�� Music Ÿ�� ��ü�� getter �޼ҵ�鿡 �����Ͽ� ���� �ҷ��´�
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
