public class BlogController{

    MyConsole myConsole;
    Text text;
    
    Name vorname = new Name("");
    Name nachname= new Name("");
    Wohnort wohnort= new Wohnort("");
    MyDatum datum= new MyDatum ("");
    Titel titel= new Titel ("");
    Content content= new Content("");
    Schlagwort schlagwort= new Schlagwort("");    
    
    public BlogController(){
        myConsole = new MyConsole();
    }
    
    public Text erzeugen(){
    vorname = new Name(myConsole.input());
    nachname = new Name(myConsole.input());
    wohnort = new Wohnort(myConsole.input());
    datum = new MyDatum(myConsole.input());
    titel = new Titel(myConsole.input());
    content = new Content(myConsole.input());
    text = new Text(vorname, nachname, wohnort, datum, titel, content);
    
    return text;
    }
}
