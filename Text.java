public class Text {
    Name vorname = new Name("");
    Name nachname = new Name("");
    Wohnort wohnort = new Wohnort("");
    MyDatum datum = new MyDatum ("");
    Titel titel = new Titel ("");
    Content content = new Content("");
    Schlagwort schlagwort = new Schlagwort("");  
    
    public Text(){
    }
    
    public Text(Name vornamein, Name nachnamein,
            Wohnort wohnortin,
            MyDatum datumin,
            Titel titelin,
            Content contentin, 
            Schlagwort schlagwortin) {
        vorname = vornamein;
        nachname = nachnamein;
        wohnort = wohnortin;
        datum = datumin;
        titel = titelin;
        content = contentin; 
        schlagwort = schlagwortin;
    }
    public String toSave(Text textT) {
        return "" + vorname.toString() + ":" + nachname.toString() + ":" + wohnort.toString() + 
                ":" + datum.toString() + ":" + titel.toString() + ":" + content.toString() + ":" + schlagwort.toString();
    }
    public void setSchlagwort(Schlagwort schlagwortin) {
        schlagwort = schlagwortin;
    }
}
