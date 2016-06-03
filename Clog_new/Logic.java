
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Logic {

    MyConsole myConsole;
    MyFile myFile;
    BlogController blogController;
    Text text;
    ArrayList<Text> Entries;
    File file;

    public Logic() {
        myConsole = new MyConsole();
        myFile = new MyFile();
        blogController = new BlogController();
        text = new Text();
        file = new File("blog.txt");
    }

    public void gogogo() throws FileNotFoundException, IOException {
        while (true) {
            myConsole.FirstOutput();          
            switch (myConsole.inputFirst()) {
                case "1":
                    erzeugen();
                    break;
                case "2":
                    ausgeben();
                    break;
                case "3":
                    laden(file);
                    break;
                case "4":
                    speichern();
                    break;
                case "5":
                    System.exit(0);
                    break;
            }

        }
    }

    private void erzeugen() {
        myConsole.TextOutput();
        blogController.erzeugen();
    }

    private void ausgeben() {
        myConsole.output(text.toString());
    }

    public void laden(File file) throws FileNotFoundException {
        	Scanner readSource = new Scanner(file);
			}
	    
        /*String load = myFile.load();
        System.out.println("fff"+load);
        String[] loadArray = load.split(":");
        if(loadArray[0] != null){
            text = new Text(loadArray[0],loadArray[1],loadArray[2],loadArray[3],loadArray[4],loadArray[5]);
            text.setSchlagwort(loadArray[6]);
        }*/ 
    private void speichern() throws IOException {
        //laden(file);
        FileWriter schreiber = new FileWriter(file);
        schreiber.write(text.toString());
        schreiber.close();
    }
}