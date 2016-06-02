
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Logic {

    MyConsole myConsole;
    MyFile myFile;
    BlogController blogController;
    Text text;
    ArrayList<Text> Entries;

    public Logic() {
        myConsole = new MyConsole();
        myFile = new MyFile();
        blogController = new BlogController();
        text = new Text();
    }

    public void gogogo() {
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
                    laden();
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
        /*text = new Text(myConsole.input(),
                myConsole.input(),
                myConsole.input(),
                myConsole.input(),
                myConsole.input(),
                myConsole.input());
        String temp = "";
        do {
            temp = temp + myConsole.input();
        } while (!temp.contains("exit"));
        text.setSchlagwort(temp);*/

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
    }

    private void speichern() {
        laden("blog.txt");
        //TODO MyFile.save(text);
        out.println("\n" + "Der Text wurde gespeichert/");
    }