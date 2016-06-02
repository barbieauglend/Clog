import java.util.Scanner;
import java.io.PrintStream;

public class MyConsole {

    PrintStream out = new PrintStream(System.out);
    
    public void FirstOutput() {
        out.println("1. Clog Eintrag Erzeugen");
        out.println("2. Clog ausgeben");
        out.println("3. Clog laden");
        out.println("4. Clog speichern");
        out.println("5. Programm beenden");
        out.println("Bitte Option eingeben: ");
    }
    public void output(String text) {
        out.println(text);
    }

    public String inputFirst() {
        Scanner scanInput = new Scanner(System.in);
        return scanInput.nextLine();

    }

    public String input() {
        Scanner scanInput = new Scanner(System.in);
        return scanInput.nextLine();
    }
    
    public void TextOutput() {
        out.println("Bitte geben sie in der Reihenfolge");
        out.println("Vorname, Nachname, Wohnort, Datum (dd.mm.yyyy)");
        out.println(", Titel und dann den Text ein: ");
        }
}