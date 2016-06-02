import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Blog {
	private static ArrayList<BlogEntry> Entries;
        
        public Blog() {		
		Entries = new ArrayList<BlogEntry>();
	}
	public void enterBlogEntry(Titel blogTitle, Text blogText) {
		Titel t = blogTitle;
		Text c = blogText;
		BlogEntry b = new BlogEntry(t,c);
		Entries.add(b);
		System.out.println("\n Your entry has been successfully added!/ Su entrada ha sido agregado con Žxito!");
	}
	public void displayBlogEntries() {
                for (BlogEntry b: Entries) {
			out.print("\n");
			//TODO out.println(blog.Titel());
		}
	}
	public static void readBlogEntry(int chosenBlog)  {
			BlogEntry b = Entries.get(chosenBlog -1);
			//TODO out.print(b.getContent());
	}
	public static void saveBlog(String f) throws FileNotFoundException {
            loadBlog("blog.txt");
            PrintWriter Blog = new PrintWriter(new File(blog.txt));
		for (BlogEntry b : Entries) {
			Blog.print(b.toString() + "\n");
		}
		out.println("\n" + "Please check your local folder for the saved entries /");
		
		blog.close();
	}
	public static void loadBlog(File savedBlogs) throws FileNotFoundException {
        	Scanner readSource = new Scanner(savedBlogs);
			}
			
		}
