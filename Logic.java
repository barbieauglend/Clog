import java.io.*;

public class Logic {
    MyConsole myConsole;
    MyFile myFile;
    File file;
    Text text;
    public Logic() {
        myConsole = new MyConsole();
        myFile = new MyFile();
        file = new File("blog.txt");
        text = new Text();
    }
    public void gogogo() throws FileNotFoundException, IOException {
        while (true) {
            myConsole.FirstOutput();          
            switch (myConsole.inputFirst()) {
                case "1":
                    myFile.erzeugen();
                    break;
                case "2":
                    myFile.laden(file);
                    myFile.ausgeben();
                    break;
                case "3":
                    myFile.laden(file);
                    break;
                case "4":
                    myFile.speichern(text);
                    break;
                case "5":
                    System.exit(0);
                    break;
            }
        }
    }
}