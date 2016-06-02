import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Clog {
 
	private static ArrayList<ClogEntry> Entries;
	private static PrintStream out = new PrintStream(System.out);

	public Clog() {
		Entries = new ArrayList<ClogEntry>();
	}
	public void enterClogEntry(String clogTitle, String clogText) {
		String title = clogTitle;
		String text = clogText;
		PrintStream out = new PrintStream(System.out);
		ClogEntry clog = new ClogEntry(title,text);
		Entries.add(clog);
		out.println("\n Your entry has been successfully added!");
	}
	public void displayClogEntries() {
		for (ClogEntry clog: Entries) {
			out.print("\n");
			out.println(clog.Title());
		}
	}
	
	public static void readClogEntry(int chosenClog)  {
			ClogEntry clog = Entries.get(chosenClog -1);
			out.print(clog.getContent());
	}
		
	public static int getNumberofEntries() {
		return Entries.size();
	}	
	public static void saveClog(String file) throws FileNotFoundException {
		PrintWriter Clog = new PrintWriter(new File(file));
		for (ClogEntry clog : Entries) {
			Clog.print(clog.toString() + "\n");
		}
		
		out.println("\n" + "Please check your local folder for the saved entries /");
		out.println("Por favor revise su carpeta local para las entradas guardadas");
		
		out.println("\n" + "Thank you for visiting the clog/ Gracias por visitar el clog");
		/**
		 * closing printwriter as pointer is at end
		 */
		Clog.close();
		
	}
	
	/**
	 * User inputs file. It must exists(previously saved) or an exception is thrown
	 * information is consequently easy to access as the format is essentially programmer defined.
	 * @param savedClogs
	 * @throws FileNotFoundException
	 */
	public static void loadClog(File savedClogs) throws FileNotFoundException {
		
		Scanner readSource = new Scanner(savedClogs);
		
		while (readSource.hasNextLine()) {
			
			String entryTitle = readSource.nextLine();
			
			if (!entryTitle.isEmpty()){
				
				String entryContent = readSource.nextLine();
			
				ClogEntry b = new ClogEntry(entryTitle,entryContent);
			
			
			while (readSource.hasNextLine()) {
				
				String comment=readSource.nextLine();
				
				if (comment.isEmpty()) {
					break;
				}
				else {
					b.addComment(comment);
					
				}
			}
			
			Entries.add(b);
			}
			
		}
	}
	

	
	
	
}