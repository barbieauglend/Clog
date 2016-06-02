import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StartUp {
	/** Class runs the userinterface
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args){
		ClogConsole ui = new ClogConsole();
		ui.runConsole();
		
		Scanner in = new Scanner(System.in);
		PrintStream out = new PrintStream(System.out);
		
		do{
			out.println("Welcome to the Blog!");
		catch(FileNotFoundException e){
			out.println("You entered an invalid file name");
		}
		}
	}
}