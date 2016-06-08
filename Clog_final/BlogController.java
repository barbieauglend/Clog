import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class BlogController{
    MyConsole myConsole;
    File file;
    public BlogController(){
        myConsole = new MyConsole();
        file = new File("blog.txt");
    }
    public String erzeugen(){
        String text = "";
    do {
            text = text + myConsole.input();
        } while (!text.contains("exit"));
    return text;
    }
    public void speichern(String e) throws IOException {
        FileWriter schreiber = new FileWriter(file,true);
        schreiber.write(e);
        schreiber.close();
    }
}