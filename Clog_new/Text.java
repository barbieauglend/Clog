public class Text {

    Name vorname = new Name("");
    Name nachname= new Name("");
    Wohnort wohnort= new Wohnort("");
    MyDatum datum= new MyDatum ("");
    Titel titel= new Titel ("");
    Content content = new Content("");
    Schlagwort schlagwort= new Schlagwort("");    
    
    public Text(){
    };
    
    public Text(Name vornamein, Name nachnamein,
            Wohnort wohnortin,
            MyDatum datumin,
            Titel titelin,
            Content contentin) {
        vorname = vornamein;
        nachname = nachnamein;
        wohnort = wohnortin;
        datum = datumin;
        titel = titelin;
        content = contentin;        
    }

//    @Override
    public String toString(Text text) {
        return text.toString();
    }
    public String toSave(Text textT) {
        String text = toString(textT);
        return text;//"" + vorname + ":" + nachname + ":" + wohnort + ":" + datum + ":" + titel + ":" + text+ ":" + schlagwort;
    }
    /*public void setSchlagwort(Schlagwort schlagwortin) {
        schlagwort = schlagwortin;
    }*/
}