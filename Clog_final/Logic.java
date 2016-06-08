import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.IOException;

public class Logic {
    MyConsole myConsole;
    Text text;
      public Logic() {
        myConsole = new MyConsole();
        text = new Text();
    }
    public void gogogo() throws FileNotFoundException, IOException {
        while (true) {
            myConsole.FirstOutput();          
            switch (myConsole.inputFirst()) {
                case "1":
                    text.erzeugen();
                    break;
                case "2":
                    text.laden();
                    text.ausgeben();
                    break;
                case "3":
                    text.laden();
                    break;
                case "4":
                    text.speichern();
                    break;
                case "5":
                    System.exit(0);
                    break;
            }
        }
    }
}