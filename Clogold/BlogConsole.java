import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;

public class BlogConsole {
    
    private Blog blog;
		
    public BlogConsole() {
        blog = new Blog();}
        int choice;
    public void runInterface() throws FileNotFoundException { 
        Scanner in = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
	User you = new User();
	out.println ("1: Clog Eintrag erzeugen, 2: Clog ausgeben, 3: Clog laden , 4: Clog speichern, 5: Programm beenden");
        choice = in.nextInt();
	in.nextLine();
        switch (choice) {
                case 1:
                    blog.enterBlogEntry(you.getBlogTitle(),you.getBlogText());
                    break;
                case 2:
                    blog.displayBlogEntries();;
                    break;
                case 3:
                    blog.loadBlog(new File("blog.txt"));
                    break;
                case 4:
                    blog.saveBlog("blog.txt");
                    break;
                case 5:
                    System.exit(0);
                    break;
	}
    }
}