import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Text {
    MyConsole myConsole;
    BlogController blogController;
    ArrayList<String> Entries;
    File file; 
    
    public Text(){
        myConsole = new MyConsole();
        blogController = new BlogController();
        Entries = new ArrayList <String>();
        file = new File("blog.txt");
    }
   public void erzeugen() {
        String text;
        myConsole.TextOutput();
        text = blogController.erzeugen();
        Entries.add(text);
    }
    public void ausgeben() {
        Iterator <String> itr = Entries.iterator();
        do{
            myConsole.output(itr.next());
        } while(itr.hasNext());
    }
    public void laden() throws FileNotFoundException {
        file = new File("blog.txt");
        Scanner readSource = new Scanner(file);
			}
    public void speichern()throws IOException {
        String e = Entries.toString();
        blogController.speichern(e);
    }
}
