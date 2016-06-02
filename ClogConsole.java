import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
/**
 * Class handles the external interaction with the User
 * Clog is passed as an instance variable and initialized in constructor
 * A user object is also created as it is indirectly part of the interface
 */
public class ClogConsole {
	
	private Clog clog;

	public ClogConsole() {
			clog = new Clog();
			}
		/**
		 * Essentially calling methods written in the Clog class
		 * @throws FileNotFoundException
		 */
		public void runConsole() throws FileNotFoundException { 
			
			Scanner in = new Scanner(System.in);
			PrintStream out = new PrintStream(System.out);
			User you = new User();
			int choice;
			
			do {
				 /**
				  * Command line prompts to the user
				  */
				 out.println("1. Clog Eintrag Erzeugen");
				 out.println("2. Clog ausgeben");
				 out.println("3. Clog laden");
				 out.println("4. Clog speichern");
				 out.println("5. Programm beenden");
				 choice = in.nextInt();
				 in.nextLine();
			}
			
			switch (choice) {
            case 1:
                clog.enterClogEntry(you);
                break;
            case 2:
                clog.displayClogEntries(you);
                break;
            case 3:
            	out.println("Please enter the name of the file you would like to load");
            	String loadName = in.nextLine();
            	validFile=true;
            	catch (Exception e){
					validFile=false;
				}
				} while (!validFile);
				continue;
                clog.loadClog(loadName);
                break;
            case 4:
            	out.println("Please enter the name of the file you would like to save on");
            	String name = in.nextLine();
				Blog.saveClog(name);
                clog.saveClog(you);
                break;
            case "5":
                System.exit(0);
                break;
			
	}