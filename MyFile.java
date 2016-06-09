import java.io.*;
import java.util.Scanner;

public class MyFile {
    MyConsole myConsole;
    BlogController blogController;
    Text text;
    File file;
     
    
    public MyFile(){
        myConsole = new MyConsole();
        blogController = new BlogController();
        text = new Text();
        file = new File("blog.txt");
     }   
        
    public void erzeugen() throws IOException {
        myConsole.TextOutput();
        text = blogController.erzeugen();
        speichern(text);        
    }
    
    public void ausgeben() {
        //myConsole.Nachfrage();
        //String gesucht = myConsole.input();
        //if(text.schlagwort.toString().equals(gesucht)){
        String stext = blogController.toString(text);
        myConsole.output(stext);
    }
    
    public void laden(File file) throws FileNotFoundException {
       	Scanner readSource = new Scanner(file);
    }
    
    public void speichern(Text text) throws IOException {
        String e = text.toString();
        blogController.speichern(e);
    }
}
