import java.util.Scanner;

public class User {
	private String _clogTitle;
	private String _text;
	
	public User() {
	}
	Scanner input = new Scanner(System.in);
	PrintStream out = new PrintStream(System.out);
	public String saveClogTitle() {
		do {
		out.println("Please enter a title for your Clog entry");
		_clogTitle = input.nextLine();
		} while(_clogTitle == null || _clogTitle.equals(""));
		return _clogTitle;
	
	public String getClogText() {
		do {
		out.println("Please enter the content of your Clog entry");
		_text = input.nextLine();
		} while (_text == null || _text.equals(""));
		return _text;
	}
	public int readClog() {
		out.println("\n" +"Enter the number corresponding to the index of the clog entry");
		out.println("To read a Clog");
		Scanner number = new Scanner(System.in);
		int choice = number.nextInt();
		return choice;
	}
}