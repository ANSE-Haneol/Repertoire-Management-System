package ClassProject;

import java.io.*;
import java.util.*;			

public class ManagerMain {
	static EventLogger logger = new EventLogger("Syslog.txt");
	
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		MusicManager musicManager = getObject("MusicManager.ser");
		if(musicManager == null) {
			musicManager = new MusicManager(in);
		}
		
		selectMenu(in, musicManager);
		putObject(musicManager, "MusicManager.ser");
	}
	
	public static void selectMenu(Scanner in, MusicManager musicManager)
	{
		int num = 1;
		while(num != 5) {
			try {
				showMenu();
				num = in.nextInt();
				if(num == 1) {
					musicManager.createRep();
					logger.log("added a repertoire.");
				}
				else if(num == 2) {
					musicManager.deleteRep();
					logger.log("deleted a repertoire.");
				}
				else if(num == 3) {
					musicManager.printMusic();
					logger.log("printed the repertoire list.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Please type a number.");
				System.out.println();
			}
		}
	}
	
	public static void showMenu()
	{
		System.out.println("1. Add Repertoire");
		System.out.println("2. Delete Repertoire");
		System.out.println("3. View Repertoire");
		System.out.println("4. Show menu");
		System.out.println("5. Exit");
		System.out.print("Enter a command number: ");
	}
	
	public static void putObject(MusicManager musicManager, String filename)
	{
		FileOutputStream file;
		try {
			file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(musicManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
	}
	
	public static MusicManager getObject(String filename) 
	{	
		MusicManager musicManager = null;
		FileInputStream file;
		try {
			file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			musicManager = (MusicManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return musicManager;
		} catch (IOException e) {
			
		} catch (ClassNotFoundException e) {

		}
		
		return musicManager;
	}
}