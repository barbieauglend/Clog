import java.io.PrintStream;
import java.util.Scanner;

public class User {
	
	private Titel blogTitle;
	private Text text;
	
	public User() {
		
	}
	
	Scanner input = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);

        public Titel getBlogTitle() {
		out.println("Geben Sie ein Titel ein: ");
		blogTitle = new Titel(input.nextLine());
		return blogTitle;}
	
	public Text getBlogText() {
                out.println("Schreiben Sie den Text: ");
		text = new Text(input.nextLine());
		return text;}
        
	public int readBlog() {
            out.println("\n" +"Enter the number corresponding to the index of the blog entry");
            out.println("To read a blog");
            Scanner number = new Scanner(System.in);
            int choice = number.nextInt();
            return choice;}
}
