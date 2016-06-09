import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BlogController{
    MyConsole myConsole;
    Text text;
    File file;
  
    Name vorname = new Name("");
    Name nachname= new Name("");
    Wohnort wohnort= new Wohnort("");
    MyDatum datum= new MyDatum ("");
    Titel titel= new Titel ("");
    Content content= new Content("");
    Schlagwort schlagwort= new Schlagwort("");    

    public BlogController(){
        myConsole = new MyConsole();
        file = new File("blog.txt");
    }

    public Text erzeugen(){
    vorname = new Name(myConsole.input());
    nachname = new Name(myConsole.input());
    wohnort = new Wohnort(myConsole.input());
    datum = new MyDatum(myConsole.input());
    titel = new Titel(myConsole.input());
    content = new Content(myConsole.input());
    this.schlagwortInput();
    text = new Text(vorname, nachname, wohnort, datum, titel, content, schlagwort);
    return text;
    }

    public void schlagwortInput(){
        do {
            schlagwort = new Schlagwort((schlagwort.toString()) + myConsole.input());
        } while (!schlagwort.schlagwort.contains("exit"));
    }

    public void speichern(String e) throws IOException {
        FileWriter schreiber = new FileWriter(file,true);
        schreiber.write(e);
        schreiber.close();
    }
    public String toString(Text text) {
        return "" + vorname.toString() + ":" + nachname.toString() + ":" + wohnort.toString() + 
                ":" + datum.toString() + ":" + titel.toString() + ":" + content.toString() + ":" + schlagwort.toString();
    }
}