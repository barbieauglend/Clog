public class Text {

    Name vorname = new Name("");
    Name nachname= new Name("");
    Wohnort wohnort= new Wohnort("");
    Datum datum= new Datum (1,1,2000);
    Titel titel= new Titel ("");
    Content text= new Content("");
    Schlagwort schlagwort= new Schlagwort("");    
    
    public Text(){};
    
    public Text(Name vornamein, Name nachnamein,
            Wohnort wohnortin,
            Datum datumin,
            Titel titelin,
            Content textin) {
        vorname = vornamein;
        nachname = nachnamein;
        wohnort = wohnortin;
        datum = datumin;
        titel = titelin;
        text = textin;
        
    }

    @Override
    public String toString() {
        return "" + vorname + "\n" + nachname + "\n" + wohnort + "\n" + datum + "\n" + titel + "\n" + text+ "\n" + schlagwort;
    }
    public String toSave() {
        return "" + vorname + ":" + nachname + ":" + wohnort + ":" + datum + ":" + titel + ":" + text+ ":" + schlagwort;
    }
    public void setSchlagwort(Schlagwort schlagwortin) {
        schlagwort = schlagwortin;
    }
}